/**
 * 
 */
package Frist;

/**
*  @Description     continue
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月8日下午7:32:14
*/
public class CONTINUE 
{
	public static void main(String[] args) 
	{
		boolean t = false;
		if(t)
		{
			for(int i = 1;i < 20;i++)
			{
				System.out.print(i + " ");
				if(i % 5 != 0)//1 2 3 4  跳出  6 7 8 9 __11 12 13 14 __  16 17 18 19__
				{
					continue;
				}
				//i % 5 == 0   不进入continue 打印换行
				System.out.println("");
			}
		}
		
		outer:
			for(int i = 1;i < 10;i++)
			{
				for(int j = 1;j < 10;j++)
				{
					if(j > i)
					{
						System.out.println();//换行
						continue outer;
					}
					System.out.print("\t" + (i * j));
				}
			}
		System.out.println();
	}

}
