/**
 * 
 */
package Fourth;

/**
*  @Description     抽象类
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月25日下午7:54:28
*/

abstract class Abs
{
	abstract void show();

	abstract void show(int i);
}

//定义抽象类 Abs 的子类Real
public class Real
{
	int x;

	void show() // 实现抽象类
	{
		System.out.println("x = " + x);
	}

	void show(int i)
	{
		x = i;
		System.out.println("x = " + x);
	}

	public Real(int _x)
	{
		x = _x;
	}
	
	
	public static void main(String[] args)
	{
		Real r1 = new Real(10);
		r1.show();
		r1.show(78);
	}
}
