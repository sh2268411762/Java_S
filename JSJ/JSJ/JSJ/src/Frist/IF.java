/**
 * 
 */
package Frist;

import java.util.Scanner;

/**
*  @Description     判断季节
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月8日下午6:58:02
*/
public class IF 
{
	public static void main(String[] args) 
	{
		int month = 9;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个月份：");
		month = sc.nextInt();
		String sea;
		if(month == 12 || month == 1 || month ==2)
		{
			sea = "月是冬天！";
		}
		else if(month == 3 || month == 4 || month == 5)
		{
			sea = "月是春天！";
		}
		else if(month == 6 || month == 7 || month == 8)
		{
			sea = "月是夏天！";
		}
		else if(month == 9 || month == 10 || month == 11)
		{
			sea = "月是秋天！";
		}
		else
		{
			sea = "是一个错误输入！！！";
		}
		
		System.out.println(month + sea);
		sc.close();
	}

}
