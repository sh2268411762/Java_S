/**
 * 
 */
package NiuKe_9_9;

/**
*  @Description     两数之和
*  @author          孙豪
*  @version         版本
*  @Date            2020年9月9日上午10:33:06
*/
public class Demo3 
{
    public static int[] twoSum(int[] nums, int target) 
    {
        int a[] = {0,0};
        for(int i = 0;i < nums.length;i++)
        {
            for(int j = i + 1;j < nums.length;j++)
            {
                if((nums[i] + nums[j]) == target)
                {
                    a[0] = i;
                    a[1] = j;
                }
            }
        }
        return a;
    }
    public static void main(String[] args) 
    {
        int nums[] = {2,7,11,15};
        int target = 9;
        int ret[] = twoSum(nums,target);
         System.out.println("[" + ret[0] + "," + ret[1] + "]");
    }
}
