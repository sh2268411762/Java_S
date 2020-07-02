/**
 * 
 */
package NBAPlayer;

import java.util.ArrayList;
import java.util.List;

import NBAPlayer.JDBCUtil;

/**
*  @Description     登录
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月2日下午9:32:13
*/
@SuppressWarnings("unused")
public class DAONba 
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
