package HomeWork;
import java.util.Scanner;

/**
*  @Description     打印简历
*  @author          孙豪
*  @version         v1.0
*  @Date            2020.06.22
*
*/

public class HomeWork6_22_1 
{
	public static void main(String[] args)
	{
		System.out.println("请输入你的姓名");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		
		System.out.println("请输入你的专业");
		String sex = sc.next();
		
	    System.out.println("请输入你的年龄");
		int age = sc.nextInt();
		
		System.out.println("****************************************");
		System.out.println("个人简历：");
		System.out.println("\t姓名：" + name);
		System.out.println("\t年龄：" + age);
		System.out.println("\t专业：" + sex);
	}

}
