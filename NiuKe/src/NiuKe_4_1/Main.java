package NiuKe_4_1;

import java.util.Arrays;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/4/1 下午 18:12
 */
public class Main
{
    //有一个有序数字序列，从小到大排序，
    // 将一个新输入的数插入到序列中，保证插入新数后，序列仍然是升序。
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        String[] strings = br.readLine().split(" ");
        int add = Integer.parseInt(br.readLine());
        int i = 0;
        while (i < num && Integer.parseInt(strings[i]) < add)
        {
            System.out.print(strings[i] + " ");
            i++;
        }
        System.out.print(add + " ");
        while (i < num)
        {
            System.out.print(strings[i] + " ");
            i++;
        }
    }


    //输入n科成绩（浮点数表示），统计其中的最高分，最低分以及平均分。
    public static void main9(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        double[] doubles = new double[num];

        String[] strings = br.readLine().split(" ");
        double ret = 0.0;
        for (int i = 0; i < num; i++)
        {
            doubles[i] = Double.parseDouble(strings[i]);
            ret += Double.parseDouble(strings[i]);
        }
        Arrays.sort(doubles);
        System.out.printf("%.2f %.2f %.2f", doubles[num - 1], doubles[0], ret / num);
    }

    //任意输入一个正整数N，统计1~N之间奇数的个数和偶数的个数，并输出。
    public static void main8(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int oddNumber = 0, evenNumbers = 0;
        for (int i = 1; i <= num; i++)
        {
            if (i % 2 != 0)
            {
                oddNumber++;
            } else
            {
                evenNumbers++;
            }
        }
        System.out.println(oddNumber + " " + evenNumbers);
    }

    //今年是2019年，KiKi想知道1~2019中有多少个包含数字9的数。
    // 包含数字的数是指有某一位是“9”的数，例如“2019”、“199”等。
    public static void main7(String[] args)
    {
        String str = null;
        int count = 0;
        for (int i = 9; i < 2020; i++)
        {
            str = new String(String.valueOf(i));
            if (str.contains("9"))
            {
                count++;
            }
        }
        System.out.println(count);
    }

    //已知一个函数y=f(x)，
    // 当x < 0时，y = 1；当x = 0时，y = 0；
    // 当x > 0时，y = -1。
    public static void main6(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if (num < 0)
        {
            System.out.println(1);
        } else if (0 == num)
        {
            System.out.println(0);
        } else
        {
            System.out.println(-1);
        }
    }

    //判断一个整数是否能5整除是一个挺简单的问题，
    // 懒惰的KiKi还是不想自己做，于是找到你帮他写代码，你就帮帮他吧。
    public static void main5(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if (num % 5 == 0)
        {
            System.out.println("YES");
        } else
        {
            System.out.println("NO");
        }
    }

    //这是一个非常简单的题目，意在考察你编程的基础能力。千万别想难了哦。
    // 输入为一行，包括了用空格分隔的四个整数a、b、c、d
    // （0 < a, b, c, d < 100,000）。
    // 输出为一行，为“(a+b-c)*d”的计算结果。
    public static void main4(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] strings = str.split(" ");
        int ret = (Integer.parseInt(strings[0]) + Integer.parseInt(strings[1]) - Integer.parseInt(strings[2])) * Integer.parseInt(strings[3]);
        System.out.println(ret);
    }

    //C++是带类的C语言，这个“++”主要包含三部分内容：
    // 对C语言进行语法上的扩展、面向对象（封装、继承和多态），S
    // TL(即模板)。这学期你将学习C++，学好C++，其
    // 他编程语言都可以很轻松掌握。
    public static void main3(String[] args)
    {
        System.out.println("I will learn C++ well!");
    }

    //有个软件系统登录的用户名和密码为（用户名：admin，密码：admin），
    // 用户输入用户名和密码，判断是否登录成功。
    public static void main2(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            String[] strings = str.split(" ");
            if ("admin".equals(strings[0]) && "admin".equals(strings[1]))
            {
                System.out.println("Login Success!");
            } else
            {
                System.out.println("Login Fail!");
            }
        }
    }


    //给出两幅相同大小的黑白图像（用0-1矩阵）表示，求它们的相似度。
    // 若两幅图像在相同位置上的像素点颜色相同，
    // 则称它们在该位置具有相同的像素点。
    // 两幅图像的相似度定义为相同像素点数占总像素点数的百分比。
    public static void main1(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] strings = str.split(" ");
        int[][] a = new int[Integer.parseInt(strings[0])][Integer.parseInt(strings[1])];
        int[][] b = new int[Integer.parseInt(strings[0])][Integer.parseInt(strings[1])];
        buildingArrays(br, strings, a);

        buildingArrays(br, strings, b);

        int count = 0;
        for (int i = 0; i < Integer.parseInt(strings[0]); i++)
        {
            for (int j = 0; j < Integer.parseInt(strings[1]); j++)
            {
                if (a[i][j] == b[i][j])
                {
                    count++;
                }
            }
        }
        System.out.printf("%.2f", count / Math.pow(Integer.parseInt(strings[0]), 2) * 100);
    }

    public static void buildingArrays(BufferedReader br, String[] strings, int[][] b) throws IOException
    {
        String str;
        for (int i = 0; i < Integer.parseInt(strings[0]); i++)
        {
            str = br.readLine();
            for (int j = 0; j < Integer.parseInt(strings[1]); j++)
            {
                String[] s = str.split(" ");
                b[i][j] = Integer.parseInt(s[j]);
            }
        }
    }
}
