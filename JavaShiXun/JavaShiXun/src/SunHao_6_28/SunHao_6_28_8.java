/**
 * 
 */
package SunHao_6_28;

/**
*  @Description     删，删除指定元素
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月28日下午3:26:32
*/
public class SunHao_6_28_8 
{
	public static void main(String[] args) 
	{
		int[] arr = new int[] {45,85,12,3,5,6};
		int a = 13;
		boolean flag = false;
		
		int i = 0;
		for(;i < arr.length;i++)
		{
			if(arr[i] == a)
			{
				flag = true;
				break;
			}
		}
		if(true == flag)
		{
			for(;i < arr.length - 1;i++)
			{
				arr[i] = arr[i+1];
			}
			for(i = 0;i < arr.length - 1;i++)
			{
				System.out.print(arr[i] + " ");
			}
		}
		else
		{
			for(i = 0;i < arr.length;i++)
			{
				System.out.print(arr[i] + " ");
			}
		}
		


	}
}
