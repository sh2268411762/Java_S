/**
 * 
 */
package SunHao_6_23;

/**
*  @Description     交换数字
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月23日上午10:51:44
*/
public class SunHao_6_23_3 
{
	public static void main(String[] args)
	{
		int a = 56;
		int b = 67;
		System.out.println("交换之前：a = " + a + " b = " + b);
		a = a^b;
		b = a^b;
		a = a^b;
		System.out.println("交换之后：a = " + a + " b = " + b);
		a = a + b;
		b = a - b;
		a = a - b;
		System.out.println("再交换 ：a = " + a + " b = " + b);
	}
}
