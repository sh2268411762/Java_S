/**
 * 
 */
package DVD3;

import java.util.ArrayList;
import java.util.List;

/**
*  @Description     数据库操作
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月2日下午1:08:35
*/
public class DAODvd3 
{
	public List<List<Object>> login(String name,String password)
	{
		JDBCUtil jdbc = new JDBCUtil();
		List<Object> list = new ArrayList<Object>();
		list.add(name);
		list.add(password);
		List<List<Object>> query = jdbc.query("select * from 用户表（登录） where user = ? and password =?", list);
		
		return query;
	}
}
