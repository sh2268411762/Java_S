/**
 * 
 */
package Third;

import java.util.Scanner;

/**
*  @Description     计算圆的周长和面积
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月13日下午6:17:02
*/
public class Circle 
{
	float x,y;   //定义圆心x,y坐标
	static float radius;   //定义成员变量（半径）
	public static double area()
	{
		return radius * radius * Math.PI;
	}
	public static double circum()
	{
		return 2 * radius * Math.PI;
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		Circle n = new Circle();   //创建类Circle的对象
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入圆的半径：");
		n.radius = sc.nextFloat();
		n.x = 0;
		n.y = 0;
		System.out.println("面积 = " + area() + "，周长 = " + circum());
		System.out.printf("面积 = %.2f，周长 = %.2f",area(),circum());
		sc.close();
	}
}
