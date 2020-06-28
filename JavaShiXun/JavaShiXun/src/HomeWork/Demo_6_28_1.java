/**
 * 
 */
package HomeWork;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
*  @Description     整数操作
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月28日下午6:00:13
*/
public class Demo_6_28_1 
{

	private static void Menu()
	{
		System.out.println("1、新增整数");
		System.out.println("2、删除整数");
		System.out.println("3、修改整数");
		System.out.println("4、显示所有整数");
		System.out.println("5、排行榜（排序）");
		System.out.println("0、退出系统");
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked", "resource" })
	public static void main(String[] args) 
	{
		ArrayList list = new ArrayList();
		list.add(76);
		list.add(65);
		list.add(45);
		
		Scanner sc = new Scanner(System.in);
		Menu();
		System.out.println("请输入【0——5】:");
		int input = sc.nextInt();
		
		do {
			switch(input)
			{
			case 1:
				System.out.println("请输入要新增的数：");
				int num = sc.nextInt();
				list.add(num);
				System.out.println("新增完成！");
				break;
				
			case 2:
				System.out.println("请输入要删除的数：");
				int del = sc.nextInt();
				list.remove(new Integer(del));
				System.out.println("删除完成！");
				break;
				
			case 3:
				System.out.println("请输入修改前的整数（如果要修改的数有多个可重复修改）：");
				int n1 = sc.nextInt();
				if(list.contains(n1))
				{
					System.out.println("请输入修改后的整数：");
					int n2 = sc.nextInt();
					int index = list.indexOf(n1);
					list.set(index, n2);
					System.out.println("修改完成！");
				}
				else
				{
					System.out.println("要修改的数不存在！！！");
				}
				break;
				
			case 4:
				System.out.println("开始显示：");
				for(int i = 0;i < list.size();i++)
				{
					System.out.print(list.get(i) + "  ");
				}
				System.out.println("\n显示完成！");
				break;
			
			case 5:
				System.out.println("1、升序\n2、降序\n请选择：");
				int select = sc.nextInt();
				if(select == 1)
				{
					Collections.sort(list);
					System.out.println("排序完成！！！");
				}
				else if(2 == select)
				{
					Collections.reverse(list);
					System.out.println("排序完成！！！");
				}
				else
				{
					System.out.println("输入有误，退出排序！！！");
				}
				break;
				
			case 0:
				System.out.println("程序退出！！！");
				break;
				
			default:
				System.out.println("输入有误，请重新输入！！！");
				break;
			}
			if(input != 0)
			{
				System.out.println();
				Menu();
				System.out.println("请输入【0——5】:");
				input = sc.nextInt();
			}
			else
			{
				break;
			}
			
		}while(input > 0);
		System.out.println("欢迎下次再来！！！");
	}

}
