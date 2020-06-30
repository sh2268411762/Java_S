/**
 * 
 */
package SunHao_6_29;

/**
*  @Description     商品
*  @author          孙豪
*  @version         版本
*  @Date            2020年6月29日上午10:51:17
*/
public class SunHao_6_29_3 
{
	public static void main(String[] args) 
	{
		//实例化
		Ltem p1 = new Ltem();
		Ltem p2 = new Ltem();
		
		p1.tradeName = "海南贵妃芒";
		p1.serNum= "0109827731";
		p1.prodDes = "吃了就能成贵妃";
		p1.price = 1000;
		
		p2.tradeName = "耐克Z2020";
		p2.serNum = "0123987433";
		p2.prodDes = "耐克最新款，穿上赛刘翔，全国第一不再是梦想";
		p2.price = 988888;
		
		p1.SearchDes(p1);
		p1.SearchName(p1);
		p1.SearchPrice(p1);
		
		System.out.println();
		p2.SearchDes(p2);
		p2.SearchName(p2);
		p2.SearchPrice(p2);
	}
}
