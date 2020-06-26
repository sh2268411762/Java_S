/**
 * 
 */
package HomeWork;

import java.util.Scanner;

/**
*  @Description     猜数字
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月26日下午8:39:44
*/
public class Demo_6_24_8 
{
	@SuppressWarnings("resource")
	public static void main(String[] args) 
	{
		int number = (int)(Math.random()*100);//获取数字
//		System.out.println(number);
		Scanner sc = new Scanner(System.in);
		System.out.println("开始猜数字：");
		int num = 0;
		
		int count = 0;
		int i = 0;
		for(;i < 20;i++)
		{
			num = sc.nextInt();
			if(num == number)
			{
				count++;
				break;
			}
			else
			{
				if(num > number)
				{
					System.out.println("猜大了，往小点试试");
					count++;
				}
				else
				{
					System.out.println("猜小了，往大点试试");
					count++;
				}
			}
		}
		if(i < 20)
		{
			switch(count)
			{
			case 1:
				System.out.println("你太有才了！");
				break;
				
			case 2:
			case 3:
			case 4:
			case 5:
			case 6:
				System.out.println("这么快就猜出来了，很聪明么！");
				break;
				
			default:
				System.out.println("猜了半天才猜出来，小同志，尚需努力啊！");
				break;
			}
		}
		else
		{
			System.out.println("算了小伙子，20次机会都猜不出来，你重新来吧！");
		}

	}
}
