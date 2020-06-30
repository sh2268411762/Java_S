/**
 * 
 */
package SunHao_6_29;

/**
*  @Description     类和对象
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月29日上午9:34:48
*/
public class SunHao_6_29_1 
{
	public static void main(String[] args) 
	{
		//创建对象
		Person p1 = new Person();//实例化一个对象
		p1.name = "孙悟空";
		p1.age = 500;
		p1.sex = "男";
		
		p1.eat();
		System.out.println(p1.name + "的性别为 " + p1.sex);
		
		
		SunHao_6_29_2 p2 = new SunHao_6_29_2();
		p2.ModalCode = "VIVO IQOO";
		p2.Corol = "魅力黑";
		p2.ModalCode = "376778429";
		
		p2.call();
		p2.message();
		
	}
}
