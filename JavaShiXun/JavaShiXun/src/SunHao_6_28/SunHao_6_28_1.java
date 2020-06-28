/**
 * 
 */
package SunHao_6_28;

import java.util.Arrays;
import java.util.Scanner;

/**
*  @Description     数组
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月28日上午9:32:54
*/
public class SunHao_6_28_1 
{
	public static void main(String[] args) 
	{
//		int arr[];
//		int[] a;
//		
//		//初始化
//		//动态初始化
//		arr = new int[500];
//		arr[0] = 90;
//		arr[1] = 88;
//		//静态初始化
//		int[] arr1 = new int[] {1,2,3,4};
//		String[] names = {"tom","yuhsd","uuuud"};
//		
//		//索引
//		names[0] = "ford";
//		names[names.length - 1] = "sunhao";//name.length数组长度
//		
//		int num = 0;
//		for(int i = 0;i < 500;i++)
//		{
//			arr[i] = num;
//			num += 2;
//		}
//		for(int i = 0;i < 500;i++)
//		{
//			System.out.print(" " + arr[i]);
//		}
		
		//成绩
		int[] score1 = new int[10];
		int[] score = new int[10];
		Scanner sc = new Scanner(System.in);
		for(int i = 0;i < score1.length;i++)
		{
			System.out.println("请输入第" + (i+1) + "名学生的成绩");
			score1[i] = sc.nextInt();
		}
		for(int i = 0;i < score.length;i++)
		{
			score[i] = score1[i];
		}
		int min = score1[0],max = score1[0];
		int sum = 0;
		for(int i = 0;i<score1.length;i++)
		{
			sum += score1[i];
			if(score[i] > max)
			{
				int temp = score1[i];
				score1[i] = max;
				max = temp;
			}
			if(score1[i] < min)
			{
				int temp = score1[i];
				score1[i] = min;
				min = temp;
			}
		}
		System.out.println(sum);
		System.out.println("最大值：" + max + " 最小值：" + min + " 平均值" + 1.0 * sum / score.length);
		
		System.out.println("排序（冒泡）：");
			for(int i = 1;i < score.length;i++)
			{
				for(int j = 0;j < score.length - i;j++)
				{
					if(score[j] > score[j+1])
					{
						int temp = score[j];
						score[j] = score[j+1];
						score[j+1] = temp;
					}
				}
			}
			System.out.println(Arrays.toString(score));
	}
}
