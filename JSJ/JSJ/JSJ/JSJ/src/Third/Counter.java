/**
 * 
 */
package Third;

/**
*  @Description     对象计数器
*  					当新创建一个该类的对象时，计数器加一
*  					当删除一个改类的对象时，计数器减一
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月13日下午8:54:17
*/
public class Counter 
{
	public static int count = 0;    //记录对象数的静态成员变量计数器
	public Counter()
	{
		count++;
		System.out.println("(添加)新数据 = " + count);
	}
	
	public static void delete(Counter o)
	{
		count--;
		System.out.println("(删除)新数据 = " + count);
		o = null;
		System.gc();   //收回无用对象
	}
	@SuppressWarnings("unused")
	public static void main(String[] args) 
	{
		Counter []objs = new Counter[5];
		for (Counter obj : objs) 
		{
			obj = new Counter();
		}
		Counter.delete(objs[1]);
		Counter.delete(objs[0]);
	}
}
