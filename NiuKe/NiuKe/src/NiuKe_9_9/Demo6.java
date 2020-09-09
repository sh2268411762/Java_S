/**
 * 
 */
package NiuKe_9_9;

import java.util.List;

/**
*  @Description     数组中的最大乘积
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月9日上午11:25:55
*/
public class Demo6 
{
	public static int maxProduct(int[] nums) 
    {
		int max = 0;
		for(int i = 0;i < nums.length;i++)
		{
			for(int j = i + 1;j < nums.length;j++)
			{
				if(max < ((nums[i] - 1) * (nums[j] - 1)))
				{
					max = (nums[i] - 1) * (nums[j] - 1);
				}
			}
		}
		return max;
    }
	public static void main(String[] args) 
	{
		int a[] = {3,4,5,2};
		int ret = maxProduct(a);
		System.out.println(ret);
	}
}
