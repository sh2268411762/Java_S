/**
 * 
 */
package Fourth;

/**
*  @Description     this测试
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月21日下午12:34:01
*/
public class ThisTest
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		Local aa = new Local();   //创建同时调用构造方法将 i 赋值为6
	}
}

class Local
{
	public int i = 1;    //成员变量
	Local(int i)  //局部变量
	{
		System.out.println("this.i = " + this.i); //this.i值对象本身的成员变量
		System.out.println("i = " + i);           //局部变量
	}
	Local()
	{
		this(6);
	}
}
