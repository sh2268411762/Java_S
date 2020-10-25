/**
 * 
 */
package Fourth;

/**
 * @Description   将员工和经理放进同一数组，创建一个父类类型的数组，则子类放入时会进行隐式转换
 * @author        孙豪
 * @version       1.0
 * @Date          2020年9月25日下午7:42:30
 */
public class EmployeeArray
{
	public static void main(String[] args)
	{
		NewEmployee[] s = new NewEmployee[3];
		NewManager boss = new NewManager("经理", 80000, 1987, 12, 15);
		boss.setBonus(5000);
		s[0] = boss;
		s[1] = new NewEmployee("员工1", 50000, 1989, 10, 1);
		s[2] = new NewEmployee("员工2", 40000, 1990, 3, 15);
		for (NewEmployee n : s)
		{
			System.out.println("name = " + n.getName() + ",salary = " + n.getSalary());
		}
	}
}
