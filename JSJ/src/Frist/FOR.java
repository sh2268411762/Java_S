/**
 * 
 */
package Frist;

/**
*  @Description     计算大于100小于200的数之和
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月8日下午7:18:09
*/
public class FOR 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for(int i = 101;i <= 200;i++)
		{
			sum += i;
		}
		System.out.println("for    :大于100且小于200的数字之和为：" + sum);
		
		sum = 0;
		int a[] = new int[100];
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = 101 + i;
		}
		for (int i : a) 
		{
			sum += i;
		}
		System.out.println("foreach:大于100且小于200的数字之和为：" + sum);
	}
}
