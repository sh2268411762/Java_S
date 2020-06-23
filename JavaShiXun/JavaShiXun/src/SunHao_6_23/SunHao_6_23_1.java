/**
 * 
 */
package SunHao_6_23;
import java.util.Scanner;

/**
*  @Description     分割整数
*  @author          孙豪
*  @version         1.0
*  @Date            2020年6月23日上午9:43:53
*/
public class SunHao_6_23_1 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入一个数：");
		int num = sc.nextInt();//num保存要分割的整数
		int[] a = new int[11];//用数组存储各位数字
		int count = 0;//计数器
		int i =0;
		
		for(i=0;num>0;num /= 10)
		{
			a[i++] = num % 10;
			count++;
		}
		for(i=count-1;i>=0;i--)
		{
			if(0==i)
			{
				System.out.print(" " + a[i]);
			}
			else
			{
				System.out.print(" " + a[i]);
			}
		}
	}
}
