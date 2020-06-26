/**
 * 
 */
package HomeWork;

import java.util.Scanner;

/**
*  @Description     打印金字塔
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月26日下午8:19:40
*/
public class Demo_6_24_6 
{
	public static void main(String[] args) 
	{
		System.out.println("请输入金字塔层数：");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int i = 0;//行
	    int j, k;//空格，*
	    for (i = 1; i < n + 1; i++)
	    {
	        // 观察每行的空格数量，补全循环条件 
	        for (j = 0;j < n - i;j++)
	        {
	            System.out.print(" ");    //输出空格
	        }
	        // 观察每行*号的数量，补全循环条件 
	        for (k = 1;k <= 2 * i - 1;k++)
	        {
	            System.out.print("*");   //每行输出的*号
	        }
	        System.out.print("\n");     //每次循环换行
	    }
	}
}
