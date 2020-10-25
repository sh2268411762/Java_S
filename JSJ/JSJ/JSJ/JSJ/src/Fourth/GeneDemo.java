/**
 * 
 */
package Fourth;

/**
 * @Description 泛型类的定义和使用
 * @author 孙豪
 * @version 版本
 * @Date 2020年10月1日下午10:59:13
 */
class Point<T1, T2> // 传入是第一个参数类型为T1，第二个参数类型为T2
{
	T1 x;
	T2 y;

	public T1 getX()
	{
		return x;
	}// 返回类型为T1，值为x

	public void setX(T1 x)
	{
		this.x = x;
	}

	public void setY(T2 y)
	{
		this.y = y;
	}

	public T2 getY()
	{
		return y;
	}
}

public class GeneDemo
{
	public static void main(String[] args)
	{
		// 实例化泛型对象
		Point<Integer, Integer> p1 = new Point<Integer, Integer>();

		p1.setX(10);
		p1.setY(20);
		int x = p1.getX();
		int y = p1.getY();
		System.out.println("This point is:" + x + "," + y);

		Point<Double, String> p2 = new Point<Double, String>();
		p2.setX(25.4);
		p2.setY("东经180度");
		double d = p2.getX();
		String s = p2.getY();
		System.out.println("This point is:" + d + "," + s);
	}
}
