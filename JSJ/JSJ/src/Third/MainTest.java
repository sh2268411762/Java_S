/**
 * 
 */
package Third;

/**
*  @Description     命令行参数
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月13日下午8:41:44
*/
public class MainTest 
{
	public static void main(String[] args) 
	{
		int n = args.length;
		if(n == 0)
		{
			System.out.println("no");
		}
		else
		{
			System.out.println("num:" + n);
			for (int i = 0; i < n; i++) 
			{
				System.out.println("args[" + i + "] = " + args[i]);
			}
		}
	}
}
