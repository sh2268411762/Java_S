/**
 * 
 */
package SunHao_6_28;

/**
*  @Description     二分查找
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月28日下午2:07:41
*/
public class SunHao_6_28_3 
{
	public static void main(String[] args) 
	{
		String[] str = new String[]{"AA","BB","CC","DD","EE","FF"};
			
		int [] arr = new int[] {1,3,5,7,9,22};
		int left = 0;
		int right = arr.length - 1;
		int mid = (left + right) / 2;
		int key = 10;
		
		while(left <= right)
		{
			mid = (left + right) / 2;
			if(key < arr[mid])
			{
				right = mid - 1;
			}
			else if(key > arr[mid])
			{
				left = mid + 1;
			}
			else
			{
				System.out.println("下标为：" + mid);
				return;
			}
		}
		System.out.println("没有\"" + key + "\"元素");
	}
}
