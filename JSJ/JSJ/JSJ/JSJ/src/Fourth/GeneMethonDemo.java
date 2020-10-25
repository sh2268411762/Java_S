/**
 * 
 */
package Fourth;

/**
 * @Description 泛型方法的定义和使用(泛型方法与泛型类没有必然联系，普通类中也可以定义泛型方法)
 * @author 孙豪
 * @version 版本
 * @Date 2020年10月1日下午11:13:15
 */
class NewPoint<T1, T2>
{
	T1 x;
	T2 y;

	/**
	 * @return x
	 */
	public T1 getX()
	{
		return x;
	}

	/**
	 * @param x 要设置的 x
	 */
	public void setX(T1 x)
	{
		this.x = x;
	}

	/**
	 * @return y
	 */
	public T2 getY()
	{
		return y;
	}

	/**
	 * @param y 要设置的 y
	 */
	public void setY(T2 y)
	{
		this.y = y;
	}

	// 定义泛型方法
	@SuppressWarnings("hiding")
	public <T1, T2> void printPoint(T1 x, T2 y)
	{
		T1 m = x;
		T2 n = y;

		System.out.println("This point is:" + m + "," + n);
	}
}

public class GeneMethonDemo
{
	public static void main(String[] args)
	{
		// 实例化泛型类
		NewPoint<Integer, Integer> p1 = new NewPoint<Integer, Integer>();
		p1.setX(10);
		p1.setY(20);
		p1.printPoint(p1.getX(), p1.getY()); // 调用泛型方法

		NewPoint<Double, String> p2 = new NewPoint<Double, String>();
		p2.setX(25.4);
		p2.setY("东经180度");
		p2.printPoint(p2.getX(), p2.getY());
	}
}
