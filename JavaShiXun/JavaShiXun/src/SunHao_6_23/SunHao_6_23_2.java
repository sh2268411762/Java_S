/**
 * 
 */
package SunHao_6_23;

import java.util.Scanner;

/**
*  @Description     毫秒转换
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月23日上午10:29:04
*/
public class SunHao_6_23_2 
{
	private static String Get(long t)
	{
		long days = t/(1000 * 60 * 60 * 24);
		long hours = (t % (1000 * 60 * 60 * 24))/(1000 * 60 *60);
		long minu = (t % (1000*60 *60))/(1000 * 60);
		long s = (t % (1000 * 60))/1000;
		long ms = t % 1000;
		return days + "天" + hours + "小时" + minu + "分钟" + s + "秒" + ms + "毫秒";
	}
	public static void main(String[] args)
	{
		long t = 465836239;
//		System.out.println("请输入毫秒数");
//		Scanner sc = new Scanner(System.in);
//		t = sc.nextLong();
		String data = Get(t);
		System.out.println(data);
	}
}
