/**
 * 
 */
package HomeWork;

import java.util.Scanner;

/**
*  @Description     企业利润
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月23日下午6:57:42
*/
public class Demo11 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		System.out.println("请输入利润：");
		Scanner sc = new Scanner(System.in);
		long num = sc.nextLong();
		
		long money = 0;
		if(100000 >= num)
		{
			money = (long)0.1 * num;
		}
		else if((100000) < num && (200000) >= num)
		{
			money = (long)(0.075 * (num - 100000) + 100000 * 0.1);
		}
		else if((200000) < num && (400000) >= num)
		{
			money = (long)(0.05 * (num - 200000) + 0.075 * 100000 + 0.1 * 100000);
		}
		else if((400000) <num && 600000 >= num)
		{
			money = (long)(0.03 * (num - 400000) + 0.05 * 200000 + 0.075 * 100000 + 0.1 * 100000);
		}
		else if(600000 < num && 1000000 >= num)
		{
			money = (long)(0.015 * (num - 600000) + 0.03 * 200000 + 0.05 * 200000 + 0.075 * 100000 + 0.1 * 100000);
		}
		else
		{
			money = (long)(0.01 * (num - 1000000) + 0.015 * 400000 + 0.03 * 200000 + 0.05 * 200000 + 0.075 * 100000 + 0.1 * 100000);
		}
		
		System.out.println("奖金为：" + money);
	}
}
