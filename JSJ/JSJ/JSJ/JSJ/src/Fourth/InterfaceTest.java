/**
 * 
 */
package Fourth;

/**
*  @Description     接口类
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月25日下午8:59:56
*/

interface IA
{
	int a = 1;

	void showa();
}

interface IB extends IA // 继承自IA
{
	int b = 2;

	void showB();
}

interface IC extends IA, IB // 继承自IA和IB
{
	int c = 3;

	void showc();
}

public class InterfaceTest implements IC
{
	public void showa()
	{
		System.out.println("aaaaa");
	}

	public void showB()
	{
		System.out.println("bbbbb");
	}

	public void showc()
	{
		System.out.println("ccccc");
	}

	@SuppressWarnings("static-access")
	public static void main(String[] args)
	{
		InterfaceTest i1 = new InterfaceTest();
		i1.showa();
		i1.showB();
		i1.showc();
		System.out.println("IA:a = " + i1.a + ",IB:b = " + i1.b + ",IC:c = " + i1.c);
	}
}
