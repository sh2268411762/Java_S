/**
 * 
 */
package SunHao_6_23;
import java.util.Scanner;

/**
*  @Description     功能
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月23日上午11:20:24
*/
@SuppressWarnings("unused")
public class SunHao_6_23_4 
{
	public static void main(String[] args)
	{
		System.out.println((2 + 3.1 - 1)/2);
		System.out.println(1/3*3*9);
		int a = 2;
		int b = a++;
		System.out.println(a + " " + b);
		b = ++a;
		System.out.println(a + " " + b);
		
		int sum = 1;
		sum += 2;
		if(3 == sum)
		{
			System.out.println("3 = " + sum);
		}
		else
		{
			System.out.println("3 != " + sum);
		}
		
		int c = 90;
		System.out.println(c > 60 ?"及格":"不及格");
	}
}
