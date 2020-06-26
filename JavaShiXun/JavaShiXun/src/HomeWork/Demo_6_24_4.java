/**
 * 
 */
package HomeWork;

import java.util.Scanner;

/**
*  @Description     判断质数
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月24日下午2:22:35
*/
public class Demo_6_24_4 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要判断的数：");
		int num = sc.nextInt();
		
		int i = 2;
		for(;i < num;i++)
		{
			if(num % i == 0)
			{
				System.out.println(num + "不是质数");
				break;
			}
		}
		if(num == i) 
		{
			System.out.println(num + "是质数");
		}
	}
}
