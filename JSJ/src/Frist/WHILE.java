/**
 * 
 */
package Frist;

/**
*  @Description     计算大于100小于200的数之和
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月8日下午7:12:54
*/
public class WHILE 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		int i =100;
		while(i < 200)
		{
			i++;
			sum += i;
		}
		System.out.println("   while:大于100且小于200的数字之和为：" + sum);
		
		sum = 0;
		i = 100;
		do {
			i++;
			sum += i;
		}while(i < 200);
		System.out.println("do while:大于100且小于200的数字之和为：" + sum);
	}
}
