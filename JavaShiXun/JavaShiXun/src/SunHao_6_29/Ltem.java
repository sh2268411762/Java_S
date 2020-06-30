/**
 * 
 */
package SunHao_6_29;

/**
*  @Description     物品类
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月29日上午10:45:00
*/
public class Ltem 
{
	String serNum;
	String tradeName;
	String prodDes;
	int price;
	
	public void SearchName(Ltem p)
	{
		System.out.println("商品名字为：" + p.tradeName);
	}
	public void SearchPrice(Ltem p)
	{
		System.out.println("商品价格为：" + p.price);
	}
	public void SearchDes(Ltem p)
	{
		System.out.println("商品描述为： " + p.prodDes);
	}
}
