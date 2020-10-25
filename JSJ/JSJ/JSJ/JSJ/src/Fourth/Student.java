/**
 * 
 */
package Fourth;

/**
*  @Description     学生类
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月21日上午11:29:33
*/
public class Student extends Person
{
	String schoolname;    //增加属性 schoolname
	public void GotoSchool()  //增加方法 GotoSchool
	{
		System.out.println("I am going to school");
	}
	
	public static void main(String[] args)
	{
		Student s1 = new Student();
		s1.name = "孙豪";
		s1.age = 20;    //引用继承自父类的变量
		s1.schoolname = "西安财经大学";
		s1.say();       //调用继承自父类的方法
		s1.GotoSchool();//调用子类方法
		System.out.println("My name is " + s1.name);
		System.out.println("My schoolname is " + s1.schoolname);
	}
}
