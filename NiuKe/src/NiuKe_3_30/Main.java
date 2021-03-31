package NiuKe_3_30;

import java.util.Arrays;
import java.util.HashMap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/3/30 下午 18:57
 */
public class Main
{
    //用筛选法求n以内的素数。筛选法求解过程为：将2~n之间的正整数放在数组内存储，
    // 将数组中2之后的所有能被2整除的数清0，
    // 再将3之后的所有能被3整除的数清0 ，
    // 以此类推，直到n为止。数组中不为0 的数即为素数。
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            int num = Integer.parseInt(str);
            int[] array = new int[num - 1];
            for (int i = 0; i < array.length; i++)
            {
                array[i] = i + 2;
            }   //将数组放进去

            for (int i = 2; i <= num / 2; i++)
            {
                for (int j = 0; j < array.length; j++)
                {
                    if (array[j] % i == 0 && array[j] != i)
                    {
                        array[j] = 0;
                    }
                }
            }

            StringBuilder sb = new StringBuilder();
            int count = 0;
            for (int j : array)
            {
                if (j != 0)
                {
                    sb.append(j).append(" ");
                } else
                {
                    count++;
                }
            }
            System.out.println(sb.toString() + "\n" + count);
        }
    }


    //有一个有序数字序列，从小到大排序，
    // 将一个新输入的数插入到序列中，保证插入新数后，序列仍然是升序。
    public static void main7(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());  //序列长度
        String str = br.readLine();
        String[] strings = str.split(" ");
        int[] array = new int[strings.length + 1];
        for (int i = 0; i < strings.length; i++)
        {
            array[i] = Integer.parseInt(strings[i]);
        }
        num = Integer.parseInt(br.readLine());
        array[array.length - 1] = num;
        Arrays.sort(array);
        System.out.print(Main.toString(array));
    }

    private static String toString(int[] array)
    {
        StringBuilder sb = new StringBuilder();
        for (int j : array)
        {
            sb.append(j);
            sb.append(" ");
        }
        return sb.toString();
    }

    //公务员面试现场打分。有7位考官，
    // 从键盘输入若干组成绩，每组7个分数（百分制），
    // 去掉一个最高分和一个最低分，输出每组的平均成绩。
    public static void main6(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        String[] strings = str.split(" ");
        double ret = 0.0;
        int Max = Integer.MIN_VALUE;
        int Min = Integer.MAX_VALUE;
        for (int i = 0; i < strings.length; i++)
        {
            ret += Integer.parseInt(strings[i]);
            Max = Integer.max(Max, Integer.parseInt(strings[i]));
            Min = Integer.min(Min, Integer.parseInt(strings[i]));
        }
        ret = ret - Max - Min;
        System.out.printf("%.2f", ret / 5);
    }

    //KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，
    // 该任务是打印用数字组成的数字三角形图案。
    public static void main5(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;
        StringBuilder sb = new StringBuilder();


        while ((str = br.readLine()) != null)
        {
            int num = Integer.parseInt(str);

            for (int i = 1; i < num + 1; i++)
            {
                for (int j = 1; j < i + 1; j++)
                {
                    sb.append(j);
                    sb.append(" ");
                }
                sb.append("\n");
            }
            System.out.print(sb.toString());
            sb.setLength(0);
        }
    }

    //KiKi访问网站，得到HTTP状态码，但他不知道什么含义，
    // BoBo老师告诉他常见HTTP状态码：2
    // 00（OK，请求已成功），
    // 202（Accepted，服务器已接受请求，但尚未处理。）
    // 400（Bad Request，请求参数有误），
    // 403（Forbidden，被禁止），
    // 404（Not Found，请求失败），
    // 500（Internal Server Error，服务器内部错误），
    // 502（Bad Gateway，错误网关）。
    public static void main4(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = null;
        HashMap<Integer, String> map = new HashMap<>();
        map.put(200, "OK");
        map.put(202, "Accepted");
        map.put(400, "Bad Request");
        map.put(403, "Forbidden");
        map.put(404, "Not Found");
        map.put(500, "Internal Server Error");
        map.put(502, "Bad Gateway");

        while ((str = br.readLine()) != null)
        {
            int statusCode = Integer.parseInt(str);
            System.out.println(map.get(statusCode));
            switch (statusCode)
            {
                case 200:
                    System.out.println("OK");
                    break;

                case 202:
                    System.out.println("Accepted");
                    break;

                case 400:
                    System.out.println("Bad Request");
                    break;

                case 403:
                    System.out.println("Forbidden");
                    break;

                case 404:
                    System.out.println("Not Found");
                    break;

                case 500:
                    System.out.println("Internal Server Error");
                    break;

                case 502:
                    System.out.println("Bad Gateway");
                    break;
            }
        }
    }

    //KiKi想知道这学期他的学习情况，
    // BoBo老师告诉他这学期挂的科目累计的学分，根据所挂学分，
    // 判断KiKi学习情况，10分以上：很危险(Danger++)，
    // 4~9分：危险(Danger)，0~3:Good。
    public static void main3(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int sum = Integer.parseInt(str);

        if (sum >= 10)
        {
            System.out.println("Danger++");
        } else if (sum >= 4)
        {
            System.out.println("Danger");
        } else
        {
            System.out.println("Good");
        }
    }

    //平均身高
    public static void main2(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strings = str.split(" ");
        double sum = 0.0;

        for (int i = 0; i < strings.length; i++)
        {
            sum += Double.parseDouble(strings[i]);
        }
        System.out.printf("%.2f", sum / strings.length);

    }

    public static void main1(String[] args)
    {
        System.out.println("Happy New Year*2019*");
    }
}
