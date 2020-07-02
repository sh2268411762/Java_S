/**
 * 
 */
package NBAPlayer;

import java.util.List;
import java.util.Scanner;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import NBAPlayer.NBADao;

/**
*  @Description     球员操作
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月2日下午9:30:31
*/
@SuppressWarnings("unused")
public class NBAView 
{
	public static void menu()
	{
		System.out.println("普通用户：");
		System.out.println("1、显示所有球员信息");
		System.out.println("2、按最高得分查看球员信息");
		System.out.println("3、按场均得分查看球员信息");
		System.out.println("4、借球员球衣");
		System.out.println("5、还球员球衣");
		System.out.println("0、退出");
		System.out.println("请输入【0-5】");
	}

	Scanner sc = new Scanner(System.in);
	NBADao d = new NBADao();
	public void CommonMenu()
	{
		menu();
		int input = sc.nextInt();
		
		do {
			switch(input)
			{
			case 1:
				showallPlayer();
				break;
				
			case 2:
				showHighest();
				break;
				
			case 3:
				showAger();
				break;
				
			case 4:
				BorrowNba();
				break;
				
			case 5:
				ReturnNba();
				break;
				
			case 0:
				System.out.println("程序退出！！！");
				break;
			default :
				System.out.println("输入有误，请重新输入！！！");
				break;
			}
			if(input != 0)
			{
				System.out.println();
				menu();
				input = sc.nextInt();
			}
		}while(input != 0);
		System.out.println("欢迎下次再来！");
	}
	//显示全部
	public void showallPlayer()
	{
		List<List<Object>> list = d.queryAllPlayer();
		if(list == null || list.size() == 0)
		{
			System.out.println("没有查询到数据！！！");
		}
		else
		{
			System.out.println("编号\t姓名\t英文名\t号码\t球队\t是否首发\t位置\t身高\t体重\t场均得分\t最高得分\t是否现役\t是否借出\t出借人");
			for(int i = 0;i < list.size();i++)
			{
				for(int j = 0;j < list.get(i).size();j++)
				{
					System.out.print(list.get(i).get(j) + "\t");
				}
				System.out.println();
			}
		}
	}
	//按最高分显示
	public void showHighest()
	{
		List<List<Object>> list = d.queryHighest();
		if(list == null || list.size() == 0)
		{
			System.out.println("没有查询到数据！！！");
		}
		else
		{
			System.out.println("编号\t姓名\t英文名\t号码\t球队\t是否首发\t位置\t身高\t体重\t场均得分\t最高得分\t是否现役\t是否借出\t出借人");
			for(int i = 0;i < list.size();i++)
			{
				for(int j = 0;j < list.get(i).size();j++)
				{
					System.out.print(list.get(i).get(j) + "\t");
				}
				System.out.println();
			}
		}
	}
	//按场均得分显示
	public void showAger()
	{
		List<List<Object>> list = d.queryAgera();
		if(list == null || list.size() == 0)
		{
			System.out.println("没有查询到数据！！！");
		}
		else
		{
			System.out.println("编号\t姓名\t英文名\t号码\t球队\t是否首发\t位置\t身高\t体重\t场均得分\t最高得分\t是否现役\t是否借出\t出借人");
			for(int i = 0;i < list.size();i++)
			{
				for(int j = 0;j < list.get(i).size();j++)
				{
					System.out.print(list.get(i).get(j) + "\t");
				}
				System.out.println();
			}
		}
	}
	//借出球衣
	public void BorrowNba()
	{
		System.out.println("请输入要借的球员编号：");
		int id = sc.nextInt();
		List<List<Object>> list = d.queryAByID(id);
		if(list == null || list.size() == 0)
		{
			System.out.println("没有编号为" + id + "的球衣");
		}
		else
		{
			if((int)(list.get(0).get(12)) == 1)
			{
				System.out.println("编号为" + id + "的球衣已被借出");
			}
			else
			{
				System.out.println("请输入球迷姓名：");
				String name = sc.next();
				
				int row = d.borrow(id, name);
				if(row == 0)
				{
					System.out.println("出借失败！");
				}
				else
				{
					System.out.println("出借成功！");
				}
			}
		}
	}
	
