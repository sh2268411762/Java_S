/**
 * 
 */
package Second_Demo;

import java.util.Arrays;

/**
*  @Description     排序
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月10日下午11:00:59
*/
public class Demo2 
{
	private static void fun(int []a)
	{
		Arrays.parallelSort(a);
	}
	private static void f(int []a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			System.out.print(a[i] + "  ");
		}
		System.out.println();
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		int a[] = {78,23,56,34,12,45,67,89};
		Demo2 ma = new Demo2();
		System.out.print("排序前：");
		ma.f(a);
		ma.fun(a);
		System.out.print("排序后：");
		ma.f(a);
	}
}
