package SunHao_6_22;
import java.util.Scanner;

public class SunHao_6_22_2 
{
	private static void Mod()
	{
		System.out.println("修改");
	}
	private static void Det()
	{
		System.out.println("删除");
	}
	private static void Print()
	{
		System.out.println("显示");
	}
	private static void menu()
	{
		System.out.println("-------------------客户管理系统-------------------");
		System.out.println("                   1.添加客户                                                                     ");
		System.out.println("                   2.修改客户                                                                     ");
		System.out.println("                   3.删除客户                                                                     ");
		System.out.println("                   4.客户列表                                                                     ");
		System.out.println("                   5.退出                                                                              ");
		System.out.println("请选择【1-5】");
	}
	private static void Add()
	{
		//私有方法，仅在Food类中被调用
		System.out.println("-------------------添加用户-------------------");
		System.out.println("姓名");
			Scanner sc = new Scanner(System.in);
			String name = sc.next();
//			System.out.println("姓名" + name);
			
		System.out.println("性别");
			String sex = sc.next();
//			System.out.println("性别" + sex);
			
		System.out.println("年龄");
			int age = sc.nextInt();
//			System.out.println("年龄" + age);
	}
	public static void main(String[] args)
	{
//		Integer number = null;
//		System.out.println("整型类型变量number为：" + number);
		
		menu();
		
		Scanner input = new Scanner(System.in);
		int select = input.nextInt();  
		
		
		while(select >0 && select <6) 
		{
			switch(select)
			{
			case 1:
				Add();
				break;
			
			case 2:
				Mod();
				break;
			
			case 3:
				Det();
				break;
			
			case 4:
				Print();
				break;
			
			case 5:
				System.out.println("退出");
				select = 5;
				break;
			
			default:
				System.out.println("输入有误，请重新输入！！！");
				break;
			}
			if(select < 5)
			{
				menu();
				select = input.nextInt(); 
			}
			else if(5 == select)
			{
				break;
			}
		}
	}
}

