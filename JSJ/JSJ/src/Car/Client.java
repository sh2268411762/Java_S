/**
 * 
 */
package Car;

/**
*  @Description     功能
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月25日下午11:25:16
*/
public class Client
{
	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		IDriver ZhangSan = new Driver();
		ICar benz = new Benz();
		ZhangSan.drive(benz);
		ICar bmw = new BMW();
		ZhangSan.drive(bmw);
	}
}
