/**
 * 
 */
package Demo;

import java.util.Arrays;

/**
*  @Description     可变数组
*  @author          枳洛淮南
*  @version         版本
*  @Date            2020年10月5日下午11:42:40
*/
public class VariableArray
{
	//添加
	private static int[] add(int[] a,int index,int value)
	{
		int[] temp = new int[a.length + 1];
		for (int i = 0; i < temp.length; i++)
		{
			if(i < index)
			{
				temp[i] = a[i];
			}
			if(i == index)
			{
				temp[i] = value;
			}
			if(i > index)
			{
				temp[i] = a[i - 1];
			}
		}
		return temp;
	}
	
	//删除
	private static int[] sub(int[] a,int index)
	{
		int[] temp = new int[a.length - 1];
		for (int i = 0; i < temp.length; i++)
		{
			if(i < index)
			{
				temp[i] = a[i];
			}
			else
			{
				temp[i] = a[i + 1];
			}
		}
		return temp;
	}
	
	//去重
	private static int[] De_dup(int[] a)
	{
		int len = 0;
		int[] temp = new int[a.length];  //临时数组，长度与原数组相同
		for(int i = 0;i < a.length;i++)
		{
			boolean isDup = false;
			//内层循环将原数组的元素逐个比较
			for(int j = i + 1;j <a.length;j++)
			{
				//发现重复元素改变标记并结束当前循环
				if(a[i] == a[j])
				{
					isDup = true;
					break;
				}
			}
			//判断是否有重复
			if(!isDup) //没重复
			{
				temp[len] = a[i];//赋值给临时数组
				len++;
			}
		}
		int[] newArr = new int[len];
		//
		System.arraycopy(temp, 0, newArr, 0, len);
		return newArr;
	}
	
	public static void main(String[] args)
	{
		int[] arr = new int[] {1,2,3,4,5,6,8,9,10};
		System.out.println("添加前数组内容：" + Arrays.toString(arr));
		arr = add(arr,6,7);
		System.out.println("添加后数组内容：" + Arrays.toString(arr));
		arr = add(arr,6,7);
		System.out.println("再添加一个7添加后数组内容：" + Arrays.toString(arr));
		arr = sub(arr,7);
		System.out.println("删除后数组内容：" + Arrays.toString(arr));
		
		arr = add(arr,6,7);
		arr = add(arr,6,7);
		arr = add(arr,6,7);
		arr = add(arr,3,4);
		arr = add(arr,3,4);
		arr = add(arr,3,4);
		System.out.println("原数组：" + Arrays.toString(arr));
		arr = De_dup(arr);
		System.out.println("去重后：" + Arrays.toString(arr));
	}
}
