/**
 * 
 */
package SunHao_6_29;

/**
*  @Description     Cat
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月29日下午7:40:47
*/
public class Cat 
{
	private static int Add(int a,int b)
	{
		int sum = 0;
		for(int i = a;i < b;i++)
		{
			sum += i;
		}
		return sum;
	}
	@SuppressWarnings("unused")
	private static double Add(double a,double b)
	{
		double sum = 0;
		for(double i = a;i < b;i++)
		{
			sum += i;
		}
		return sum;
	}
	
	public static void main(String[] args) 
	{
		int sum1 = Add(0,101);
		System.out.println(sum1);
		
		double sum2 = Add(0,101);
		System.out.println(sum2);
	}
}
