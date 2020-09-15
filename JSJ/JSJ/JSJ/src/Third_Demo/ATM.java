/**
 * 
 */
package Third_Demo;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
*  @Description     ATM功能方法实现
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月14日上午10:00:21
*/
public class ATM 
{
	Account act;
	public ATM()
	{
		act = new Account("000","test","111",5000);  //生成Account实例
	}
	
	//******************  欢迎界面      *****************
	protected void Welcome()
	{
		String str = "---------------------------------------------";
		System.out.print(str + "\n");
		System.out.print("1、取款.\n2、查询.\n3、存款.\n4、退出系统.\n");
		System.out.print(str + "\n");
	}
	//********************  登录系统       *********************************
	protected void Load_Sys() throws Exception
	{
		String card,pwd;
		int counter = 0;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //包含标准输入输出流
		do {
			System.out.println("请输入卡号：");
			card = br.readLine(); //从键盘读入卡号信息
			System.out.println("请输入密码：");
			pwd = br.readLine();  //从键盘读入密码信息
			if(!isRight(card,pwd))
			{
				System.out.println("卡号或密码有误，您还有" + (2-counter) + "次机会");
				counter++;
			}
			else
			{
				SysOpter();//登陆成功
			}
		}while(counter < 3);//登录失败
		System.exit(1); //程序退出
	}
	//*****************  系统操作提示     ******************
	protected void SysOpter()throws Exception
	{
		int num;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //包含标准输入输出流
		System.out.println("(其他值会退出程序)请输入您要操作的项目：（1-4）");
		num = br.read();
		switch(num) //字符num的ASCII
		{
		case 49://1
			BetBalance();
			break;
			
		case 50://2
			Inqu_Info();
			break;
			
		case 51://3
			AddBalance();
			break;
			
		case 52:
			Exit_Sys();
			break;
		}
		System.exit(1);
	}
	//**************  信息查询     **********************
	protected void Inqu_Info() throws Exception
	{
		System.out.print("------------------------------\n" + "账号：" + act.get_number() + "\n姓名：" + act.get_name() + "\n" + "余额：" + act.get_money() + "\n------------------------------\n");
		SysOpter();
	}
	//*****************  取款    ***************
	public void BetBalance() throws Exception
	{
		String str = null,str1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //包含标准输入输出流
		do {
			System.out.println("请输入取款数目：");
			str = br.readLine();
			double qu = Double.valueOf(str).doubleValue();  //将字符串转换为double
			if(qu > act.get_money())
			{
				System.out.println("余额不足，请重新输入您的取款数目：");
			}
			else
			{
				act.sub(qu); //取款成功
				System.out.println("取款成功，您的账户余额为：" + act.get_money());
				Welcome();
				SysOpter();
			}
		}while(true);
	}
	//***************  存款     *********************
	public void AddBalance() throws Exception
	{
		String str = null,str1;
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));  //包含标准输入输出流
		do{
			System.out.println("请输入存款数目：");
			str = br.readLine();
			double qu = Double.valueOf(str).doubleValue();  //将字符串转换为double
			act.add(qu);
			System.out.println("存款成功，您的账户余额为：" + act.get_money());
			Welcome();
			SysOpter();
		}while(true);
	}
	//*****************  判断卡内是否有钱***************
	protected boolean isBalance()
	{
		if(act.get_money() < 0)
		{
			return false;
		}
		else
		{
			return true;
		}
	}
	//*****************  卡号密码是否正确    *************** 
	protected boolean isRight(String card,String pwd)
	{
		if(act.get_number().equals(card) && act.get_password().equals(pwd))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	//*****************      结束系统          ***************
	protected void Exit_Sys()
	{
		System.out.println("感谢使用，程序退出！！！");
		System.exit(1);
	}
}
