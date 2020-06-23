/**
 * 
 */
package SunHao_6_23;
import java.util.Scanner;

/**
*  @Description     功能
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月23日下午12:27:10
*/
public class SunHao_6_23_6 
{
	@SuppressWarnings({ "resource", "unused" })
	public static void main(String[] args)
	{
		  System.out.println("请输入时：分：秒：(用空格分开)");
		  Scanner sc = new Scanner(System.in);
		  int hours = sc.nextInt();
		  int minu = sc.nextInt();
		  int sec = sc.nextInt();
		  
		  if((hours >=0 && hours<= 23) && (minu >= 0 && minu <= 59) && (sec >=0 && sec <=59))
		  {
			  System.out.println("输入时间——>" + hours + ":" + minu + ":" + sec);
			  if(hours >= 0 && hours < 6)
			  {
				  System.out.println("凌晨");
			  }
			  else if(hours >= 6 && hours < 12)
			  {
				  System.out.println("上午");
			  }
			  else if(hours >= 12 && hours < 18)
			  {
				  System.out.println("中午");
			  }
			  else
			  {
				  System.out.println("晚上");
			  }
		  }
		  else
		  {
			  System.out.println("输入有误，程序退出！！！");
		  }
		  
	}
}
