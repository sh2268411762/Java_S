/**
 * 
 */
package Third_Demo;

/**
*  @Description     复数
*  @author          李梓豪
*  @version         版本
*  @Date            2020年9月20日下午17:50:38
*/
public class Complex
{
	int RealPart;    //实部
	int ImaginPart;  //虚部
	
	public Complex()   //构造函数1
	{
		super();
		this.ImaginPart = 0;
		this.RealPart = 0;
	}

	public Complex(int r, int i)   //构造函数2
	{
		super();
		RealPart = r;
		ImaginPart = i;
	}
	
	
	
	
	public int getRealPart()
	{
		return RealPart;
	}

	
	public void setRealPart(int realPart)
	{
		RealPart = realPart;
	}

	
	public int getImaginPart()
	{
		return ImaginPart;
	}

	
	public void setImaginPart(int imaginPart)
	{
		ImaginPart = imaginPart;
	}

	
	
	@Override
	public boolean equals(Object obj)
	{
		// TODO Auto-generated method stub
		return super.equals(obj);
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
		
		Complex c3 = new Complex(4,6);
		boolean istrue = true;
		istrue = c3.equals(c2);
		System.out.println(istrue);
	}
}
