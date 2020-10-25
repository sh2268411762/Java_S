/**
 * 
 */
package Fourth;

/**
*  @Description     自定义堆栈
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月25日下午8:01:43
*/

abstract class Access // 定义一个抽象的类Access，提供基本的存入、取出操作
{
	abstract void put(char c);

	abstract char get();
}

class LinkedList
{
	char data;
	LinkedList back; // 后继<--->next
	LinkedList forward; // 前驱<--->prev
}

class MyStack extends Access
{
	private LinkedList bottom = new LinkedList(); // 初始化栈底
	private LinkedList top = bottom; // 栈顶

	// 实现接口Access的put（）方法，该方法向栈存一个字符
	public void put(char c)
	{
		top.forward = new LinkedList();
		top.forward.data = c;
		top.forward.back = top;
		top = top.forward;
	}

	// 实现接口Access的get()方法，该方法从栈中取出一个字符
	public char get()
	{
		if (top != bottom)
		{
			char ch = top.data;
			top.back.forward = null;
			top = top.back;
			return ch;
		} else
		{
			System.out.println("这个栈为空！");
			return '\0';
		}
	}

}

public class DataTest
{
	public static void main(String[] args)
	{
		MyStack s = new MyStack();
		s.put('x');
		s.put('y');
		s.put('z'); // 向栈 s 中存入3个字符
		System.out.println("In Stack:");
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
		System.out.println(s.get());
	}
}
