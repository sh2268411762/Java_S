/**
 * 
 */
package SunHao_6_28;

/**
*  @Description     数组反转
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月28日下午12:51:34
*/
public class SunHao_6_28_2 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[10];
		for(int i = 0;i < arr.length;i++)
		{
			arr[i] = i + 1;
		}
		System.out.println("排序前：");
		for(int i = 0;i < arr.length;i++)
		{
			System.out.print(" " + arr[i]);
		}
		for(int i = 0;i < (arr.length / 2);i++)
		{
			int temp = arr[i];
			arr[i] = arr[arr.length-1-i];
			arr[arr.length-1-i] = temp;
		}
		System.out.println("\n排序后：");
		for(int i = 0;i < arr.length;i++)
		{
			System.out.print(" " + arr[i]);
		}
	}
}
