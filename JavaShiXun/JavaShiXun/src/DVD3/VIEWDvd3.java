/**
 * 
 */
package DVD3;

import java.util.List;
import java.util.Scanner;

/**
*  @Description     输入输出
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月2日下午1:08:12
*/
public class VIEWDvd3 
{
	public void menu1()
	{
		System.out.println("*****************欢迎进入DVD管理系统*****************");
		System.out.println("【登录界面】：请输入用户名和密码：");
		Scanner sc = new Scanner(System.in);
		System.out.print("用户名：");
		String name = sc.next();
		System.out.print("密码：");
		String password = sc.next();
		
		
		List<List<Object>> login = new DAODvd3().login(name, password);
		if(login == null || login.size() == 0)
		{
			System.out.println("登陆失败！！！");
		}
		else
		{
			System.out.println("登陆成功！！！");
			//登陆者信息
			if((int)login.get(0).get(3) == 1)
			{
				//管理员
				new DVD3View().ManaMenu();
			}
			else
			{
				//普通用户
				new DVD3View().CommonMenu();
			}
		}
	}
	
	
}
