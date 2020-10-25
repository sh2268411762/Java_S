/**
 * 
 */
package Third;

/**
*  @Description     对双操作数和三操作数进行加法操作
*  					方法重载
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月13日下午7:18:38
*/
public class OverLoad 
{
	public static void main(String[] args) 
	{
		OverLoad o = new OverLoad();
		System.out.println("双数操作：" + o.add(9, 8));
		System.out.println("三数操作：" + o.add(4, 5, 6));
	}
	public int add(int a,int b,int c)
	{
		return a + b + c;
	}
	public int add(int a,int b)
	{
		return a + b;
	}
}
