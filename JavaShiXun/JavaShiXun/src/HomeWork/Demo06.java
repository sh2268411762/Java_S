/**
 * 
 */
package HomeWork;
import java.util.Scanner;

/**
*  @Description     判断某年份有多少天
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月23日下午6:06:34
*/
public class Demo06 
{
	public static void main(String[] args)
	{
		System.out.println("请输入一个年份：");
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();

		if((0 == (year % 4)) && ((year % 100) != 0) || (0 == year % 400))
		{
			System.out.println(year + "年是闰年有366天");
		}
		else
		{
			System.out.println(year + "年是平年有365天");
		}
	}
}
