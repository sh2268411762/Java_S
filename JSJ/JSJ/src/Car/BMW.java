/**
 * 
 */
package Car;

/**
*  @Description     宝马及两个接口
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月25日下午9:23:44
*/

interface IDriver
{
	public void drive(ICar car);
}

interface ICar
{
	public void run();
}

public class BMW implements ICar
{
	public void run()
	{
		System.out.println("宝马车正在运行......");
	}
}
