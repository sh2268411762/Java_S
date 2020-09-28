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

class test
{
	void print()
	{
		System.out.println("A");
	}
}

class Bb extends test
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
		test a = new test(); // 父类对象实例化
		Bb b = new Bb(); // 子类对象实例化
		test c = new Bb(); // 子类转换为父类（隐式转换）

		a.print();
		b.print();
		c.print();
	}
}
