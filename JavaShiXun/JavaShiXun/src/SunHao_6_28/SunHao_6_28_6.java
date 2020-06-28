/**
 * 
 */
package SunHao_6_28;

import java.util.Arrays;

/**
*  @Description     增，升序一个数组，加入一个数组依旧升序
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月28日下午2:52:30
*/
public class SunHao_6_28_6 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {1,8,9,12,56,96};
		int[] newarr = new int[arr.length+1];
		int key = 15;
		
		for(int i = 0;i < arr.length;i++)
		{
			newarr[i] = arr[i];
		}
		System.out.println("加入前:" + Arrays.toString(arr));
		int input = 0;
		for(int put = 0;put < newarr.length;put++)
		{
			if(key > newarr[put])
			{
				input = put + 1;
			}
			else
			{
				break;
			}
		}
		System.out.println(input);

		for(int put = (newarr.length - 1);put > input;put--)
		{
			newarr[put] = newarr[put-1];
		}
		newarr[input] = key;
		System.out.println("加入后:" + Arrays.toString(newarr));
	}
}
