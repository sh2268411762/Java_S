/**
 * 
 */
package HomeWork;
import java.util.Scanner;

/**
*  @Description     输入年份和月份，判断天数
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月23日下午6:20:14
*/
public class Demo08 
{
	@SuppressWarnings({  "resource" })
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份和月份：");
		int year = sc.nextInt();
		int mon = sc.nextInt();
		
		if(1 == mon || 3 == mon || 5 == mon || 7 == mon || 8 == mon || 10 == mon || 12 == mon)
		{
			System.out.println(year + "年" + mon + "月" + "有31天");
		}
		else if(4 == mon || 6 == mon || 9 == mon || 11 == mon)
		{
			System.out.println(year + "年" + mon + "月" + "有30天");
		}
		else if(2 == mon && 0 == year % 4 && year % 100 != 0 || 0 == year %400)
		{
			System.out.println(year + "年" + mon + "月" + "有29天");
		}
		else
		{
			System.out.println(year + "年" + mon + "月" + "有28天");
		}
	}
}
