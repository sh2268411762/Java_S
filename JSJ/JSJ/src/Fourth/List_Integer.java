/**
 * 
 */
package Fourth;

import java.util.List;

/**
*  @Description     泛型，即参数化类型
*  @author          孙豪
*  @version         版本
*  @Date            2020年10月1日下午10:46:44
*/
public class List_Integer
{
	@SuppressWarnings("unchecked")
	public static void main(String[] args)
	{
		//不用泛型
		Integer i = 10;
		List myIntList = (List) new LinkedList();   //创建一个列表集合对象
		myIntList.add(i);  //向列表中加入一个Integer对象
		Integer x = (Integer)myIntList.iterator().next();  //通过next方法取出元素需要强转
		//由于next方法返回的是Object类型的对象，为了保证Integer变量的类型安全
		
		
		//泛型使用
		List<Integer>myIntList2 = (List<Integer>) new LinkedList();  //指定存储对象类型为Integer
		myIntList2.add(i);
		x = myIntList2.iterator().next(); //不用强转
	}

}
