/**
 * 
 */
package SunHao_6_28;

/**
*  @Description     二维数组
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月28日下午2:21:41
*/
public class SunHao_6_28_4 
{
	public static void main(String[] args) 
	{
		int[][] arr1;
		arr1 = new int[50][3];//50行3列
		arr1[0][2] = 56;//赋值
		double[][] arr2;
		
		//初始化
		//静态初始化
		int[][] arr3 = new int[][] {{1,2,3},{34,5,4},{2,0}};
		int[][] arr4 = {{2,3},{4}};
		
		int[][] arr5 = new int[][]{{1,2,3,4,5},{3,4,5,6,7},{4,3,2,5,6}};
		for(int i = 0;i < arr5.length;i++)
		{
			for(int j = 0;j < arr5[0].length;j++)
			{
				System.out.print(" " + arr5[i][j]);
			}
			System.out.println();
		}
	}
}
