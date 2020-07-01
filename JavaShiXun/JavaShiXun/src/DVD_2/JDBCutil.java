/**
 * 
 */
package DVD_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;

/**
*  @Description     JDBD类
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月1日下午4:57:11
*/
public class JDBCutil 
{
	public int update(String sql,List<Object> list) 
	{
		try {
			//1、加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			//2、获取连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/homework","root","sunhao2268411762");
			//3、预执行
			PreparedStatement ps = conn.prepareStatement(sql);

			int row = 0;
			boolean flag = false;
			//4、执行

			if(list != null)
			{
				for(int i = 0;i < list.size();i++)
				{
					ps.setObject(i + 1, list.get(i));
				}
			}
			else
			{
				flag = true;
				java.sql.ResultSet ret = ps.executeQuery();
				System.out.println("编号\t名字\t价格\t出版社\t借阅状态\t借阅人\t借阅日期\t\t借阅次数");
				String s = "空";
				while(ret.next())
				{
					if(null == ret.getString(7))
					{
						System.out.println(ret.getInt(1) + "\t" + ret.getString(2) + "\t" + ret.getDouble(3) + "\t" + ret.getString(4) + "\t" + ret.getInt(5) + "\t" + ret.getString(6) + "\t" + s + "\t\t" + ret.getInt(8));
					}
					else
					{
						System.out.println(ret.getInt(1) + "\t" + ret.getString(2) + "\t" + ret.getDouble(3) + "\t" + ret.getString(4) + "\t" + ret.getInt(5) + "\t" + ret.getString(6) + "\t" + ret.getString(7) + "\t\t" + ret.getInt(8));
					}
					
				}
			}
			
			if(flag != true)
			{
				row = ps.executeUpdate();
			}

			//5、释放
			ps.close();
			conn.close();
			return row;

			

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return 0;
		}
	}
}
