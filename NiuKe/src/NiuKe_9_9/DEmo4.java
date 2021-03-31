/**
 * 
 */
package NiuKe_9_9;

import java.util.Scanner;

/**
*  @Description     整数反转(溢出则输出0)
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月9日上午10:36:59
*/
public class DEmo4 {
	public static int reverse(int x) 
	{
		long sum = 0;
		boolean t = true;
		if(x < 10 && x > -10)
		{
			sum = x;
		}
		else
		{
			if(x < 0)
			{
				x = -x;
				t = !t;
			}
			while(x > 0)
			{
				sum = sum * 10 + x % 10;
				x /= 10;
			}
		}
		if(t == false)
		{
			sum = - sum;
			if(sum < -2147483648)
			{
				sum = 0;
			}
			return (int)sum;
		}
		else
		{
			if(sum > 2147483647)
			{
				sum = 0;
			}
			return (int)sum;
		}
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		x = reverse(x);
		System.out.println(x);
		sc.close();
	}
}
