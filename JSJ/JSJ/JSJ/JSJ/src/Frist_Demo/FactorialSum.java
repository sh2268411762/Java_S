/**
 * 
 */
package Frist_Demo;

import java.util.Scanner;

/**
*  @Description     阶乘求和
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月8日下午8:52:11
*/
public class FactorialSum 
{
	private static int fun(int x)
	{
		int sum = 0;
		for(int i = 1;i <= x;i++)
		{
			int num = 1;
			for(int j = 1;j <= i;j++)
			{
				num *= j;
			}
			sum += num;
		}
		return sum;
	}
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入数字：");
		int n = sc.nextInt();
		int ret = fun(n);
		System.out.println("1!+2!+...+" + n + "!=" + ret);
		sc.close();
	}
}
