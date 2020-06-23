/**
 * 
 */
package HomeWork;
import java.util.Scanner;

/**
*  @Description     判断该天是一年的第几天
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月23日下午6:23:54
*/
public class Demo09 
{

	@SuppressWarnings({  "resource" })
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年月日（用空格隔开）");
		int year = sc.nextInt();
		int mon = sc.nextInt();
		int day = sc.nextInt();
		int count = 0;//计算天数
		
		if(mon > 0 && mon < 13 && day > 0 && day < 32)
		{
			switch(mon)
			{
			case 1:
				count = day;
				break;
				
			case 2:
				count = day + 31;
				break;
				
			case 3:
				if(0 == year % 4 && year % 100 != 0 || 0 == year %400)
				{
					count = 31 + 29 + day;
				}
				else
				{
					count = 31 + 28 + day;
				}
				break;
				
			case 4:
				if(0 == year % 4 && year % 100 != 0 || 0 == year %400)
				{
					count = 31 + 29 + 31 + day;
				}
				else
				{
					count = 31 + 28 + 31 + day;
				}
				break;
				
			case 5:
				if(0 == year % 4 && year % 100 != 0 || 0 == year %400)
				{
					count = 31 + 29 + 31 + 30 + day;
				}
				else
				{
					count = 31 + 28 + 31 + 30 + day;
				}
				break;
				
			case 6:
				if(0 == year % 4 && year % 100 != 0 || 0 == year %400)
				{
					count = 31 + 29 + 31 + 30 + 31 + day;
				}
				else
				{
					count = 31 + 28 + 31 + 30 + 31 + day;
				}
				break;
				
			case 7:
				if(0 == year % 4 && year % 100 != 0 || 0 == year %400)
				{
					count = 31 + 29 + 31 + 30 + 31 + 30 + day;
				}
				else
				{
					count = 31 + 28 + 31 + 30 + 31 + 30 + day;
				}
				break;
				
			case 8:
				if(0 == year % 4 && year % 100 != 0 || 0 == year %400)
				{
					count = 31 + 29 + 31 + 30 + 31 + 30 + 31 + day;
				}
				else
				{
					count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + day;
				}
				break;
				
			case 9:
				if(0 == year % 4 && year % 100 != 0 || 0 == year %400)
				{
					count = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + day;
				}
				else
				{
					count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + day;
				}
				break;
				
			case 10:
				if(0 == year % 4 && year % 100 != 0 || 0 == year %400)
				{
					count = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
				}
				else
				{
					count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + day;
				}
				break;
				
			case 11:
				if(0 == year % 4 && year % 100 != 0 || 0 == year %400)
				{
					count = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
				}
				else
				{
					count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + day;
				}
				break;
				
			case 12:
				if(0 == year % 4 && year % 100 != 0 || 0 == year %400)
				{
					count = 31 + 29 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
				}
				else
				{
					count = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + day;
				}
				break;
				
				default:
					System.out.println("输入有误，程序退出！！！");
					break;
			}
			System.out.println(year + "年" + mon + "月" + day + "日是" + year + "年的第" + count + "天");
		}
		else
		{
			System.out.println("输入有误，程序退出！！！");
		}
	}
}
