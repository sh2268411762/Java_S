/**
 * 
 */
package Frist;

import java.util.Scanner;

/**
*  @Description     判断季节
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月8日下午7:09:03
*/
public class SWITCH 
{
	public static void main(String[] args)
	{
		int month = 9;
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个月份：");
		month = sc.nextInt();
		String sea;
		switch(month)
		{
		case 12:
		case 1:
		case 2:
			sea = "月是冬天";
			break;
		case 3:
		case 4:
		case 5:
			sea = "月是春天";
			break;
		case 6:
		case 7:
		case 8:
			sea = "月是夏天";
			break;
		case 9:
		case 10:
		case 11:
			sea = "月是秋天";
			break;
		default:
			sea = "是一个错误输入！！！";
			break;
		}
		System.out.println(month + sea);
		sc.close();
	}

}
