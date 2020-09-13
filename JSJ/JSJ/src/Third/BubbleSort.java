/**
 * 
 */
package Third;

import java.util.Scanner;

/**
*  @Description     冒泡排序
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月13日下午8:46:59
*/
public class BubbleSort 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int[] numbers = new int[8];
		System.out.println("请输入8个数据：");
		for (int i = 0; i < numbers.length; i++) 
		{
			numbers[i] = sc.nextInt();
		}
		for(int i = numbers.length-1;i > 0;i--)
		{
			for (int j = 0; j < i; j++) 
			{
			    if(numbers[j] > numbers[i])
			    {
			    	int temp = numbers[j];
			    	numbers[j] = numbers[j+1];
			    	numbers[j+1] = temp;
			    }
			}
		}
		System.out.println("冒泡排序结果：");
		for (int i = 0; i < numbers.length; i++) 
		{
			System.out.print(numbers[i] + "\t");
		}
		sc.close();
	}
}
