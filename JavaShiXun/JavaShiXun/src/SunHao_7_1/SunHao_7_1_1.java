/**
 * 
 */
package SunHao_7_1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

/**
*  @Description     登录验证
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月1日下午12:13:18
*/
public class SunHao_7_1_1 
{
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
				}
				ps.close(); 
				conn.close();
				
				/*
				 * System.out.println("新增账户："); System.out.println("请输入编号："); int num =
				 * sc.nextInt(); System.out.println("请输入用户名："); String u = sc.next();
				 * System.out.println("请输入密码："); String p = sc.next();
				 * System.out.println("请输入用户等级(0或1)："); int r = sc.nextInt();
				 * 
				 * ps = conn.prepareStatement("insert into 用户表（登录） values(?,?,?,?)");
				 * ps.setInt(1, num); ps.setString(2, u); ps.setNString(3, p); ps.setInt(4, r);
				 * int row = ps.executeUpdate(); if(row >= 1) { System.out.println("新增成功！\n");
				 * String s = null; if(0 == r) { s = "普通用户"; } else if(1 == r) { s = "管理员"; }
				 * System.out.println("用户名：" + u + "\t密码：" + p + "\t" + s);
				 * 
				 * ps.close(); conn.close(); } else { System.out.println("新增失败！"); }
				 */
				
				

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
