/**
 * 
 */
package NiuKe_9_9;

import java.util.Scanner;

/**
*  @Description     回文数
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月9日上午11:02:21
*/
public class Demo5 
{
	public static boolean isPalindrome(int x) 
	{
		boolean t = true;
		int sum = 0;
		int temp = x;
		if(x < 0)
		{
			t = false;
		}
		else
		{
			while(x >= 10)
			{
				sum = sum * 10 + x % 10;
				x /= 10;
			}
			sum = sum * 10 + x % 10;
			if(sum == temp)
			{
				t = true;
			}
			else
			{
				t = false;
			}
		}
		return t;
    }
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		boolean isTrue = isPalindrome(x);
		System.out.println(isTrue);
		sc.close();
	}
}
