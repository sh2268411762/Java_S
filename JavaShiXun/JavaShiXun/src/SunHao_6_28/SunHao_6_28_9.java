/**
 * 
 */
package SunHao_6_28;

import java.util.Arrays;

/**
*  @Description     改
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月28日下午3:40:43
*/
public class SunHao_6_28_9 
{
	public static void main(String[] args) {
		int [] arr = new int[7];
		int a = -1;
		arr[0] = 1;
		arr[1] = 8;
		arr[2] = 9;
		arr[3] = 12;
		arr[4] = 56;
		arr[5] = 96;
		
		boolean flag = true;
		for(int i = arr.length - 2;i >= 0;i--)
		{
			if(arr[i] > a)
			{
				arr[i+1] = arr[i];//后移
			}
			else
			{
				arr[i+1] = a;
				flag = false;
				break;
			}
		}
		if(flag == true)
		{
			arr[0] = a;
		}
		System.out.println(Arrays.toString(arr));
	}
}
