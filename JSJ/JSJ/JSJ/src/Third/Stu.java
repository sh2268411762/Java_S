/**
 * 
 */
package Third;

/**
*  @Description     构造方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月13日下午7:25:10
*/
public class Stu 
{
	int num;
	String name;
	
	Stu(int l_num,String l_name)         //定义构造方法
	{
		this.num = l_num;
		this.name = l_name;              //对成员变量num，name初始化
	}
	Stu(String l_name)                     //构造方法重载
	{
		this.num = 00000;
		this.name = l_name;
	}
	
	public static void main(String[] args) 
	{
		Stu s1 = new Stu(1831050199,"孙豪");
		Stu s2 = new Stu(1831050198,"刘辰鑫");
		Stu s3 = new Stu("二球");
		System.out.println("学号：" + s1.num + "\t姓名：" + s1.name);
		System.out.println("学号：" + s2.num + "\t姓名：" + s2.name);
		System.out.println("学号：" + s3.num + "\t姓名：" + s3.name);
	}
}
