/**
 * 
 */
package Fourth;

/**
*  @Description     Person类
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月21日上午11:25:52
*/
public class Person
{
	protected String name;
	protected int age;
	
	public void say()
	{
		System.out.println(name + " can say");
	}

	/**
	 * @return name
	 */
	public String getName() //返回name
	{
		return name;
	}

	/**
	 * @param name 要设置的 name
	 */
	public void setName(String name)  //设置name
	{
		this.name = name;
	}
	
}
