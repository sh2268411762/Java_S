/**
 * 
 */
package Fourth;

/**
 * @Description 运行多态
 * @author 孙豪
 * @version 版本
 * @Date 2020年9月25日下午7:28:26
 */

class Aa
{
	void print()
	{
		System.out.println("A");
	}
}

class Bb extends Aa
{
	void print()
	{
		System.out.println("B");
	}
}

public class Poly
{
	public static void main(String[] args)
	{
		Aa a = new Aa(); // 父类对象实例化
		Bb b = new Bb(); // 子类对象实例化
		Aa c = new Bb(); // 子类转换为父类（隐式转换）

		a.print();
		b.print();
		c.print();
	}
}
