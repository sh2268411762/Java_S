package HomeWork;
import java.util.Scanner;
/**
*  @Description     计算圆的半径
*  @author          孙豪
*  @version         v1.0
*  @Date            2020.06.22
*
*/

public class HomeWork6_22_2 
{
	public static void main(String[] ags)
	{
		System.out.println("请输入圆的半径：");
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		double s = 3.14 * r * r;
		System.out.println("半径为 " + r +" 的圆的面积为：" + s);
	}
}
