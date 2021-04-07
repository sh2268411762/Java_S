package NiuKe_4_6;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;


/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/4/6 下午 15:00
 */
public class Main
{
    //KiKi知道了什么是质数（只能被1和他自身整除的数），
    // 他现在想知道所有三位整数中，有多少个质数。
    public static void main(String[] args)
    {
        int count = 0;
        for (int i = 101; i <= 999; i += 2)
        {
            if (isPrimeNumber(i))
            {
                count++;
            }
        }
        System.out.println(count);
    }

    private static boolean isPrimeNumber(int num)
    {
        for (int i = 3; i <= Math.sqrt(num); i++)
        {
            if (num % i == 0)
            {
                return false;
            }
        }
        return true;
    }


    //给定一个整数序列，KiKi想把其中的重复的整数去掉，
    // 并将去重后的序列从小到达排序输出。
    public static void main2(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        String[] strings = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();

        for (int i = 0; i < n; i++)
        {
            if (!list.contains(Integer.parseInt(strings[i])))
            {
                list.add(Integer.parseInt(strings[i]));
            }
        }
        Collections.sort(list); //排序
        StringBuilder stringBuffer = new StringBuilder();
        for (Integer integer : list)
        {
            stringBuffer.append(integer).append(" ");
        }
        System.out.println(stringBuffer.toString());
    }

    //KiKi想知道一个n阶方矩是否为上三角矩阵，请帮他编程判定。
    // 上三角矩阵即主对角线以下的元素都为0的矩阵，主对角线为从矩阵的左上角至右下角的连线。
    public static void main1(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    //n 阶方阵
        int[][] array = new int[n][n];

        for (int i = 0; i < n; i++)
        {
            String[] strings = br.readLine().split(" ");
            for (int j = 0; j < n; j++)
            {
                array[i][j] = Integer.parseInt(strings[j]);
            }
        }
        if (fun(array, n))
        {
            System.out.println("YES");
        } else
        {
            System.out.println("NO");
        }

    }

    private static boolean fun(int[][] array, int n)
    {
        for (int i = 0; i < n; i++)
        {
            for (int j = 0; j < i; j++)
            {
                if (array[i][j] != 0)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
