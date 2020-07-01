/**
 * 
 */
package DVD_2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import DVD_2.JDBCutil;


/**
*  @Description     DVD2.0
*  @author          孙豪
*  @version         2.0.1
*  @Date            2020年7月1日下午5:09:15
*/
@SuppressWarnings("unused")
public class test_DVD 
{
	@SuppressWarnings({ "unchecked", "unused", "resource", "rawtypes" })
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
				Scanner sc = new Scanner(System.in);
				JDBCutil jdbc = new JDBCutil();
				List list = new ArrayList();
				
				System.out.println("请输入用户名：");
				String user = sc.next();
				System.out.println("请输入密码：");
				String password = sc.next();
				PreparedStatement ps = conn.prepareStatement("select * from 用户表（登录） where user = ? and password = ?");
				ps.setString(1, user);
				ps.setString(2, password);
				ResultSet ret = ps.executeQuery();
				if(ret.next())
				{
					System.out.println("恭喜！！！登陆成功！！！");
				}
				else
				{
					System.out.println("登陆失败，请检查用户名和密码！！！");
					return;
				}
				
				String s = null;
				int r = ret.getInt(4);
				if(0 == r) 
				{ 
					s = "普通用户"; 
					System.out.println(s + "：可进行：\n1、查看\n2、借阅\n3、归还\n");
					int input = sc.nextInt();
					do {
						switch(input)
						{
						case 1:
							System.out.println("\n开始显示：");
							int row1 = jdbc.update("select * from dvd", null);
							System.out.println("显示完成！\n");
							break;
							
						case 2:
							list.clear();
							System.out.println("请输入借阅人姓名：");
							list.add(sc.next());
							System.out.println("请输入借阅日期：");
							list.add(sc.next());
							System.out.println("请输入要借用的编号：：");
							list.add(sc.nextInt());

							
							int row2 = jdbc.update("update dvd set state = 1,borName = ?,borDate = ?,times = times + 1 where id = ?", list);
							if(row2 >= 1)
							{
								System.out.println("借阅成功！");
							}
							else
							{
								System.out.println("借阅失败！");
							}
							System.out.println("借阅完成！");
							break;
							
						case 3:
							list.clear();
							System.out.println("请输入要归还的编号：");
							list.add(sc.nextInt());
							int row3 = jdbc.update("update dvd set state = 0,borName = '',borDate = null where id = ?", list);
							if(row3 >= 1)
							{
								System.out.println("归还成功！");						
							}
							else
							{
								System.out.println("归还失败！");
							}
							System.out.println("归还完成！");
							break;
							
						case 0:
							System.out.println("程序退出！");
							break;
							
						default:
							System.out.println("输入有误，请重新输入！！！");
							break;
						}
						System.out.println("请选择：\n1、查看\n2、借阅\n3、归还\n0、退出");
						input = sc.nextInt();
					}while(input != 0);
				} 
				else if(1 == r) 
				{ 
					s = "管理员"; 
					System.out.println(s + "：可进行： \n1、查看\n2、新增\n3、删除\n");
					int input = sc.nextInt();
					do
					{
						
					
						switch(input)
						{
						case 1:
							System.out.println("\n开始显示：");
							int row1 = jdbc.update("select * from dvd", null);
							System.out.println("显示完成！\n");
							break;
							
						case 2:
							list.clear();
							System.out.println("请输入dvd的名字：");
							list.add(sc.next());
							System.out.println("请输入dvd的价格：");
							list.add(sc.nextDouble());
							System.out.println("请输入dvd的出版社：");
							list.add(sc.next());
							
							int row2 = jdbc.update("insert into dvd values(null,?,?,?,0,'',null,0)", list);
							if(row2 >= 1)
							{
								System.out.println("新增成功！");
							}
							else
							{
								System.out.println("新增失败！");
							}
							System.out.println("新增完成！");
							break;
							
						case 3:
							list.clear();
							System.out.println("请输入要删除的编号：");
							int del = sc.nextInt();
							list.add(del);
							int row3 = jdbc.update("delete from dvd where id = ?", list);
							System.out.println(row3);
							boolean flag1 = false;
							if(row3 == 1)
							{
								System.out.println("删除成功！");
								flag1 = true;
							}
							else
							{
								System.out.println("删除失败！");
							}
							if(flag1 == false)
							{
								System.out.println("没有编号为" + del + "的DVD");
							}
							System.out.println("删除完成！");
							break;
							
						case 0:
							System.out.println("程序退出！");
							break;
							
						default:
							System.out.println("输入有误，请重新输入！！！");
							break;
						}
						System.out.println("请选择： \n1、查看\n2、新增\n3、删除\n0、退出");
						input = sc.nextInt();
					}while(input != 0);
				}
				
				
				ps.close(); 
				conn.close();
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("欢迎下次再来！！！");
	}
}
