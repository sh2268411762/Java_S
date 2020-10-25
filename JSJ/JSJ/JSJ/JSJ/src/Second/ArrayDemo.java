/**
 * 
 */
package Second;

import java.util.Arrays;

/**
*  @Description     Arrays类的使用
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月10日下午4:25:36
*/
public class ArrayDemo 
{
	private static void display(Integer a[])
	{
		for(int i = 0;i < a.length;i++)
		{
			System.out.print(a[i] + "  ");
		}
		System.out.println(" ");
	}
    public static void main(String[] args) 
    {
    	Integer array[] = new Integer[9];
    	for(int i = 1;i < array.length + 1;i++)//给数组随机赋值
    	{
    		array[i - 1] = (int)(Math.random() * 100);
    	}
    	//显示原数组
    	System.out.print("      原内容：");
    	display(array);
    	Arrays.sort(array);//排序
    	System.out.print("      排序后：");//显示排序后的数组
    	display(array);
    	
    	//分配
    	Arrays.fill(array, 0,3,-1);
    	System.out.print("执行fill()后：");
    	display(array);
    	
    	Arrays.fill(array, 3,4,39);
    	display(array);
    	//搜索
    	System.out.print("值39的位置:");
    	int index = Arrays.binarySearch(array, 39);
    	System.out.println(index);
	}
}
