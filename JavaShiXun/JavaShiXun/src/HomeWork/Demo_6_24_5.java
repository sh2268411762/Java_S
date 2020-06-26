/**
 * 
 */
package HomeWork;
import java.util.Scanner;

/**
*  @Description     倒序输出整数
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月26日下午8:14:51
*/
public class Demo_6_24_5 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入要倒序输出的整数：");
		int num = sc.nextInt();
		
		while(num > 0)
		{
			System.out.print(num % 10);
			num /= 10;
		}
	}
}
