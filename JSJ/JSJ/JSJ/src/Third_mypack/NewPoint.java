/**
 * 
 */
package Third_mypack;

/**
*  @Description     
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月13日下午10:55:05
*/
public class NewPoint 
{
	public double x,y;
	public NewPoint(double a,double b)
	{
		x = a;
		y = b;
	}
	public double distanceTo(NewPoint p) //该点到另一点的距离
	{
		return Math.sqrt((x-p.x) * (y-p.x) + (y-p.y) * (y-p.y));
	}
}
