package NiuKe_3_21;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.Scanner;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 牛客 20210321
 * @Date 2021/3/21 下午 23:47
 */
public class Main
{
    //不使用累计乘法的基础上，通过移位运算（<<）实现2的n次方的计算
    public static void main10(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = null;
        while ((str = br.readLine()) != null)
        {
            int in = Integer.parseInt(str);
            int ret = 1;
            while (in > 0)
            {
                ret <<= 1;
                in--;
            }
            System.out.println(ret);
        }
    }

    //实现字母的大小写转换。多组输入输出。
    public static void main9(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            System.out.println(str.toLowerCase(Locale.ROOT));
        }
    }

    //给定一个球体的半径，计算其体积。
    // 其中球体体积公式为 V = 4/3*πr3，其中 π= 3.1415926。
    public static void main8(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        double r = Double.parseDouble(str);
        double v = (4.0 / 3.0) * 3.1415926 * r * r * r;
        System.out.printf("%.3f", v);
    }

    public static void main7(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String a = String.valueOf(br.readLine());

        String[] str = a.split(" ");
        double c = Integer.parseInt(str[0]) + Integer.parseInt(str[1])
                + Integer.parseInt(str[2]);
        double p = (Integer.parseInt(str[0]) + Integer.parseInt(str[1]) + Integer.parseInt(str[2])
        ) / 2.0;
        double s = Math.pow((p * (p - Integer.parseInt(str[0])) * (p - Integer.parseInt(str[1])) * (p - Integer.parseInt(str[2]))), 0.5);
        System.out.printf("circumference=%.2f area=%.2f", c, s);
    }

    //    问题：计算BMI指数（身体质量指数）。BMI指数（即身体质量指数，简称体质指数又称体重，
//    英文为Body Mass
//    Index，简称BMI），是用体重公斤数除以身高米数平方得出的数字，
//    是目前国际上常用的衡量人体胖瘦程度以及是否健康的一个标准。主要用于统计用途，
//    当我们需要比较及分析一个人的体重对于不同高度的人所带来的健康影响时，BMI值是一个中立而可靠的指标
    public static void main6(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int weight = sc.nextInt(), height = sc.nextInt();

        double h = height / 100.0;
        double ret = weight / Math.pow(h, 2);
        System.out.printf("%.2f", ret);
    }

    //依次输入一个学生的3科成绩，在屏幕上输出该学生的总成绩以及平均成绩。
    public static void main5(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble(), b = sc.nextDouble(), c = sc.nextDouble();

        double ret = (a + b + c) / 3.0;
        System.out.printf("%.2f %.2f", (a + b + c), ret);
    }

    //给定秒数seconds (0< seconds < 100,000,000)，把秒转化成小时、分钟和秒。
    public static void main4(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int second = sc.nextInt();

        int h = second / 3600;
        second %= 3600;
        int m = second / 60;
        second %= 60;
        System.out.println(h + " " + m + " " + second);
    }

    //问题：一年约有3.156×107s，要求输入您的年龄，显示该年龄合多少秒。
    public static void main3(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        if (age < 0)
        {
            System.out.println("输入年龄不合法");
        } else
        {
            double ret = age * 3.156 * Math.pow(10, 7);
            System.out.printf("%.0f", ret);
        }
    }

    //给定一个浮点数，要求得到该浮点数的个位数。
    public static void main2(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        double in = sc.nextDouble();
        String[] strings = String.valueOf(in).split("\\.");
        System.out.println(strings[0].substring(strings[0].length() - 1));


//        int ret = (int) in;
//        System.out.println(ret % 10);
    }

    //    问题：KiKi今年5岁了，已经能够认识100以内的非负整数，并且并且能够进行 100 以内的非负整数的加法计算。不过，BoBo老师发现KiKi在进行大于等于100的正整数的计算时，规则如下：
//
//        1.       只保留该数的最后两位，例如：对KiKi来说1234等价于34；
//
//        2.       如果计算结果大于等于 100， 那么KIKI也仅保留计算结果的最后两位，如果此两位中十位为0，则只保留个位。
//
//    例如：45+80 = 25
//
//    要求给定非负整数 a和 b，模拟KiKi的运算规则计算出 a+b 的值。
    public static void main1(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt(), b = sc.nextInt();

        int ret = a + b;
        if (ret >= 100)
        {
            ret = ret % 10 + ret / 10 % 10 * 10;
        }
        System.out.println(ret);
    }
}
