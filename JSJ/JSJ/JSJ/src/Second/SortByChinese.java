/**
 * 
 */
package Second;

import java.text.Collator;
import java.util.Arrays;
import java.util.Comparator;

/**
*  @Description     对数组按中文名称排序
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月10日下午5:56:48
*/
public class SortByChinese 
{
	@SuppressWarnings({ "unchecked", "rawtypes" })
	public static void main(String[] args) 
	{
		String [] str = {"孙豪","王翔","刘辰鑫","李梓豪"};
		Arrays.parallelSort(str);
		for(int i = 0;i < str.length;i++)
		{
			System.out.println(str[i]);
		}
		System.out.println("---------------------------------------------------------");
		//Collator类是用来执行区分语言环境的字符串比较，可选择China
		Comparator com = Collator.getInstance(java.util.Locale.CHINA);
		//根据指定比较器产生的顺序对指定对象数组进行排序
		Arrays.parallelSort(str,com);
		for(int i = 0;i < str.length;i++)
		{
			System.out.println(str[i]);
		}
	}
}
