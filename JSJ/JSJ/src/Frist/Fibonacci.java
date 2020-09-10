/**
 * 
 */
package Frist;

import java.util.Scanner;

/**
*  @Description     斐波那契数列
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月8日下午7:43:30
*/
public class Fibonacci 
{
	public static long Fib(int n)
	{
		long f1,f2,f3;
		f2 = f1 = 1;
		f3 = f1 + f2;
		if(n == 1)
		{
			return f1;
		}
		else if (n == 2)
		{
			return f2;
		}
		else
		{
			for(int i = 3;i <= n;i++)
			{
				f3 = f1 + f2;
				f1 = f2;
				f2 = f3;
			}
			return f3;
		}
	}
	public static void main(String[] args) 
	{
		long f1,f2,f3,n = 50;
		f2 = f1 = 1;
		System.out.print(f1 + " " + f2 + " ");
		for(int i = 3;i <= n;i++)
		{
			f3 = f1 + f2;
			f1 = f2;
			f2 = f3;
			System.out.print(f3 + " ");
			if(i % 10 == 0)//10项换行
			{
				System.out.println();
			}
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要求的斐波那契数列项数：");
		int x = sc.nextInt();
		long l = Fib(x);
		System.out.println("第" + x + "项斐波那契数是：" + l);
		sc.close();
	}
}
