/**
 * 
 */
package Fourth;

/**
*  @Description     
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月21日下午12:24:24
*/

/**
 * 
 */
class Employee   //员工类
{
	private String name;
	private int salary;
	public String getDetails()
	{
		return "Name:" + name + "\nSalary:" + salary ;
	}
	/**
	 * 
	 */
	public Employee()   //无参构造函数
	{
		name = "Tom";
		salary = 1234;
	}
	
}


class Manger extends Employee
{
	public String department;   //部门
	//重写 getDetails() 方法
	public String getDetails()
	{
		System.out.println("I am in manager");
		return super.getDetails();   //调用父类中的 getDetails() 方法
	}
	/**
	 * 
	 */
	public Manger()  //manger类的无参构造函数
	{
		super();   //访问父类的无参构造函数，即Employee()
		department = "sale";
	}
	
}

public class Inheritance
{
	public static void main(String[] args)
	{
		Manger m = new Manger();
		System.out.println(m.getDetails());
		System.out.println("department:" + m.department);//sale
	}
}
