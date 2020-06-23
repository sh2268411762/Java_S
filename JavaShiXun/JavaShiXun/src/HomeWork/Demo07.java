/**
 * 
 */
package HomeWork;
import java.util.Scanner;

/**
*  @Description     判断回文数
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月23日下午6:08:08
*/
public class Demo07 
{

	@SuppressWarnings({  "resource" })
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个五位数：");
		int num = sc.nextInt();
		int sum = num;
		int count = 0;
		
		if(num >=10000 && num < 100000)
		{
			while(sum > 0)
			{
				count = count * 10 + sum % 10;
				sum /= 10;
			}
			if(count == num)
			{
				System.out.println(num + "是一个回文数");
			}
			else
			{
				System.out.println(num + "不是一个回文数");
			}
		}
		else
		{
			System.out.println("输入的不是五位数，程序退出！！！");
		}
		
	}
}
