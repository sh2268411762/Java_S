/**
 * 
 */
package Second;

/**
*  @Description     矩阵乘积
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月9日下午5:29:27
*/
public class MatrixMultiply 
{
	public static void f(int [][]a,int [][]b)
	{
		int r[][] = new int[4][2];
		int t = 0;
		for (int i = 0; i < r[0].length; i++) 
		{
			//
			for (int j = 0; j < a.length; j++) 
			{
				t = 0;
				for (int k = 0; k < a[i].length; k++) 
				{
					t += a[j][k] * b[k][i];
				}
				r[j][i] = t;
			}
		}
		for (int i = 0; i < r.length; i++) 
		{
			for (int j = 0; j < r[i].length; j++) 
			{
				System.out.print("  " + r[i][j]);
			}
			System.out.println();
		}
	}
	public static void multiply(int [][]a,int [][]b)
	{
		int r[][] = new int[4][2];
		for (int i = 0; i < r.length; i++) 
		{
			for (int j = 0; j < r[i].length; j++) 
			{
				r[i][j] = a[i][0] * b[0][j] + a[i][1] * b[1][j] + a[i][2] * b[2][j];
			}
		}
		for (int i = 0; i < r.length; i++) 
		{
			for (int j = 0; j < r[i].length; j++) 
			{
				System.out.print("  " + r[i][j]);
			}
			System.out.println();
		}
	}
	public static void fun(int [][]a,int [][]b)
	{
		int r[][] = new int[2][2];
		r[0][0] = a[0][0] * b[0][0] + a[0][1] * b[1][0];
		r[0][1] = a[0][0] * b[0][1] + a[0][1] * b[1][1];
		r[1][0] = a[1][0] * b[0][0] + a[1][1] * b[1][0];
		r[1][1] = a[1][0] * b[0][1] + a[1][1] * b[1][1];
		for (int i = 0; i < r.length; i++) 
		{
			for (int j = 0; j < r[i].length; j++) 
			{
				System.out.print("\t" + r[i][j]);
			}
		}
	}
	public static void main(String[] args) 
	{
		int a[][] = new int[2][2];
		a[0][0] = 1;
		a[0][1] = 6;
		a[1][0] = 3;
		a[1][1] = 8;
		int b[][] = new int[2][2];
		b[0][0] = 2;
		b[0][1] = 2;
		b[1][0] = 9;
		b[1][1] = 7;
//		fun(a,b);
		int x[][] = new int[][] {{1,2,3},{4,5,6},{7,8,9},{11,12,13}};
		int y[][] = new int[][] {{1,2},{3,4},{5,6}};
		multiply(x,y);
		f(x,y);
	}
}
