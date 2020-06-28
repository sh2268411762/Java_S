/**
 * 
 */
package SunHao_6_28;

import java.util.Scanner;

/**
*  @Description     杨辉三角
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月28日下午2:35:37
*/
public class SunHao_6_28_5 
{
	public static void main(String[] args) 
	{
		int line = 10;
		Scanner sc = new Scanner(System.in);
//		line = sc.nextInt();
		
		int[][] Y = new int[line][];
		for(int i = 0;i < line;i++)
		{
			Y[i] = new int[i+1];//第i行的总元素个数
			Y[i][0] = 1;
			Y[i][i] = 1;
			
			
			for(int j = 1;j < i;j++)
			{
				Y[i][j] = Y[i-1][j-1] + Y[i-1][j];
			}
		}
		
		for(int i = 0;i < Y.length;i++)
		{
			for(int j = 0;j < Y[i].length;j++)
			{
				System.out.print(" " + Y[i][j]);
			}
			System.out.println();
		}

	}
}
