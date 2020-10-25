/**
 * 
 */
package Fourth;

import java.util.*;

/**
 * @Description 员工，经理工资问题
 * @author 孙豪
 * @version 版本
 * @Date 2020年9月25日下午6:48:06
 */

class NewEmployee // 员工类，父类
{
	private String name;
	private double salary;
	private Date hireDay;  //工龄

	// 构造方法
	public NewEmployee(String n, double s, int year, int month, int day)
	{
		name = n;
		salary = s;
		GregorianCalendar calendar = new GregorianCalendar(year, month - 1, day); //时区
		hireDay = calendar.getTime();
	}

	public String getName()
	{
		return name;
	}

	public double getSalary()
	{
		return salary;
	}

	public Date getHireDay()
	{
		return hireDay;
	}

	// 员工工资提成,无法被继承
	public void raiseSalary(double byPercent)
	{
		double raise = salary * byPercent / 100;
		salary += raise;
	}
}

class NewManager extends NewEmployee // 经理类，子类
{
	private double bonus;

	public NewManager(String n, double s, int year, int month, int day)
	{
		super(n, s, year, month, day);
		bonus = 0;
	}

	public double getSalary()
	{
		double baseSalary = super.getSalary(); // 奖金，经理提成
		return baseSalary + bonus;
	}

	public void setBonus(double b)
	{
		bonus = b;
	}
}

public class ManagerTest
{
	public static void main(String[] args)
	{
		NewEmployee e = new NewEmployee("员工", 50000, 1989, 10, 1);
		e.raiseSalary(50);
		System.out.println(e.getName() + ":" + e.getSalary());
		
		NewManager boss = new NewManager("经理", 80000, 1987, 12, 15);
		boss.setBonus(5000);
		System.out.println(boss.getName() + ":" + boss.getSalary());
	}
}
