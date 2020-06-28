/**
 * 
 */
package SunHao_6_28;
import java.awt.List;
import java.util.ArrayList;


/**
*  @Description     集合List
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月28日下午3:46:33
*/
public class SunHao_6_28_10 
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args) 
	{
		//定义集合
		@SuppressWarnings("rawtypes")
		ArrayList list = new ArrayList();
		//添加元素
		list.add(1);
		list.add(578);
		list.add(578);
		list.add(578);
		list.add(578);
		list.add(786.8);
		list.add("WuKong");
		list.add(0,100);//按下标新增
		//获取元素
		System.out.println(list.get(1));
		//获取集合长度
		System.out.println(list.size());
		//遍历
		for(int i = 0;i < list.size();i++)
		{
			System.out.print(list.get(i) + " ");
		}
		//删除
		list.remove(3);//按下标删除
		System.out.println(list);
		//改
		
		//包含
		System.out.println(list.contains(578));
		System.out.println(list.contains(78));
		//清空
		list.clear();
		System.out.println(list);
		
	}
}
