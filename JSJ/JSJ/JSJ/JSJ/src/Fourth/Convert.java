/**
 * 
 */
package Fourth;

/**
*  @Description     继承与类型转换
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月21日下午1:06:09
*/

class CA
{
	String s = "class CA";
}
class CB extends CA
{
	String s = "class CB";
}

public class Convert
{
	public static void main(String[] args)
	{
		CB bb = new CB();
		CB b = new CB();
		CA a;
		CA aa;
		
		a = (CA)b;  //显示转换--->子类到父类
		aa = b;     //隐式转换--->子类到父类
		System.out.println(a.s);
		System.out.println(aa.s);
		bb = (CB)a;  //显示转换--->父类到子类
		System.out.println(bb.s);
	}
}
