/**
 * 
 */
package HomeWork;
import java.util.Scanner;

/**
*  @Description     实现一个课程名称和课程代号的转换器
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月26日下午6:27:52
*/
public class Demo_6_24_1 
{
	@SuppressWarnings("resource")
	public static void main(String[] args)
	{
		System.out.println("请输入课程代码：");
		System.out.println("\t0——>退出");
		System.out.println("\t1——>使用Java语言理解程序逻辑 ");
		System.out.println("\t2——>使用HTML语言开发商业站点 ");
		System.out.println("\t3——>使用SQL Server管理和查询数据");
		System.out.println("\t4——>使用C#开发数据库应用程序 ");
		Scanner sc =  new Scanner(System.in);
		int input = sc.nextInt();
		
		if(input != 0)
		{
			do {
				switch(input)
				{
				case 1:
					System.out.println("使用Java语言理解程序逻辑 ");
					break;
					
				case 2:
					System.out.println("使用HTML语言开发商业站点 ");
					break;
					
				case 3:
					System.out.println("使用SQL Server管理和查询数据");
					break;
					
				case 4:
					System.out.println("使用C#开发数据库应用程序 ");
					break;
					
				default:
					System.out.println("输入有误，请重新输入！！！");
					break;
				}
				
				System.out.println("请输入课程代码：");
				input = sc.nextInt();
			}while(input != 0);
			System.out.println("程序退出！！！");
		}
		else
		{
			System.out.println("程序退出！！！");
		}
	}
}
