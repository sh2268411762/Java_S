/**
 * 
 */
package SunHao_6_23;

import java.util.Scanner;

/**
*  @Description     企业利润
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月23日下午3:46:34
*/
public class SunHao_6_23_10 
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		System.out.println("请输入当月利润：");
		Scanner sc = new Scanner(System.in);
		double num = sc.nextDouble();
		double money = 0;
		
		if(num <= 10)
		{
			money = num + num * 0.1;
		}
		else if(num > 10 && num <= 20)
		{
			money = 1.0 + num + (num - 10.0) * 0.075;
		}
		else if(num > 20 && num <= 40)
		{
			money = num + 1.75 +(num - 20) * 0.05; 
		}
		else if(num > 40 && num <= 60)
		{
			money = num + (num - 40) * 0.03 + 2.75 ;
		}
		
	}
}
