/**
 * 
 */
package SunHao_6_23;

import java.util.Scanner;

/**
*  @Description     输入任意年月日，判断该天是该年的第几天
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月23日下午3:14:30
*/
public class SunHao_6_23_9 
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年月日");
		int year = sc.nextInt();
		int mon = sc.nextInt();
		int days = sc.nextInt();
		int day = days;

		if(mon > 0 && mon < 13 && day > 0 && day < 32)
		{
			if(0 == year % 4 && year % 100 != 0 || 0 == year % 400)
			{
				switch(mon)
				{
				case 1:
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
				
				case 2:
					days += 31;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 3:
					days += 29 + 31;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 4:
					days += 31 + 29 + 31;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 5:
					days += 30 + 62 + 29;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 6:
					days += 31 + 30 + 62 + 29;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 7:
					days += 60 + 31 + 62 + 29;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 8:
					days += 31 + 60 + 31 + 62 + 29;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 9:
					days += 31 + 31 + 60 + 31 + 62 + 29;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 10:
					days += 30 + 31 + 31 + 60 + 31 + 62 + 29;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 11:
					days += 31 + 30 + 31 + 31 + 60 + 31 + 62 + 29;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 12:
					days += 30 + 31 + 30 + 31 + 31 + 60 + 31 + 62 + 29;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
				}
			}
			else
			{
				switch(mon)
				{
				case 1:
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
				
				case 2:
					days += 31;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 3:
					days += 28 + 31;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 4:
					days += 31 + 28 + 31;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 5:
					days += 30 + 62 + 28;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 6:
					days += 31 + 30 + 62 + 28;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 7:
					days += 60 + 31 + 62 + 28;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 8:
					days += 31 + 60 + 31 + 62 + 28;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 9:
					days += 31 + 31 + 60 + 31 + 62 + 28;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 10:
					days += 30 + 31 + 31 + 60 + 31 + 62 + 28;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 11:
					days += 31 + 30 + 31 + 31 + 60 + 31 + 62 + 28;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
					
				case 12:
					days += 30 + 31 + 30 + 31 + 31 + 60 + 31 + 62 + 28;
					System.out.println(year + "年" + mon + "月" + day + "日是该年的第" + days + "天");
					break;
				}
			}
			}
		else
		{
			System.out.println("输入有误，程序退出！！！");
		}
		}
}
