/**
 * 
 */
package Fourth;

/**
 * @Description 继承与重写
 * @author 孙豪
 * @version 版本
 * @Date 2020年9月21日下午12:02:26
 */

class SuperCla
{
	int a = 3;
	int b = 4;
	public void show()
	{
		System.out.println("super result = " + (a + b));
	}
}
class SubCla extends SuperCla  //子类
{
	int a = 10;   //重写父类中变量 a
	public void show()   //重写父类中方法 show
	{
		int c = a * b;
		System.out.println("sub result = " + c);
	}
}

public class OverrideTest
{
	public static void main(String[] args)
	{
		SuperCla sp = new SuperCla();
		SubCla sb = new SubCla();
		
		sp.show();   //父类show
		System.out.println("In Super Class:a = " + sp.a);  //引用父类a
		sb.show();   //子类show，父类show已经被重写
		System.out.println("In Sub Class:a = " + sb.a);  //引用子类a
	}
}
