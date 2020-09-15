/**
 * 
 */
package Third;

/**
*  @Description     实例变量和静态变量的区别
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月13日下午8:20:49
*/
public class StaticTest 
{
	static int statInt = 4;
	static double statDouble = 16.9;
	int instInt;
	double instDouble;
	public static void staticMethod()   //输出静态变量的值
	{
		System.out.println("statInt = " + statInt + ",statDouble = " + statDouble);
	}
	public void instMethod()            //输出实例变量的值
	{
		System.out.println("instInt = " + instInt + ",instDouble = " + instDouble);
	}
	public StaticTest(int intArg,double doubleArg)    //构造方法
	{
		instInt = intArg;
		instDouble = doubleArg;
	}
	public static void changestatic(int newInt,double newDouble)   //修改静态变量的值
	{
		statInt = newInt;
		statDouble = newDouble;
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		StaticTest s1 = new StaticTest(1,6.8);
		StaticTest s2 = new StaticTest(2,5.9);
		//调用实例方法
		s1.instMethod();   
		s2.instMethod();
		//调用静态方法
		StaticTest.staticMethod();
		s1.staticMethod();
		s2.staticMethod();
		//改变静态变量的值
		s1.changestatic(88, 9.88);
		//打印静态变量
		s2.staticMethod();
		StaticTest.staticMethod();
	}
}
