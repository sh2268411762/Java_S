/**
 * 
 */
package HomeWork;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/**
*  @Description     DVD管理
*  JDBC:
*  1、加载驱动
*  2、获取连接（Java链接mysql语句）
*  3、预执行（准备好SQL语句）
*  4、执行
*  5、释放资源（关闭预执行，关闭连接）
*  @author          孙豪
*  @version         1.0
*  @Date            2020年6月30日下午6:21:02
*/
public class DVD 
{
	
private static PreparedStatement prepareStatement;

//	jdbc:mysql://localhost:3306/cms
//		com.mysql.jdbc.Driver
	
	
	public static void main(String[] args) 
	{
		try {
			//1、加载驱动
			Class.forName("com.mysql.jdbc.Driver");
			
			//2、获取连接
			Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/homework","root","sunhao2268411762");
			boolean flag = false;
			if(conn != null)
			{
				System.out.println("java连接mysql成功！");
				flag = true;
			}
			else
			{
				System.out.println("java连接mysql失败！");
			}
			if(flag == true)
			{
				//3、预执行
				Scanner sc = new Scanner(System.in);
				System.out.println("1——输入三个dvd信息\n2——删除一个dvd信息\n其他数字退出");
				int input = sc.nextInt();
				if(input == 1)
				{
					System.out.println("请输入dvd的名字：");
					String name = sc.next();
					System.out.println("请输入dvd的价格：");
					double price = sc.nextDouble();
					System.out.println("请输入dvd的出版社：");
					String publish = sc.next();
					PreparedStatement ps1= conn.prepareStatement("insert into dvd values(null,?,?,?,0,'',null,0)");
					ps1.setString(1, name);//将name的值放入第一个问号处
					ps1.setDouble(2, price);//将price的值放入第二个问号处
					ps1.setString(3,publish);//将publish的值放入第三个问号处
					
					System.out.println("\n请输入dvd的名字：");
					name = sc.next();
					System.out.println("请输入dvd的价格：");
					price = sc.nextDouble();
					System.out.println("请输入dvd的出版社：");
					publish = sc.next();
					PreparedStatement ps2= conn.prepareStatement("insert into dvd values(null,?,?,?,0,'',null,0)");
					ps2.setString(1, name);
					ps2.setDouble(2, price);
					ps2.setString(3,publish);
					
					System.out.println("\n请输入dvd的名字：");
					name = sc.next();
					System.out.println("请输入dvd的价格：");
					price = sc.nextDouble();
					System.out.println("请输入dvd的出版社：");
					publish = sc.next();
					PreparedStatement ps3= conn.prepareStatement("insert into dvd values(null,?,?,?,0,'',null,0)");
					ps3.setString(1, name);
					ps3.setDouble(2, price);
					ps3.setString(3,publish);
					
					
					
					
					//4执行
					int row = ps1.executeUpdate();//增删改
					row += ps2.executeUpdate();
					row += ps3.executeUpdate();
					if(3 == row)
					{
						System.out.println("新增成功！");
					}
					else
					{
						System.out.println("新增失败！");
					}
					
					//5、释放资源
					ps1.close();//预执行
					ps2.close();
					ps3.close();
					conn.close();//连接
				}
				else if(input == 2)
				{
					System.out.println("请输入要删除的id：");
					int del = sc.nextInt();
					PreparedStatement ps= conn.prepareStatement("delete from dvd where id = ?");
					ps.setInt(1, del);
					int row = ps.executeUpdate();
					if(row == 1)
					{
						System.out.println("删除成功！");
					}
					else
					{
						System.out.println("删除失败！");
					}
					ps.close();
					conn.close();
				}
				else
				{
					System.out.println("程序退出！！！");
				}
			}
			
			
			
			
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
