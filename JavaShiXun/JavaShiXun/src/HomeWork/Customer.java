/**
 * 
 */
package HomeWork;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
*  @Description     客户操作
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月29日下午8:11:51
*/
public class Customer 
{
	int id;
	String name;
	String tele;
	
	public static void menu()
	{
		System.out.println("\n1、新增客户");
		System.out.println("2、删除客户");
		System.out.println("3、修改客户");
		System.out.println("4、显示所有客户");
		System.out.println("0、退出程序");
		System.out.println("请输入【0-5】");
	}
	
	public Customer()
	{
		
	}
	public Customer(int id1,String name1,String tele1)
	{
		id = id1;
		name = name1;
		tele = tele1;
	}
	
	
	@SuppressWarnings({ "unchecked", "rawtypes", "resource" })
	public static void main(String[] args) 
	{
		List list = new ArrayList();
		Scanner sc = new Scanner(System.in);
		
		menu();
		int input = sc.nextInt();
		do
		{
			switch(input)
			{
			case 1:
				System.out.println("\n开始添加：");
				System.out.println("请输入客户编号：");
				int id = sc.nextInt();
				
				boolean flag = true;
				for(int i = 0;i < list.size();i++)
				{
					if(id == i)
					{
						System.out.println("已有编号为" + id + "的客户\n退出添加");
						flag = false;
						break;
					}
				}
				if(flag == true)
				{
					System.out.println("请输入客户姓名：");
					String name = sc.next();
					System.out.println("请输入客户电话：");
					String tele = sc.next();
					Customer c = new Customer(id,name,tele);
					list.add(c);
					System.out.println("添加完成！");
				}
				break;
				
			case 2:
				System.out.println("\n请输入要删除的客户编号：");
				int del = sc.nextInt();
				int delIndex = -1;
				for(int i = 0;i < list.size();i++)
				{
					Customer c1 = (Customer)(list.get(i));
					if(c1.id == del)
					{
						delIndex = i;
						break;
					}
				}
				if(delIndex == -1)
				{
					System.out.println("无编号为" + del + "的客户");
				}
				else
				{
					list.remove(delIndex);
					System.out.println("删除成功！");
				}
				break;
				
			case 3:
				System.out.println("\n请输入要修改的客户编号：");
				int num = sc.nextInt();
				int numIndex = -1;
				
				for(int i = 0;i < list.size();i++)
				{
					Customer c1 = (Customer)(list.get(i));
					if(c1.id == num)
					{
						numIndex = i;
					}
				}
				if(numIndex == -1)
				{
					System.out.println("没有编号为" + num + "的客户");
				}
				else
				{
					Customer c1 = (Customer)(list.get(numIndex));
					System.out.println("请输入客户姓名（0视为不修改）（" + c1.name + "）");
					String newName = sc.next();
					newName = newName.equals("0") ? c1.name:newName;
					System.out.println("请输入新的电话（0视为不修改）（" + c1.tele + "）");
					String newTele = sc.next();
					newTele = newTele.equals("0") ? c1.tele:newTele;
					
					list.set(numIndex, new Customer(num,newName,newTele));
					System.out.println("修改成功！");
				}
				break;
				
			case 4:
				System.out.println("\n客户编号\t客户姓名\t电话号码");
				for(int i = 0;i < list.size();i++)
				{
					Customer c1 = (Customer)(list.get(i));
					System.out.println(c1.id + "\t" + c1.name + "\t" + c1.tele);
				}
				System.out.println("显示完成！");
				break;
				
			case 0:
				System.out.println("\n程序退出！！！");
				break;
				

			default:
				System.out.println("\n输入有误，请重新输入！！！");
				break;
			}
			menu();
			input = sc.nextInt();
		}while(input != 0);
		System.out.println("欢迎下次再来！！！");
	}
}
