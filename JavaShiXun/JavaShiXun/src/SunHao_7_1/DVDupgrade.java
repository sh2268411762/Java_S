/**
 * 
 */
package SunHao_7_1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;
import com.mysql.jdbc.ResultSet;
import java.sql.Statement;

/**
*  @Description     DVD升级版
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月1日上午10:29:36
*/
public class DVDupgrade 
{
	static Scanner sc = new Scanner(System.in);
	public static void menu()
	{
		System.out.println("请选择：");
		System.out.println("1、输入DVD信息（增）");
		System.out.println("2、删除DVD信息（删）");
		System.out.println("3、借阅DVD信息（改）");
		System.out.println("4、归还DVD信息（改）");
		System.out.println("5、查看DVD信息（查）");
		System.out.println("0、退出程序");
		System.out.println("请输入【0-5】:");
	}
	public static void Add(Connection c)
	{
		System.out.println("新增DVD：");
		System.out.println("请输入dvd的名字：");
		String name = sc.next();
		System.out.println("请输入dvd的价格：");
		double price = sc.nextDouble();
		System.out.println("请输入dvd的出版社：");
		String publish = sc.next();
		PreparedStatement ps;
		try {
			ps = c.prepareStatement("insert into dvd values(null,?,?,?,0,'',null,0)");
			ps.setString(1, name);
			ps.setDouble(2, price);
			ps.setString(3,publish);
			
			int row = ps.executeUpdate();
			if(row >= 1)
			{
				System.out.println("新增成功！");
			}
			else
			{
				System.out.println("新增失败！");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Print(Connection c)
	{
		try {
			PreparedStatement ps = c.prepareStatement("select * from dvd");
			java.sql.ResultSet ret = ps.executeQuery();
			System.out.println("编号\t名字\t价格\t出版社\t借阅状态\t借阅人\t借阅日期\t\t借阅次数");
			while(ret.next())
			{
				System.out.println(ret.getInt(1) + "\t" + ret.getString(2) + "\t" + ret.getDouble(3) + "\t" + ret.getString(4) + "\t" + ret.getInt(5) + "\t" + ret.getString(6) + "\t" + ret.getString(7) + "\t\t" + ret.getInt(8));
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Delete(Connection c)
	{
		System.out.println("请输入要删除的编号：");
		int del = sc.nextInt();
		try {
			PreparedStatement ps = c.prepareStatement("delete from dvd where id = ?");
			boolean flag = false;
					ps.setInt(1, del);
					int row = ps.executeUpdate();
					if(row == 1)
					{
						System.out.println("删除成功！");
						flag = true;
					}
					else
					{
						System.out.println("删除失败！");
					}
			if(flag == false)
			{
				System.out.println("没有编号为" + del + "的DVD");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Get(Connection c,int id)
	{
		try {
			System.out.println("请输入借阅人姓名：");
			String name = sc.next();
			System.out.println("请输入借阅日期：");
			String date = sc.next();
			PreparedStatement ps= c.prepareStatement("update dvd set state = 1,borName = ?,borDate = ?,times = times + 1 where id = ?");
			ps.setInt(3, id);
			ps.setString(1, name);
			ps.setString(2, date);
			int row = ps.executeUpdate();
			if(row >= 1)
			{
				System.out.println("借阅成功！");						
			}
			else
			{
				System.out.println("借阅失败！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public static void Return(Connection c,int id)
	{
		PreparedStatement ps;
		try {
			ps = c.prepareStatement("update dvd set state = 0,borName = '',borDate = null where id = ?");
			ps.setInt(1, id);
			int row = ps.executeUpdate();
			if(row >= 1)
			{
				System.out.println("归还成功！");						
			}
			else
			{
				System.out.println("归还失败！");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	
	
	
	
	public static void main(String[] args) 
	{
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/homework","root","sunhao2268411762");
			boolean flag = false;
			if(conn != null)
			{
				System.out.println("Java连接mysql成功！\n");
				flag = true;
			}
			else
			{
				System.out.println("Java连接mysql失败！");
			}
			
			if(flag == true)
			{
				menu();
				int input = sc.nextInt();
				do
				{
					switch(input)
					{
					case 1:
						System.out.println("开始新增：");
						Add(conn);
						System.out.println("新增完成！\n");
						break;
						
					case 2:
						System.out.println("开始删除：");
						Delete(conn);
						System.out.println("删除完成！");
						break;
						
					case 3:
						System.out.println("请输入要借阅的DVD编号：");
						int id = sc.nextInt();
						Get(conn,id);
						System.out.println("借阅完成！");
						break;
						
					case 4:
						System.out.println("请输入要归还的编号：");
						int num = sc.nextInt();
						Return(conn,num);
						break;
						
					case 5:
						System.out.println("开始显示：\n");
						Print(conn);
						System.out.println("显示完成！\n");
						break;
						
					case 0:
						conn.close();
						System.out.println("程序退出！！！");
						break;
					default:
						System.out.println("输入有误，请重新输入！！！");
					}
					
					menu();
					input = sc.nextInt();
				}while(input != 0);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("欢迎下次再来！");
	}
}
