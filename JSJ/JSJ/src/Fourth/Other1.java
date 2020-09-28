/**
 * 
 */
package Fourth;

/**
*  @Description     成员内部类
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月28日下午7:41:39
*/
public class Other1
{
	private int k = 20;
	public static void f1()
	{
		
	}
	
	public class Inner1
	{
		public void f()
		{
			System.out.println("In inner Class");
		}
	}
}
//编译产生Other1.class 和 Other$Inner1.class两个文件
