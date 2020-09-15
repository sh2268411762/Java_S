/**
 * 
 */
package Second;

/**
*  @Description     平均分
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月9日下午5:03:18
*/
public class AvgGrade 
{
	public static void main(String[] args) 
	{
		int total = 0;
		int s[] = {75,69,80,85,93,97,79,77,68,90};//定义数组变量
		double avg = 0.0;
		for (int i = 0; i < s.length; i++) 
		{
			total += s[i];
		}
//		avg = total / s.length;//平均分
		avg = total / 10.0;
//		avg = total / 10;
		System.out.println("平均分：" + avg);
	}

}
