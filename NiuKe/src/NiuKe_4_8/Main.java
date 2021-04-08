package NiuKe_4_8;

import java.io.*;
import java.util.Objects;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/4/8 下午 18:54
 */

interface A
{
}

interface C
{
}

interface B extends A
{
}

public class Main implements A
{

    public static void main(String[] args)
    {

    }


    //小乐乐获得4个最大数，请帮他编程找到最大的数。
    public static void main4(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = br.readLine().split(" ");
        int max = Integer.parseInt(strings[0]);
        for (int i = 1; i < strings.length; i++)
        {
            if (max < Integer.parseInt(strings[i]))
            {
                max = Integer.parseInt(strings[i]);
            }
        }
        System.out.println(max);
    }

    //小乐乐会不会被叫家长
    public static void main3(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String[] strings = br.readLine().split(" ");
        int a = Integer.parseInt(strings[0]),
                b = Integer.parseInt(strings[1]),
                c = Integer.parseInt(strings[2]);

        if (((a + b + c) / 3.0) < 60)
        {
            System.out.println("YES");
        } else
        {
            System.out.println("NO");
        }
    }


    //成绩转换成等级制
    public static void main2(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        if (num > 100 || num < 0)
        {
            System.out.println("F");
        } else if (num >= 90)
        {
            System.out.println("A");
        } else if (num >= 80)
        {
            System.out.println("B");
        } else if (num >= 70)
        {
            System.out.println("C");
        } else if (num >= 60)
        {
            System.out.println("D");
        } else
        {
            System.out.println("E");
        }
    }

    //叫家长人数
    public static void main1(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int count = 0;
        for (int i = 0; i < num; i++)
        {
            String[] strings = br.readLine().split(" ");
            int a = Integer.parseInt(strings[0]),
                    b = Integer.parseInt(strings[1]),
                    c = Integer.parseInt(strings[2]);
            if (average(a, b, c) < 60)
            {
                count++;
            }
        }
        System.out.println(count);
    }

    public static double average(int a, int b, int c)
    {
        return (a + b + c) / 3.0;
    }

}
