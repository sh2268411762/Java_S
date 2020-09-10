/**
 * 
 */
package Second;

/**
*  @Description     一维数组的最大值及其所在位置
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月9日下午5:00:58
*/
public class MaxNum 
{
	public static void main(String[] args) 
	{
		final int ARRAY_SIZE = 10;
		int a[] = new int [ARRAY_SIZE];
		int max = 0;    //最大值
		int index = 0;  //最大值的下标
		for (int i = 0; i < a.length; i++) 
		{
			a[i] = (int) (Math.random() * 10);//产生随机数并赋值给数组
			System.out.print("\t" + a[i]);
		}
		System.out.println();
		max = a[0];
		for (int i = 1; i < a.length; i++) 
		{
			if(a[i] > max)  //比较大小
			{
				max = a[i];  //交换数值
				index = i;   //记录下标
			}
		}
		System.out.println("a[" + index + "]" + "最大值" + "为" + max);
	}

}
