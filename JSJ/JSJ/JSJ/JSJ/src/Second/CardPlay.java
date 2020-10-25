/**
 * 
 */
package Second;
import java.util.*;
/**
*  @Description     模拟的Java发牌游戏，将两副牌发给4个人，留8张，最后输出底牌和每个人手里的牌
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月10日下午7:08:10
*/
public class CardPlay 
{
	public static void main(String[] args) 
	{
		int[] a = new int[108];//存储108张牌的数组
		int[][] player = new int[4][25];//4个玩家个25张牌
		int leftNum = 108;//当前剩余牌
		int ranNum;
		Random random = new Random();//生成随机数
		for(int i = 0;i < a.length;i++)
		{
			a[i] = (i + 1) % 54;
			if(a[i] == 0)//大小王
			{
				a[i] = 54;
			}
		}
		
		//循环发牌
		for(int i = 0;i < 25;i++)//为每个人发牌
		{
			for(int j = 0;j < player.length;j++)//生成随机下标
			{
				ranNum = random.nextInt(leftNum);//生成随机数
				player [j][i] = a[ranNum];//发牌
				a[ranNum] = a[leftNum - 1];//删除已经发过的牌
				leftNum--;
			}
		}
		
		//循环输出玩家手中的牌
		for (int i = 0; i < player.length; i++) 
		{
			System.out.print("玩家" + i + "的牌：");
			for (int j = 0; j < player[i].length; j++) 
			{
				System.out.print(" " + player[i][j]);
			}
			System.out.println();
		}
		
		//底牌
		System.out.print("底牌：");
		for (int i = 0; i < 8; i++) 
		{
			System.out.print(" " + a[i]);
		}
		System.out.println();
	}
}
