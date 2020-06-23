/**
 * 
 */
package HomeWork;

import java.util.Scanner;

/**
*  @Description     交换数字
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月23日下午5:59:47
*/
public class Demo03 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		int a = 56;
		int b = 67;
		System.out.println("请输入两个整数：");
		Scanner sc = new Scanner(System.in);
		a = sc.nextInt();
		b = sc.nextInt();
		
		System.out.println("交换之前：a = " + a + " b = " + b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("交换之后：a = " + a + " b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("再交换 ：a = " + a + " b = " + b);
	}
}
