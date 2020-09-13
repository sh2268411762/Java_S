/**
 * 
 */
package Third;

/**
*  @Description     对象的基本使用方法
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月13日下午8:08:27
*/
public class PassTest 
{
	float ptValue;
	public void changeInt(int value)
	{
		System.out.println("changeInt:" + value); //11
		value = 55;
	}
	public void changeArrayValue(int xc[])
	{
		System.out.println("changeArrayValue:" + xc[1]);//9
		xc[1] = 6;
	}
	
	public static void main(String[] args) 
	{
		int val = 11;
		int sc[] = {1,9};
		PassTest pt = new PassTest();
		pt.ptValue = 20;   //引用成员变量ptValue
		pt.changeInt(val); //方法调用(传值)    
		System.out.println("val = " + val);//11
		pt.changeArrayValue(sc);//方法调用（引用）
		System.out.println("sc[1] = " + sc[1]);  //6
	}
}
