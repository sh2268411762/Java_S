/**
 * 
 */
package Frist;

/**
*  @Description     功能
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月8日下午7:24:17
*/
public class BREAK 
{
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		for (int i = 0; i < 100; i++) 
		{
			if(i == 10)
			{
				break;
			}
			System.out.print("i:" + i + "\t");
		}
		System.out.println("循环完成！");
		
		boolean t = true;
		first:
		{
			second:
			{
				third:
				{
					System.out.println("Before the break;");
					if(t)//(!t)
					{
						break second;
					}
					System.out.println("This won't execute1");
				}
				System.out.println("This won't execute2");
			}
			System.out.println("This is after second biock");
		}
	}
}
