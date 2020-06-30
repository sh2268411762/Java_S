/**
 * 
 */
package SunHao_6_29;

/**
*  @Description     钟表类
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月29日上午11:31:31
*/
public class Clock 
{
	static int hour;
	static int minu;
	static int sec;
	
	public static void showTime()
	{
		System.out.println("当前时间：" + hour + ":" + minu + ":" + sec);
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	

	public static void addSec()
	{
		sec++;
		if(sec == 60)
		{
//			minu++;
			addMinu();
			sec = 0;
		}
	}
	
	public  static void addMinu()
	{
		minu++;
		if(minu == 60)
		{
//			hour++;
			addHour();
			minu = 0;
		}
	}
	
	public static void addHour()
	{
		hour++;
		if(hour == 24)
		{
			hour = 0;
		}
	}
	
	
	public static void main(String[] args) 
	{
		hour = 11;
		minu = 48;
		sec = 0;
		
		while(1 > 0)
		{
			showTime();
			addSec();
		}
	}
}
