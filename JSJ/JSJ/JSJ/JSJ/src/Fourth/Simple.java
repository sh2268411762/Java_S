/**
 * 
 */
package Fourth;

/**
 * @Description 继承类
 * @author 孙豪
 * @version 版本
 * @Date 2020年9月21日上午11:48:38
 */

class A
{
	int i;

	void showi()
	{
		System.out.println("i: " + i);
	}
}

class B extends A // A是B的父类
{
	int k;

	void show()
	{
		System.out.println("k: " + k);
		showi();
	}

	void sum()
	{
		System.out.println("i + k: " + (i + k));
	}
}

public class Simple
{
	public static void main(String[] args)
	{
		A superOb = new A(); // 创建一个A类的对象
		B subOb = new B(); // 创建一个B类的对象
		superOb.i = 10; // 对父类对象的成员赋值
		System.out.println("父类内容：");
		superOb.showi();

		subOb.i = 7; // 对子类继承得到的变量i赋值
		subOb.k = 9;
		System.out.println("子类内容：");
		subOb.show();
		System.out.println("子类中 i + k 的和：");
		subOb.sum();
	}
}
