/**
 * 
 */
package NiuKe_9_9;

/**
*  @Description     功能
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月9日上午10:05:55
*/
public class Demo1 
{
		private static int x = 100;
		@SuppressWarnings("static-access")
		public static void main(String args[ ])
		{
			Demo1 hs1 = new Demo1();
			hs1.x++;
			Demo1 hs2 = new Demo1();
			hs2.x++;
			hs1=new Demo1();
			hs1.x++;
			Demo1.x--;
		 System.out.println( "x=" +x);
		}
}
