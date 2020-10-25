/**
 * 
 */
package Fourth;

/**
 * @Description 类型通配符(有时候逻辑上需要一个同时表示Point<I,I>和Point<D,D>父类的一个引用类型)
 * @author 孙豪
 * @version 版本
 * @Date 2020年10月1日下午11:22:44
 */
public class GWildCardTest
{
	public static void main(String[] args)
	{
		Box<String> name = new Box<String>("孙豪");
		Box<Integer> age = new Box<Integer>(20);
		Box<Double> high = new Box<Double>(172.5);

		getData(name);
		getData(age);
		getData(high);
	}

	public static void getData(Box<?> data)
	{
		System.out.println("data:" + data.getData());
	}
}

class Box<T>
{
	private T data;

	public Box()
	{
	}

	public Box(T data)
	{
		setData(data);
	}

	/**
	 * @return data
	 */
	public T getData()
	{
		return data;
	}

	/**
	 * @param data 要设置的 data
	 */
	public void setData(T data)
	{
		this.data = data;
	}

}