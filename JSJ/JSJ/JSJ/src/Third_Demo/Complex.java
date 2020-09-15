/**
 * 
 */
package Third_Demo;

/**
*  @Description     复数
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月15日下午11:35:38
*/
public class Complex
{
	int RealPart;    //实数
	int ImaginPart;  //虚数
	
	public Complex()   //构造函数1
	{
		super();
		this.ImaginPart = 0;
		this.RealPart = 0;
	}

	public Complex(int r, int i)   //构造函数1
	{
		super();
		RealPart = r;
		ImaginPart = i;
	}
	
	
	
	@Override
	public String toString()
	{
		return "Complex ：" + RealPart + " + " + ImaginPart + "j";
	}

	public Complex complexAdd(Complex a)
	{
		this.RealPart += a.RealPart;
		this.ImaginPart += a.ImaginPart;
		Complex c = new Complex();
		c.RealPart = this.RealPart;
		c.ImaginPart = this.ImaginPart;
		return c;
	}
	
	public static void main(String[] args)
	{
		Complex c1 = new Complex(1,2);
		System.out.println(c1);
		Complex c2 = new Complex(3,4);
		System.out.println(c2);
		c2.complexAdd(c1);
		System.out.println(c2);
	}
}
