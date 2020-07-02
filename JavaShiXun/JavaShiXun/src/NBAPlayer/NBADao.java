/**
 * 
 */
package NBAPlayer;

import java.util.ArrayList;
import java.util.List;

import DVD3.JDBCUtil;

/**
*  @Description     球员操作
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月2日下午9:33:13
*/
public class NBADao 
{
	JDBCUtil jdbc = new JDBCUtil();
	//查询
	public List<List<Object>> queryAllPlayer()
	{
		List<List<Object>> query = jdbc.query("select * from NBAPlayer", null);
		return query;
	}
	//根据借阅次数从大到小查看
	public List<List<Object>> queryHighest()
	{
		return jdbc.query("select * from NBAPlayer order by Highest desc", null);
	}
	public List<List<Object>> queryAgera()
	{
		return jdbc.query("select * from NBAPlayer order by averaged desc", null);
	}
	//根据编号查询
	public List<List<Object>> queryAByID(int id)
	{
		List<Object> list = new ArrayList<Object>();
		list.add(id);
		return jdbc.query("select * from NBAPlayer where id = ?", list);
	}
	//借阅
	public int borrow(int id,String name)
	{
		List<Object> list = new ArrayList<Object>();
		list.add(name);
		list.add(id);
		return jdbc.update("update NBAPlayer set Jersey = 1,People = ? where id = ?", list);
	}
	public int returnNBA(int id)
	{
		List<Object> list = new ArrayList<Object>();
		list.add(id);
		return jdbc.update("update NBAPlayer set Jersey = 0,People = '' where id = ?", list);
	}
	//新增
	public int AddNBA(String name1,String name2,int num,String team,String select,String site,Double height,Double weight,Double aver,int high,String act)
	{
		List<Object> list = new ArrayList<Object>();
		list.add(name1);
		list.add(name2);
		list.add(num);
		list.add(team);
		list.add(select);
		list.add(site);
		list.add(height);
		list.add(weight);
		list.add(aver);
		list.add(high);
		list.add(act);
		
		return jdbc.update("insert into NBAPlayer values(null,?,?,?,?,?,?,?,?,?,?,?,0,'')", list);
	}
	public int DeleteNBA(int id)
	{
		List<Object> list = new ArrayList<Object>();
		list.add(id);
		return jdbc.update("delete from NBAPlayer where id = ?", list);
	}
}
