/**
 * 
 */
package NiuKe_9_9;

/**
*  @Description     功能
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月9日上午10:09:49
*/
public class Demo2 
{
	public static void main(String[] args) {
		Thread[] ths = new Thread[3];
		for(int i = 0;i < 3;i++)
		{
			ths[i] = new Thread(new Runnable()
				{
				public void run()
				{
					for(int j = 0;j < 5;j++)
					{
						System.out.println(j);
					}
					System.out.println(" ");
				}
				});
		}
		for(Thread th:ths)
		{
			th.start();
		}
	}
}
