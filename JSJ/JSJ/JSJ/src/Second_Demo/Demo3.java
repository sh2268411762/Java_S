/**
 * 
 */
package Second_Demo;

/**
*  @Description     
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月10日下午11:09:44
*/
public class Demo3 
{
	public static void main(String[] args) 
	{
		int arr[] = {1,2,3,4,5};
		print(arr);
		f(arr);
		print(arr);
	}
	private static void f(int []a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			a[i] *= i;
		}
	}
	private static void print(int []a)
	{
		for (int i = 0; i < a.length; i++) 
		{
			System.out.println(a[i]);
		}
	}
}
