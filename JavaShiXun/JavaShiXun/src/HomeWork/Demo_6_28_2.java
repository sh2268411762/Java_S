/**
 * 
 */
package HomeWork;

import java.util.Scanner;

/**
*  @Description     选择排序
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月28日下午7:02:59
*/
public class Demo_6_28_2 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int[] arr = new int[] {23,43,27,11,44,35,67,90};
		Scanner sc = new Scanner(System.in);
		System.out.println("1、升序   2、降序：");
		int select = sc.nextInt();
		if(select == 1)
		{
			for(int i = 1;i < arr.length;i++)
			{
				for(int j = 0;j < arr.length - i;j++)
				{
					if(arr[j] > arr[j+1])
					{
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
		}
		else if(select == 2)
		{
			for(int i = 1;i < arr.length;i++)
			{
				for(int j = 0;j < arr.length - i;j++)
				{
					if(arr[j] < arr[j+1])
					{
						int temp = arr[j];
						arr[j] = arr[j+1];
						arr[j+1] = temp;
					}
				}
			}
		}
		else
		{
			System.out.println("输入有误，程序退出！！！");
		}
		
		for(int i = 0;i < arr.length;i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}
