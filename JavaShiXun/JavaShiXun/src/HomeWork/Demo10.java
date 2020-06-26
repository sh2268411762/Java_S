/**
 * 
 */
package HomeWork;
import java.util.Scanner;

/**
*  @Description     倒序打印一个不多于5位的整数
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月23日下午7:03:28
*/
public class Demo10 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		System.out.println("请输入一个不多于5位的整数：");
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		if(num > 99999 || num < 0)
		{
			System.out.println("输入的不是5位数，请重新输入：");
			num = sc.nextInt();
		}
		
		int count = 0;
		int num1 = num;
		while(num1 > 0)
		{
			num1 /= 10;
			count++;
		}
		System.out.println(num + "是一个" + count + "位数\n逆序打印各位数：");
		
		while(num > 0)
		{
			System.out.print(" " + num % 10);
			num /= 10;
		}
	}
}
