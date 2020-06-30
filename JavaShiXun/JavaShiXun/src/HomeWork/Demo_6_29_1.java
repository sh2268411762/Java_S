/**
 * 
 */
package HomeWork;

/**
*  @Description     
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月29日下午7:32:50
*/
public class Demo_6_29_1 
{
	String name;
	int age;
	
	public void menu()
	{
		System.out.println("1、新增客户");
		System.out.println("2、删除客户");
		System.out.println("3、修改客户");
		System.out.println("4、查找客户");
		System.out.println("0、退出程序");
	}
	public void eat()
	{
		System.out.println("吃饭");
	}
	public void sleep(int hour)
	{
		System.out.println("睡了" + hour + "小时");
	}
	public int getAge()
	{
		return age;
	}
	
	
	public static void main(String[] args) 
	{
		Demo_6_29_1 c = new Demo_6_29_1();
		
		c.menu();
		c.name = "孙悟空";
		c.age = 500;
		c.eat();
		System.out.println(c.getAge());
		c.sleep(30);
	}
}
