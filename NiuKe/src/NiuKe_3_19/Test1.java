package NiuKe_3_19;


/*
  @author 枳洛淮南
 * @version 1.0
 * @Description 牛客
 * @Date 2021/3/19 上午 1:49
 */

import java.io.IOException;
import java.util.*;

public class Test1
{
    public static void main(String[] args)
    {
        long n = 20210321;
        String str = Long.toString(n);
        char[] ch = str.toCharArray();
        int[] array = new int[ch.length];
        for (int i = 0; i < str.length(); i++)
        {
            array[i] = Integer.parseInt(String.valueOf(ch[i]));
        }
        System.out.println(Arrays.toString(array));
        System.out.println(array.toString());   //打印地址


        Stack<Integer> queue = new Stack<Integer>();
        while (n > 0)
        {
            int temp = (int) (n % 10);
            queue.push(temp);
            n /= 10;
        }

        int[] a = new int[queue.size()];
        for (int i = 0; i < a.length; i++)
        {
            a[i] = queue.pop();
        }
        System.out.println(Arrays.toString(a));
    }

    //计算带余除法
    public static void main14(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt(), b = sc.nextInt();
        System.out.println(a / b + " " + a % b);
    }

    //计算表达式的值
    public static void main13(String[] args)
    {
        int a = 40, c = 212;
        int ret = (-8 + 22) * a - 10 + c / 2;
        System.out.println(ret);
    }

    //字符转ASCII码
    public static void main12(String[] args) throws IOException
    {
        System.out.println(System.in.read());
        //使用read()方法读取一个字符，本来返回值就是int，没什么好说的
    }

    //交换两个数并输出
    public static void main11(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        String[] s1 = str.split(",");
        String[] s11 = s1[0].split("=");    //a = 1
        int i1 = Integer.parseInt(s11[1]);
        String[] s22 = s1[1].split("=");    //b = 2
        int i2 = Integer.parseInt(s22[1]);
        System.out.println(s11[0] + "=" + i2 + "," + s22[0] + "=" + i1);
    }

    //出生日期输入输出
    public static void main10(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        System.out.println("year=" + str.substring(0, 4));
        System.out.println("month=" + str.substring(4, 6));
        System.out.println("date=" + str.substring(6, 8));
    }

    //ASCII 码
    public static void main9(String[] args)
    {
        String str = "73,32,99,97,110,32,100,111,32,105,116,33";
        String[] s1 = str.split(",");
        for (String s : s1)
        {
            int ch = Integer.parseInt(s);
            System.out.printf("%c", ch);
        }
    }

    //字符金字塔
    public static void main8(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        char c = scanner.nextLine().charAt(0);
        System.out.println("    " + c);
        System.out.println("   " + c + " " + c);
        System.out.println("  " + c + " " + c + " " + c);
        System.out.println(" " + c + " " + c + " " + c + " " + c);
        System.out.println(c + " " + c + " " + c + " " + c + " " + c);
    }


    //学生基本信息输入输出
    public static void main7(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String str = sc.next();

        String[] s1 = str.split(";");
        String[] s2 = s1[1].split(",");
        double[] s3 = new double[s2.length];
        for (int i = 0; i < s2.length; i++)
        {
            s3[i] = Double.parseDouble(s2[i]);
        }
        System.out.printf("The each subject score of  No. %s is %.2f, %.2f, %.2f.",
                s1[0], s3[0], s3[1], s3[2]);
    }


    //输出三科成绩
    public static void main6(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        int i1 = sc.nextInt(), i2 = sc.nextInt(), i3 = sc.nextInt();
        System.out.println("score1=" + i1 + ",score2=" + i2 + ",score3=" + i3);
    }


    //printf 的返回值
    public static void main5(String[] args)
    {
        System.out.println("Hello world!");
        System.out.println("Hello world!".length());
    }


    //缩短二进制
    public static void main4(String[] args)
    {
        Integer i = 1234;
        System.out.printf("0%o 0x%x", i, i);
    }


    //飞机
    public static void main3(String[] args)
    {
        for (int i = 0; i <= 10; i += 2)
        {
            if (i <= 2)
            {
                System.out.println("     **");
            } else if (i <= 6)
            {
                System.out.println("************");
            } else
            {
                System.out.println("    *  *");
            }
        }
    }

    //整数类型位数
    public static void main2(String[] args)
    {
        //bytes方法已自动除完8，不同于.size()方法还需要手动除以
        //Java 中 long long 就是 Long
        System.out.println("The size of short is " + Short.BYTES + " bytes.");
        System.out.println("The size of int is " + Integer.BYTES + " bytes.");
        System.out.println("The size of long is " + Long.BYTES + " bytes.");
        System.out.println("The size of long long is " + Long.BYTES + " bytes.");

    }


    //小v组成的大V
    public static void main1(String[] args)
    {
        System.out.println("v   v\n v v\n  v");
    }
}
