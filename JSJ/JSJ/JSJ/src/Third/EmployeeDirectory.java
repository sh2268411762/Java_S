/**
 * 
 */
package Third;

/**
*  @Description     员工信息操作
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月14日上午9:21:25
*/
public class EmployeeDirectory 
{
	public static void main(String[] args) 
	{
		Employee []dir = new Employee[4]; //创建数组
		Employee e1 = new Employee(); //通过构造方法1生成对象e1
		e1.setName("张三");// 通过setName  e1 赋值
		e1.setSalary(10000);//通过setSalar  e1赋值
		dir[0] = e1; //把e1存进数组
		
		dir[1] = new Employee();  //使用默认值和构造方法1对对象初始化
		for (int i = 2; i <= 3; i++) 
		{
			dir[i] = new Employee("user" + i,200);  //通过构造方法2完成对象初始化
		}
		
		for (int i = 0; i < dir.length; i++) //输出员工信息
		{
			System.out.println("姓名：" + dir[i].getName() + ",工资：" + dir[i].getSalary());
		}
	}
}
