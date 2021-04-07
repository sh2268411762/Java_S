package NiuKe_4_2;

import java.io.*;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/4/7 下午 12:28
 */
public class Main
{
    //小乐乐学会了自定义函数，BoBo老师给他出了个问题，根据以下公式计算m的值。
    //
    //其中 max3函数为计算三个数的最大值，如： max3(1, 2, 3) 返回结果为3。
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");

        double a = Double.parseDouble(strings[0]), b = Double.parseDouble(strings[1]), c = Double.parseDouble(strings[2]);
        double ret = max3(a + b, b, c) / (max3(a, b + c, c) + max3(a, b, b + c));
        System.out.printf("%.2f\n", ret);
    }

    public static double max3(double a, double b, double c)
    {
        if (a >= b)
        {
            if (a >= c)
            {
                return a;
            } else
            {
                return c;
            }
        } else
        {
            if (b >= c)
            {
                return b;
            } else
            {
                return c;
            }
        }
    }


    //给定n个整数和一个整数x，小乐乐想从n个整数中判断x出现几次，请编程帮他实现。
    public static void main5(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());    //共有 n 个整数

        String[] strings = br.readLine().split(" ");
        int num = Integer.parseInt(br.readLine());  //要查找的数
        int ret = 0;
        for (int i = 0; i < n; i++)
        {
            if (num == Integer.parseInt(strings[i]))
            {
                ret++;
            }
        }
        System.out.println(ret);
    }

    //输出C和C++输出Hello world的代码。
    public static void main4(String[] args)
    {
        System.out.println("printf(\"Hello world!\\n\");\n" +
                "cout << \"Hello world!\" << endl;");
    }

    //KiKi这学期努力学习程序设计基础，要期末考试了，BoBo老师告诉他，
    // 总成绩包括四个部分，如下：
    //总成绩 = 实验成绩 * 20% + 课堂表现成绩 * 10% +
    // 过程考核成绩 * 20% + 期末上机考试成绩 * 50%，
    // 现在输入KiKi的各项成绩，请计算KiKi的总成绩。
    public static void main3(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");

        double ret = 0.2 * Integer.parseInt(strings[0])
                + 0.1 * Integer.parseInt(strings[1])
                + 0.2 * Integer.parseInt(strings[2])
                + 0.5 * Integer.parseInt(strings[3]);
        System.out.printf("%.1f\n", ret);
    }

    //2020年来到了，KiKi要对他的n位好朋友说
    // n遍”Happy new year!Good luck!”的祝福语。
    public static void main2(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());

        for (int i = 0; i < n; i++)
        {
            System.out.println("Happy new year!Good luck!");
        }
    }

    //KiKi知道了大一三科比较重要课程的分数，
    // 包括：程序设计基础，高数，英语，请编程帮他找到三科中的最高分。
    public static void main1(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] strings = br.readLine().split(" ");

        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        int max = Math.max(a, b);
        max = Math.max(max, Integer.parseInt(strings[2]));
        System.out.println(max);
    }
}
