/**
 * 
 */
package Third_Demo;

/**
 * @Description clock类
 * @author 孙豪
 * @version 版本
 * @Date 2020年9月15日下午9:58:33
 */
public class clock_1
{
	static int hour;
	static int minu;
	static int sec;

	public static void incSecond() //每隔一秒打印一次
	{
		String str1 = "";
		String str2 = "";
		String str3 = "";
		if(hour < 10)
		{
			str1 = "0";
		}
		if(minu < 10)
		{
			str2 = "0";
		}
		if(sec < 10)
		{
			str3 = "0";
		}
		System.out.println("当前时间：" + str1 + hour + ":" + str2 + minu + ":" + str3 + sec);
		try
		{
			Thread.sleep(1000);
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@SuppressWarnings("static-access")
	public clock_1()
	{
		super();
		this.hour = 0;
		this.minu = 0;
		this.sec = 0;
	}
	public static void addSec()
	{
		sec++;
		if (sec == 60)
		{
			addMinu();
			sec = 0;
		}
	}

	public static void addMinu()
	{
		minu++;
		if (minu == 60)
		{
			addHour();
			minu = 0;
		}
	}

	public static void addHour()
	{
		hour++;
		if (hour == 24)
		{
			hour = 0;
		}
	}

	@SuppressWarnings("unused")
	public static void main(String[] args)
	{
		clock_1 clo = new clock_1();
		hour = 23;
		minu = 59;
		sec = 45;

		while (1 > 0)
		{
			incSecond();
			addSec();
		}
	}
}
