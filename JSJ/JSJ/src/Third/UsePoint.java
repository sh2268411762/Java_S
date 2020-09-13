/**
 * 
 */
package Third;
import Third_mypack.NewPoint;

/**
*  @Description     计算任意两个点之间的距离
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月13日下午11:35:25
*/
public class UsePoint 
{
	public static void main(String[] args) 
	{
		NewPoint p1 = new NewPoint(1.2,2.0);
		NewPoint p2 = new NewPoint(2.0,5.5);   //创建两个NewPoint对象
		
		System.out.println("点p1坐标：" + p1.x + "," + p1.y);
		System.out.println("点p2坐标：" + p2.x + "," + p2.y);
		System.out.println("点p1到点p2的距离：" + p1.distanceTo(p2));
	}
}
