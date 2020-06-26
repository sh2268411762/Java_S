/**
 * 
 */
package HomeWork;

/**
*  @Description     打印水仙花数
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月26日下午8:32:07
*/
public class Demo_6_24_7 
{
	public static void main(String[] args) 
	{
		int i = 100;
		System.out.println("100到999之间的水仙花数有：");
		for(;i < 1000;i++)
		{
			int a = i % 10;//个位
			int b = (i / 10) % 10;//十位
			int c = i / 100;//百位
			
			if(i == (a * a * a + b * b * b + c * c * c))
			{
				System.out.print("\t" + i);
			}
		}
	}
}
