/**
 * 
 */
package Second_Demo;

/**
*  @Description     数组相乘
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月10日下午10:50:37
*/
public class Demo1 
{
	private static void fun(int [][]a,int [][]b)
	{
		int [][] r = new int[4][2];
		for (int i = 0; i < r.length; i++) 
		{
			for (int j = 0; j < r[0].length; j++) 
			{
				r[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
			}
		}
		for (int i = 0; i < r.length; i++) 
		{
			for (int j = 0; j < r[i].length; j++) 
			{
				System.out.print(r[i][j] + " ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) 
	{
		int [][] a = new int[][] {{2,3,4},{5,6,7},{8,9,10},{11,12,13}};
		int [][] b = new int[][] {{2,3},{4,5},{6,7}};
		Demo1 ma = new Demo1();
		ma.fun(a, b);
	}
}	
