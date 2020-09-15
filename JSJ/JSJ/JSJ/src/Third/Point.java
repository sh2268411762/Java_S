/**
 * 
 */
package Third;

/**
*  @Description     定义二维空间中的点Point和基本方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月13日下午7:08:01
*/
public class Point 
{
	static int x = 0;
	static int y = 0;
	public static void move(int dx,int dy)  //移动点坐标的方法
	{
		x += dx;
		y += dy;
	}
	public static void alert()
	{
		System.out.println("x = " + x + ",y = " + y);
	}
	@SuppressWarnings("static-access")
	public static void main(String[] args) 
	{
		Point p = new Point();
		p.move(1,2);
		p.alert();
		p.move(2, 3);
		p.alert();
	}
}
