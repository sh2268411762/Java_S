/**
 * 
 */
package HomeWork;

/**
*  @Description     1——100求和（跳过个位为3的数）
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月26日下午6:50:18
*/
public class Demo_6_24_3 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for(int i = 1;i < 101;i++)
		{
			if(i % 10 != 3)
			{
				sum += i;
			}
		}
		System.out.println("1到100(跳过个位数为3的数)求和为：" + sum);
	}
}
