/**
 * 
 */
package Third;

/**
*  @Description     员工信息获取及设置
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月14日上午9:22:05
*/
public class Employee 
{
	private String name;   //员工姓名
	private double salary; //员工工资
	Employee(String n,double s)  //构造方法2
	{
		name = n;
		salary = s;
	}
	Employee()                   //构造方法1
	{
		name = "unknown";
		salary = 0;
	}
	public String getName()  //获取员工姓名
	{
		return name;
	}
	public void setName(String name)  //设置员工姓名
	{
		this.name = name;
	}
	public double getSalary()  //获取员工工资
	{
		return salary;
	}
	public void setSalary(double salary) //设置员工工资
	{
		this.salary = salary;
	}
}
