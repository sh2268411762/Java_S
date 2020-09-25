/**
 * 
 */
package Third_mypack;

/**
*  @Description     钟表类
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月20日下午4:14:58
*/
public class Clock
{
	static int hour;
	static int minu;
	static int sec;
	
	public Clock()
	{
		this.hour = 0;
		this.minu = 0;
		this.sec = 0;
	}
	public Clock(int hour, int minu, int sec)
	{
		super();
		this.hour = hour;
		this.minu = minu;
		this.sec = sec;
	}

	@Override
	public String toString()
	{
		String str1 = "";
		if(hour < 10)
		{
			str1 = "0";
		}
		String str2 = "";
		if(minu < 10)
		{
			str2 = "0";
		}
		String str3 = "";
		if(sec < 10)
		{
			str3 = "0";
		}
		return "Clock ：" + str1 + hour + ":" + str2 +minu + ":" + str3 + sec;
	}
	public static void addSecond()
	{
		String str1 = "";
		if(hour < 10)
		{
			str1 = "0";
		}
		String str2 = "";
		if(minu < 10)
		{
			str2 = "0";
		}
		String str3 = "";
		if(sec < 10)
		{
			str3 = "0";
		}
		System.out.println("Clock ：" + str1 + hour + ":" + str2 +minu + ":" + str3 + sec);
		try
		{
			Thread.sleep(1000);
			addSec();
		} catch (InterruptedException e)
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	public int getHour()
	{
		return hour;
	}

	public void setHour(int hour)
	{
		this.hour = hour;
	}

	public int getMinu()
	{
		return minu;
	}

	public void setMinu(int minu)
	{
		this.minu = minu;
	}

	public int getSec()//获取当前时间的秒
	{
		return sec;
	}

	public void setSec(int sec)//设置秒
	{
		this.sec = sec;
	}
	public static void addHour()
	{
		hour += 1;
		if(hour > 23)
		{
			hour = 0;
		}
	}
	public static void addMinu()
	{
		minu += 1;
		if(minu > 59)
		{
			addHour();
			minu = 0;
		}
	}
	public static void addSec()
	{
		sec += 1;
		if(sec > 59)
		{
			addMinu();
			sec = 0;
		}
	}


	public static void main(String[] args)
	{
		Clock c1 = new Clock();
		Clock c2 = new Clock(16,20,40);
		
		c1.setHour(8);
		c1.setMinu(10);
		c1.setSec(56);//修改c1
		
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		
		while(1 > 0)
		{
			addSecond();
		}
	}
}
