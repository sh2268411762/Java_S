/**
 * 
 */
package Second;

/**
*  @Description     求二维数组中各元素的和
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月9日下午5:21:36
*/
public class SumAll 
{
	public static void main(String[] args) 
	{
		int total = 0;
		int arr[][] = new int [3][4];  //定义二维数组
		for (int i = 0; i < arr.length; i++)   //初始化并打印二维数组
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				arr[i][j] = i + j;
				System.out.print("  " + arr[i][j]);
			}
			System.out.println();
		}
		
		for (int i = 0; i < arr.length; i++)  //求和
		{
			for (int j = 0; j < arr[i].length; j++) 
			{
				total += arr[i][j];
			}
		}
		System.out.println("      总和是：" + total);
	}
}
