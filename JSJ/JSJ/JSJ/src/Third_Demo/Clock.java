/**
 * 
 */
package Third_Demo;

/**
*  @Description     Clock类
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月15日下午9:23:56
*/
public class Clock 
{
	private int hour = 0;
	private int minu = 0;
	private int sec = 0;
	
	public Clock()
	{
		super();
		this.hour = 0;
		this.minu = 0;
		this.sec = 0;
	}

	//获取当前时
	public int getHour()
	{
		return hour;
	}

	//设置当前时
	public void setHour(int _hour)
	{
		_hour += hour;
		if(_hour >= 23)
		{
			_hour %= 23;
		}
		this.hour = _hour;
	}

	//获取当前分
	public int getMinu()
	{
		return minu;
	}

	//设置当前分
	public void setMinu(int _minu)
	{
		_minu += minu;
		if(_minu >= 60)
		{
			hour += _minu / 60;
			_minu %= 60;
		}
		this.minu = _minu;
	}

	//获取当前秒
	public int getSec()
	{
		return sec;
	}

	//设置当前秒
	public void setSec(int _sec)
	{
		_sec += sec;
		if(_sec >= 60)
		{
			minu += (_sec / 60);
			_sec %= 60;
		}
		this.sec = _sec;
	}
	public void incSecond()
	{
		this.sec += 1;
	}

	@Override
	public String toString()
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
		return "Time ：" + str1 + hour + "：" + str2 + minu + ":" + str3 + sec;
	}
	
	public static void main(String[] args)
	{
		Clock clo = new Clock();
		System.out.println(clo);
		clo.hour = 21;
		clo.minu = 42;
		clo.sec = 33;
		System.out.println(clo);
//		clo.setSec(25);
		clo.setSec(30);
		clo.setMinu(20);
		System.out.println(clo);
	}
}
