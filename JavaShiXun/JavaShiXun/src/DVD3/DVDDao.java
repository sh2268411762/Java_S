/**
 * 
 */
package DVD3;

import java.util.ArrayList;
import java.util.List;

/**
*  @Description     dvd操作
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月2日下午1:55:40
*/
public class DVDDao 
{
	JDBCUtil jdbc = new JDBCUtil();
	//查询
	public List<List<Object>> queryAllDvd()
	{
		List<List<Object>> query = jdbc.query("select * from dvd", null);
		return query;
	}
	//根据借阅次数从大到小查看
	public List<List<Object>> queryAByBor()
	{
		return jdbc.query("select * from dvd order by times desc", null);
	}
	//根据编号查询
	public List<List<Object>> queryAByID(int id)
	{
		List<Object> list = new ArrayList<Object>();
		list.add(id);
		return jdbc.query("select * from dvd where id = ?", list);
	}
	//借阅
	public int borrow(int id,String name,String date)
	{
		List<Object> list = new ArrayList<Object>();
		list.add(name);
		list.add(date);
		list.add(id);
		return jdbc.update("update dvd set state = 1,borname = ?,bordate = ?,times = times + 1 where id = ?", list);
	}
	public int returnDVD(int id)
	{
		List<Object> list = new ArrayList<Object>();
		list.add(id);
		return jdbc.update("update dvd set state = 0,borname = '',bordate = null where id = ?", list);
	}
	//新增
	public int AddDvd(String name,Double price,String pub)
	{
		List<Object> list = new ArrayList<Object>();
		list.add(name);
		list.add(price);
		list.add(pub);
		return jdbc.update("insert into dvd values(null,?,?,?,0,'',null,0)", list);
	}
	public int DeleteDvd(int id)
	{
		List<Object> list = new ArrayList<Object>();
		list.add(id);
		return jdbc.update("delete from dvd where id = ?", list);
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
