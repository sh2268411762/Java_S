/**
 * 
 */
package HomeWork;

/**
*  @Description     银行本金问题
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月26日下午6:40:14
*/
public class Demo_6_24_2 
{
	public static void main(String[] args) 
	{
		double prin = 10000.0;
		double Air = 0.003;
		
		for(int i = 0;i < 5;i++)
		{
			prin += (prin * Air);
		}
		System.out.println("5年后，本金为：" + prin);
	}
}
