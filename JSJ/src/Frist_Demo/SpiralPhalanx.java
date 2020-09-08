/**
 * 
 */
package Frist_Demo;

import java.util.Scanner;

/**
*  @Description     螺旋方阵
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月8日下午8:21:14
*/
public class SpiralPhalanx 
{
	public static void main(String[] args) 
	{
		System.out.print("请输入数字：");
		Scanner sc = new Scanner(System.in);
		
		int number = sc.nextInt();//方阵边长
		int[][] matrix = new int[number][number];//二维数组
		int max = number * number;//方阵最大数
		int row = 0, col = 0;//下标
		int direction = 0;
		for (int j = 1; j <= max; j++) 
		{
			matrix[row][col] = j;
			switch (direction) 
			{
			case 0 ://将数字存进数组
				if (col + 1 >= number || matrix[row][col + 1] > 0) 
				{
					direction += 1;
					direction %= 4;//1
					row += 1;
				} 
				else 
				{
					col = col + 1;
				}
				break;
			case 1 ://将数字存进数组
				if (row + 1 >= number || matrix[row + 1][col] > 0) 
				{
					direction += 1;
					direction %= 4;//2
					col -= 1;
				} 
				else 
				{
					row = row + 1;
				}
				break;
			case 2 :
				if (col - 1 < 0 || matrix[row][col - 1] > 0) 
				{
					direction += 1;
					direction %= 4;//3
					row = row - 1;
				} 
				else 
				{
					col = col - 1;
				}
				break;
			case 3 :
				if (row - 1 < 0 || matrix[row - 1][col] > 0) 
				{
					direction += 1;
					direction %= 4;//0
					col += 1;
				} 
				else 
				{
					row = row - 1;
				}
				break;
			default :
				System.out.println("ERROR");
				System.exit(0);
			}
		}
		for (int j = 0; j < number; j++) 
		{
			for (int k = 0; k < number; k++) 
			{
				// 判断输出最大数的长度
				int size = ((number * number) + "").length();
				for (int i = 0; i <= (size - (matrix[j][k] + "").length() + 1); i++) 
				{
					System.out.print(" ");
				}
				System.out.print(matrix[j][k]);
			}
			System.out.println("");
		}
		sc.close();
	}
}