	public void ReturnNba()
	{
		System.out.println("请输入要归还的球衣编号:");
		int id = sc.nextInt();
		List<List<Object>> list = d.queryAByID(id);
		if(list == null || list.size() == 0)
		{
			System.out.println("没有编号为" + id + "的球衣");
		}
		else
		{
			if((int)(list.get(0).get(12)) == 0)
			{
				System.out.println("编号为" + id + "的球衣没有被借出！");
			}
			else
			{
				int row = d.returnNBA(id);
				if(row == 0)
				{
					System.out.println("归还失败！");
				}
				else
				{
					System.out.println("归还成功！");
				}
			}
		}
	}
	
	
	
	public void menu1()
	{
		System.out.println("管理员用户：");
		System.out.println("1、显示所有球员");
		System.out.println("2、新增球员");
		System.out.println("3、删除球员");
		System.out.println("4、按最高得分查看球员信息");
		System.out.println("5、按场均得分查看球员信息");
		System.out.println("0、退出");
		System.out.println("请输入【0-5】");
	}
	@SuppressWarnings("resource")
	public void ManaMenu()
	{
		menu1();
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		do {
			switch(input)
			{
			case 1:
				showallPlayer();
				break;
				
			case 2:
				AddPlayer();
				break;
				
			case 3:
				DeletePlayer();
				break;
				
			case 4:
				showHighest();
				break;
				
			case 5:
				showAger();
				break;
			case 0:
				System.out.println("程序退出！！！");
				break;
			default :
				System.out.println("输入有误，请重新输入！！！");
				break;
			}
			if(input != 0)
			{
				System.out.println();
				menu1();
				input = sc.nextInt();
			}
		}while(input != 0);
		System.out.println("欢迎下次再来！");
	}
	public void AddPlayer()
	{
		System.out.println("请输入要新增的球员名字：");
		String name1 = sc.next();
		System.out.println("请输入要新增的球员英文名字：");
		String name2 = sc.next();
		System.out.println("请输入球员" + name1 + "的球衣号码：");
		int num = sc.nextInt();
		System.out.println("请输入球员" + name1 + "的球队：");
		String team = sc.next();
		System.out.println("球员" + name1 + "是否为该球队首发（Y或N）：");
		String select = sc.next();
		System.out.println("球员" + name1 + "的位置是：");
		String site = sc.next();
		System.out.println("请输入球员" + name1 + "的身高：");
		Double height = sc.nextDouble();
		System.out.println("请输入球员" + name1 + "的体重：");
		Double weight = sc.nextDouble();
		System.out.println("请输入球员" + name1 + "的场均得分：");
		Double aver = sc.nextDouble();
		System.out.println("请输入球员" + name1 + "的单场最高得分：");
		int high = sc.nextInt();
		System.out.println("球员" + name1 + "是否为 现役球员（Y或N）：");
		String act = sc.next();
		
		
		int row = d.AddNBA(name1, name2, num,team,select,site,height,weight,aver,high,act);
		if(row == 0)
		{
			System.out.println("新增失败!");
		}
		else
		{
			String s = "?";
			if("Y" == select)
			{
				s = "首发";
			}
			else if("N" == select)
			{
				s = "替补";
			}
			System.out.println("新增球员为" + name1 + "球衣号码为" + num +"的" + team + "队" + s);
		}
	}
	public void DeletePlayer()
	{
		System.out.println("请输入要删除的球员编号：");
		int id = sc.nextInt();
		List<List<Object>> list = d.queryAByID(id);
		if(list == null || list.size() == 0)
		{
			System.out.println("没有编号为" + id + "的球员");
		}
		else
		{
			int row = d.DeleteNBA(id);
			if(row == 0)
			{
				System.out.println("删除失败！");
			}
			else
			{
				System.out.println("已删除ID为" + id + "的球员！");
			}
		}
	}
}
