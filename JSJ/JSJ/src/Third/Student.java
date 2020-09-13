/**
 * 
 */
package Third;

/**
*  @Description     学生类
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月13日下午6:45:46
*/
public class Student extends Birthday
{
	int num;      //学号
	String name;  //姓名
	Birthday day; //出生日期
	public static void main(String[] args) 
	{
		Student stu = new Student();
		stu.num = 1831050199;
		stu.name = "孙豪";
		stu.year = 1999;
		stu.month = 8;
		stu.data = 27;
		System.out.println("学号        ：" + stu.num);
		System.out.println("姓名        ：" + stu.name);
		System.out.println("出生年月：" + stu.year + "年" + stu.month + "月" + stu.data + "日");
	}
}
