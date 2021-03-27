package NiuKe_3_22;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/3/23 上午 1:03
 */
public class Main
{
    //变种水仙花数 - Lily Number：把任意的数字，从
    // 中间拆分成两个数字，比如1461 可以拆分
    // 成（1和461）,（14和61）,（146和1),
    // 如果所有拆分后的乘积之和等于自身，则是一个Lily Number。
    //例如：
    //655 = 6 * 55 + 65 * 5
    //1461 = 1*461 + 14*61 + 146*1
    //求出 5位数中的所有 Lily Number。
    public static void main(String[] args)
    {
        for (int i = 10000; i < 100000; i++)
        {
            if (isDaffodils(i))
            {
                System.out.printf("%d ", i);
            }
        }
    }

    public static boolean isDaffodils(int num)
    {
        int sum = 0;
        int a = num % 10,
                b = num % 100,
                c = num % 1000,
                d = num % 10000;
        int A = num / 10,
                B = num / 100,
                C = num / 1000,
                D = num / 10000;
        if (num == (a * A + b * B + c * C + d * D))
        {
            return true;
        } else
        {
            return false;
        }
    }


    //KiKi非常喜欢网购，在一家店铺他看中了一件衣服，他了解到，
    // 如果今天是“双11”（11月11日）则这件衣服打7折，
    // “双12” （12月12日）则这件衣服打8折，
    // 如果有优惠券可以额外减50元（优惠券只能在双11或双12使用），
    // 求KiKi最终所花的钱数。
    public static void main7(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strings = str.split(" ");

        Double a = Double.parseDouble(strings[0]);  //衣服价格
        int b = Integer.parseInt(strings[1]);       //月份
        int c = Integer.parseInt(strings[2]);       //日期
        int d = Integer.parseInt(strings[3]);       //优惠券

        double ret = 0.0;
        if (11 == b && 11 == c)  //双十一
        {
            ret = a * 0.7;
            if (1 == d)
            {
                if (ret - 50 < 0)
                {
                    System.out.print("0.00");
                } else
                {
                    System.out.printf("%.2f", (ret - 50));
                }
            } else
            {
                System.out.printf("%.2f", ret);
            }
        } else if (12 == b && 12 == c)  //双十二
        {
            ret = a * 0.8;
            if (1 == d)
            {
                if (ret - 50 < 0)
                {
                    System.out.print("0");
                } else
                {
                    System.out.printf("%.2f", (ret - 50));
                }
            } else
            {
                System.out.printf("%.2f", ret);
            }
        } else
        {
            System.out.printf("%.2f", ret);
        }
    }


    //从键盘任意输入一个字符，编程判断是否是字母（包括大小写）。
    public static void main6(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            char ch = str.charAt(0);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            {
                System.out.println("YES");
            } else
            {
                System.out.println("NO");
            }
        }
    }

    //输入一个十六进制数a，和一个八进制数b，
    // 输出a+b的十进制结果（范围-231~231-1）。
    public static void main5(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strings = str.split(" ");
        Long a = Long.parseLong(strings[0].substring(2), 16);
        Long b = Long.parseLong(strings[1], 8);
        System.out.println(a + b);
    }

    //从键盘输入5个学生的成绩（整数），
    // 求他们的平均成绩（浮点数，保留一位小数）。
    public static void main4(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        String[] strings = str.split(" ");

        int a = Integer.parseInt(strings[0]);
        int b = Integer.parseInt(strings[1]);
        int c = Integer.parseInt(strings[2]);
        int d = Integer.parseInt(strings[3]);
        int e = Integer.parseInt(strings[4]);

        double ret = (a + b + c + d + e) / 5.0;
        System.out.printf("%.1f", ret);
    }


    //学生信息管理系统是学校教学管理的重要工具，
    // 现有一名学生基本信息如下：
    // 姓名-Jack，年龄-18，性别-Man，
    // 请按照输出样例的格式输出该学生的信息。
    public static void main3(String[] args)
    {
        System.out.println("Name    Age    Gender");
        System.out.println("---------------------");
        System.out.println("Jack    18     man");
    }

    //你的手机丢了，在屏幕上输出信息告诉大家。
    public static void main2(String[] args)
    {
        System.out.println("I lost my cellphone!");
    }

    //BoBo买了一箱酸奶，里面有n盒未打开的酸奶，KiKi喜欢喝酸奶，
    // 第一时间发现了酸奶。KiKi每h分钟能喝光一盒酸奶，
    // 并且KiKi在喝光一盒酸奶之前不会喝另一个，
    // 那么经过m分钟后还有多少盒未打开的酸奶？
    public static void main1(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            String[] strings = str.split(" ");
            double[] array = new double[strings.length];
            for (int i = 0; i < strings.length; i++)
            {
                array[i] = Double.parseDouble(strings[i]);
            }
            double ret = array[2] / array[1];
            ret = Math.ceil(ret);
            int temp = (int) (array[0] - ret);
            System.out.println(temp);
        }
    }
}
