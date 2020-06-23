/**
 * 
 */
package HomeWork;
import java.util.Scanner;

/**
*  @Description     求三个数中的最大值
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月23日下午6:04:01
*/
public class Demo04 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		System.out.println("请输入三个数：");
		Scanner sc = new Scanner(System.in);
		int[] a = new int [3];
		for(int i = 0;i < 3;i++)
		{
			a[i] = sc.nextInt();
		}
		int max = a[0];
		for(int i = 0;i < 3;i++)
		{
			if(max < a[i])
			{
				max = a[i];
			}
		}
		System.out.println("三个数中最大的数是：" + max);
	}
}
