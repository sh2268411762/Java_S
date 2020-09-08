/**
 * 
 */
package Frist_Demo;

/**
*  @Description     交换整数
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月8日下午8:17:28
*/
public class Swap 
{
	public static void main(String[] args) 
	{
		int a = 30;
		int b = 20;
		System.out.println("a:" + a + "\tb:" + b);
		a = a ^ b;
		b = a ^ b;
		a = a ^ b;
		System.out.println("a:" + a + "\tb:" + b);
	}
}
