/**
 * 
 */
package SunHao_6_28;

import java.util.Arrays;

/**
*  @Description     改，任意一组数据，修改元素
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月28日下午3:21:53
*/
public class SunHao_6_28_7 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {45,85,12,3,5,6,12};
		int a = 12;
		int b =100;
		System.out.println("修改前：");
		System.out.print(Arrays.toString(arr));
		for(int i = 0;i < arr.length;i++)
		{
			if(a == arr[i])
			{
				arr[i] = b;
			}
		}
		System.out.println("\n修改后：");
		System.out.print(Arrays.toString(arr));
	}
}
