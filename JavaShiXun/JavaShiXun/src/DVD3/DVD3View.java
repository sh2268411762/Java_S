/**
 * 
 */
package DVD3;


import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

/**
*  @Description     dvd操作
*  @author          孙豪
*  @version         版本
*  @Date            2020年7月2日下午1:39:38
*/
public class DVD3View 
{
	public static void menu()
	{
		System.out.println("普通用户：");
		System.out.println("1、显示所有DVD");
		System.out.println("2、借阅DVD");
		System.out.println("3、归还DVD");
		System.out.println("4、DVD排行榜");
		System.out.println("0、退出");
		System.out.println("请输入【0-4】");
	}

	Scanner sc = new Scanner(System.in);
	DVDDao d = new DVDDao();
	public void CommonMenu()
	{
		menu();
		int input = sc.nextInt();
		
		do {
			switch(input)
			{
			case 1:
				showallDVD();
				break;
				
			case 2:
				borDVD();
				break;
				
			case 3:
				returnDVD();
				break;
				
			case 4:
				ShowDVD();
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
				menu();
				input = sc.nextInt();
			}
		}while(input != 0);
		System.out.println("欢迎下次再来！");
	}
	//显示全部
	public void showallDVD()
	{
		List<List<Object>> list = d.queryAllDvd();
		if(list == null || list.size() == 0)
		{
			System.out.println("没有查询到数据！！！");
		}
		else
		{
			System.out.println("编号\t\t名字\t\t价格\t\t出版社\t\t是否借出\t\t借阅人\t\t借阅日期\t\t借阅次数");
			for(int i = 0;i < list.size();i++)
			{
				for(int j = 0;j < list.get(i).size();j++)
				{
					System.out.print(list.get(i).get(j) + "\t\t");
				}
				System.out.println();
			}
		}
	}
	//借阅
	public void borDVD()
	{
		System.out.println("请输入要借阅的DVD编号:");
		int id = sc.nextInt();
		List<List<Object>> list = d.queryAByID(id);
		if(list == null || list.size() == 0)
		{
			System.out.println("没有编号为" + id + "的DVD");
		}
		else
		{
			if((int)(list.get(0).get(4)) == 1)
			{
				System.out.println("编号为" + id + "的DVD已被借出");
			}
			else
			{
				System.out.println("请输入借阅人姓名：");
				String name = sc.next();
				System.out.println("请输入借阅日期(xxxx-x-x)：");
				String date = sc.next();
				
				int row = d.borrow(id, name, date);
				if(row == 0)
				{
					System.out.println("借阅失败！");
				}
				else
				{
					System.out.println("借阅成功！");
				}
			}
		}
	}
	//归还
	public void returnDVD()
	{
		System.out.println("请输入要归还的DVD编号:");
		int id = sc.nextInt();
		List<List<Object>> list = d.queryAByID(id);
		if(list == null || list.size() == 0)
		{
			System.out.println("没有编号为" + id + "的DVD");
		}
		else
		{
			if((int)(list.get(0).get(4)) == 0)
			{
				System.out.println("编号为" + id + "的DVD没有被借出！");
			}
			else
			{
//				Date nD = new Date();
//				String borDate = (String)(list.get(0).get(6));
//				SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
//				try {
//					Date date = sdf.parse(borDate);//将字符串转为日期
//					long ms = nD.getTime() - date.getTime();//当前日期减去借阅日期的毫秒数
//					int day = (int)(ms / (1000 * 60 * 60 *24));
//					System.out.println("编号为" + id + "借出" + day + "天");
//				} catch (ParseException e) {
//					// TODO Auto-generated catch block
//					e.printStackTrace();
//				}
			
				int row = d.returnDVD(id);
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
	//排行榜
	public void ShowDVD()
	{
		List<List<Object>> list = d.queryAByBor();
		if(list == null || list.size() == 0)
		{
			System.out.println("没有查询到数据！！！");
		}
		else
		{
			for(int i = 0;i < list.size();i++)
			{
				System.out.println("编号\t\t名字\t\t价格\t\t出版社\t\t是否借出\t\t借阅人\t\t借阅日期\t\t借阅次数");
				for(int j = 0;j < list.get(i).size();j++)
				{
					System.out.print(list.get(i).get(j) + "\t\t");
				}
				System.out.println();
			}
		}
	}
	
	
	
	
	public void menu1()
	{
		System.out.println("管理员用户：");
		System.out.println("1、显示所有DVD");
		System.out.println("2、DVD排行榜");
		System.out.println("3、新增DVD");
		System.out.println("4、删除DVD");
		System.out.println("0、退出");
	}
	public void ManaMenu()
	{
		menu1();
		Scanner sc = new Scanner(System.in);
		int input = sc.nextInt();
		
		do {
			switch(input)
			{
			case 1:
				showallDVD();
				break;
				
			case 2:
				ShowDVD();
				break;
				
			case 3:
				AddDVD();
				break;
				
			case 4:
				DeleteDVD();
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
				menu1();
				input = sc.nextInt();
			}
		}while(input != 0);
		System.out.println("欢迎下次再来！");
	}
	public void AddDVD()
	{
		System.out.println("请输入要新增的DVD名字：");
		String name = sc.next();
		System.out.println("请输入" + name + "的价格");
		Double price = sc.nextDouble();
		System.out.println("请输入要新增的DVD出版社:");
		String pub = sc.next();
		
		
		int row = d.AddDvd(name, price, pub);
		if(row == 0)
		{
			System.out.println("新增失败!");
		}
		else
		{
			System.out.println("新增名字为" + name + "价格为" + price +"的DVD!");
		}
	}
	public void DeleteDVD()
	{
		System.out.println("请输入要删除的DVD编号：");
		int id = sc.nextInt();
		List<List<Object>> list = d.queryAByID(id);
		if(list == null || list.size() == 0)
		{
			System.out.println("没有编号为" + id + "的DVD");
		}
		else
		{
			int row = d.DeleteDvd(id);
			if(row == 0)
			{
				System.out.println("删除失败！");
			}
			else
			{
				System.out.println("已删除ID为" + id + "的DVD!");
			}
		}
	}
}










