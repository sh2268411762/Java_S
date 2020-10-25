/**
 * 
 */
package Car;

/**
*  @Description     功能
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月25日下午11:24:23
*/
public class Driver implements IDriver
{

	public void drive(ICar car)
	{
		car.run();
	}
	
}
