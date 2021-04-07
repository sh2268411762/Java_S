package NiuKe_4_7;


import java.io.*;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/4/7 下午 15:39
 */
public class Main
{
    //小乐乐的老师BoBo想知道班级中谁的数学成绩最高，请编程帮他实现。
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());  //输入的整数 n 个同学

        String[] strings = br.readLine().split(" ");    //输入的数学成绩
        int max = -1;
        for (int i = 0; i < num; i++)
        {
            if (max < Integer.parseInt(strings[i]))
            {
                max = Integer.parseInt(strings[i]);
            }
        }
        System.out.println(max);
    }

    //小乐乐想计算一下1!+2!+3!+...+n!。
    public static void main1(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());  //输入的整数 n

        int sum = 1;
        for (int i = 2; i < num + 1; i++)
        {
            sum += factorial(i);
        }
        System.out.println(sum);
    }

    private static int factorial(int i)
    {
        int ret = 1;
        for (; i > 0; i--)
        {
            ret *= i;
        }
        return ret;
    }
}
