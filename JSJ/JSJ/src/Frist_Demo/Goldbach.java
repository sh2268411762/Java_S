/**
 * 
 */
package Frist_Demo;

import java.util.Scanner;

/**
*  @Description     哥德巴赫猜想
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月8日下午11:39:00
*/
public class Goldbach 
{
	//判断素数
	public static boolean isPrime(int m)
	{
		double d = Math.sqrt(m);//根号m
		for(int i = 3;i <= d;i++)
		{
			if(m % i == 0)
			{
				return false;
			}
		}
		return true;
	}
	public static  void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个偶数：");
		int n = sc.nextInt();
		if(n % 2 != 0 || n < 6)
		{
			System.out.println("输入有误，程序退出！！！");
		}
		else
		{
			for(int a = 3;a <= n/2;a += 2)
			{
				int b = n - a;
				if(isPrime(a) && isPrime(b))
				{
					System.out.println(n + "=" + a + "+" + b);
				}
			}
		}
		sc.close();
	}
}
