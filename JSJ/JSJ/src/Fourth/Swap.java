/**
 * 
 */
package Fourth;

/**
 * @Description 交换
 * @author 孙豪
 * @version 版本
 * @Date 2020年9月28日下午7:28:00
 */
public class Swap
{
	static void swap(AA_a a, AA_a b)
	{
		a.a = a.a ^ b.a;
		b.a = a.a ^ b.a;
		a.a = a.a ^ b.a;
	}

	public static void main(String[] args)
	{
		AA_a a1 = new AA_a();
		AA_a a2 = new AA_a();

		a1.a = 10;
		a2.a = 20;
		System.out.println(a1.a + " " + a2.a);
		swap(a1, a2);
		System.out.println(a1.a + " " + a2.a);
	}

}
