/**
 * 
 */
package Frist;

/**
*  @Description     购鸡方案
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月8日下午8:07:44
*/
public class CHICK 
{
	public static void main(String[] args) 
	{
		int i,j,k,sum = 1;
		for(i = 0;i <= 20;i++)
		{
			for(j = 0;j < 34;j++) 
			{
				for(k = 0;k <=300;k += 3)
				{
					if((5 * i + 3 * j + k / 3) == 100 && (i + j + k) == 100)
					{
						System.out.println(sum + ":公鸡：" + i + "只\t母鸡：" + j + "只\t小鸡：" + k + "只");
						sum++;
					}
				}
			}	
		}
		sum--;
		System.out.println("共有" + sum + " 种买法");
	}
}
