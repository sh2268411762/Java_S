/**
 * 
 */
package Third_Demo;

/**
*  @Description     封装储户信息以及部分功能
*  @author          孙豪
*  @version         1.0
*  @Date            2020年9月14日上午9:47:25
*/
public class Account 
{
	private String number = null;        //卡号
	private String name = null;          //姓名
	private String password = null;      //密码
	private double money = 0.0;          //余额
	
	//构造方法，生成多个储户信息
	public Account(String number,String name,String password, double money)
	{
		this.number = number;
		this.name = name;
		this.password = password;
		this.money = money;
	}
	protected String get_number()  //获取卡号
	{
		return number;
	}
	protected String get_name()    //获取姓名
	{
		return name;
	}
	protected String get_password()  //获取密码
	{
		return password;
	}
	protected double get_money()      //获取余额
	{
		return money;
	}
	protected void sub(double mon)   //取钱——余额减少
	{
		money -= mon;
	}
	protected void add(double mon)    //存钱——余额增加
	{
		money += mon;
	}
}
