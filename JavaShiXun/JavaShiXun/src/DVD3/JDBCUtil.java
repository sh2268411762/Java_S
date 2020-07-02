/**
 * 
 */
package DVD3;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
/**
*  @Description     JDBD类——增删改、查
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月2日下午12:17:39
*/
public class JDBCUtil 
{	
	public int update(String sql,List<Object> list) {
		try {
			//1、
			Class.forName("com.mysql.jdbc.Driver");
			//2、
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/homework","root","sunhao2268411762");
			//3、
			PreparedStatement ps = conn.prepareStatement(sql);
			if(list!=null) {
				for(int i =0;i<list.size();i++) {
					ps.setObject(i+1,list.get(i));
				}
			}
			
			int row = ps.executeUpdate();
			
			ps.close();
			conn.close();
			
			return row;
		} catch (Exception e) {
			e.printStackTrace();
			return 0;
		}
	}
	
	//查的封装
	public List<List<Object>> query(String sql,List<Object> list) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/homework","root","sunhao2268411762");
			
			PreparedStatement ps = conn.prepareStatement(sql);
			if(list!=null) {
				for(int i =0;i<list.size();i++) {
					ps.setObject(i+1,list.get(i));
				}
			}
			
			ResultSet ret = ps.executeQuery();
			//定义二维数组，一张表格
			List<List<Object>> table = new ArrayList<List<Object>>();
			while(ret.next()) {//执行次数为行数
				//定义一维数组，一行
				List<Object> row = new ArrayList<Object>();
				//获取结果集中列的个数
				int columnCount = ret.getMetaData().getColumnCount();
				//将一行填充完成
				for(int i = 1;i<= columnCount;i++) {//执行次数为列数
					row.add(ret.getObject(i));
				}
				//将当前行放入表格
				table.add(row);
			}
			
			ret.close();
			ps.close();
			conn.close();
			
			return table;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
	}
}
