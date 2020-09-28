/**
 * 
 */
package Fourth;

/**
*  @Description     匿名内部类
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月28日下午7:54:00
*/

interface Exam
{
	void print1();
}
public class Other4
{
	public Exam test()
	{
		return new Exam()
		{
			public void print1()
			{
				System.out.println("Hello World!");
			}
		};
	}
	
	public static void main(String[] args)
	{
		Other4 c = new Other4();
		Exam e = c.test();
		e.print1();
	}
}
