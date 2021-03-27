package NiuKe_3_26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 牛客
 * @Date 2021/3/26 下午 13:28
 */
public class Main
{
    //KiKi想知道已经给出的三条边a，b，c能否构成三角形，如果能构成三角形，
    // 判断三角形的类型（等边三角形、等腰三角形或普通三角形）。
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {

        }
    }

    //KiKi最近学习了信号与系统课程，这门课里有一个非常有趣的函数，
    // 单位阶跃函数，其中一种定义方式为：
    public static void main13(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            int num = Integer.parseInt(str);
            int ret = 0;
            if (num > 0)
            {
                System.out.println(1);
            } else if (num == 0)
            {
                System.out.println(0.5);
            } else
            {
                System.out.println(0);
            }
        }
    }

    //KiKi想知道从键盘输入的两个数的大小关系，请编程实现。
    public static void main12(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            String[] strings = str.split(" ");
            if (Integer.parseInt(strings[0]) > Integer.parseInt(strings[1]))
            {
                System.out.println(strings[0] + ">" +
                        strings[1]);
            } else if (Integer.parseInt(strings[0]) < Integer.parseInt(strings[1]))
            {
                System.out.println(strings[0] + "<" +
                        strings[1]);
            } else
            {
                System.out.println(strings[0] + "=" +
                        strings[1]);
            }

        }
    }

    //KiKi想完成字母大小写转换，有一个字符，判断它是否为大写字母，
    // 如果是，将它转换成小写字母；反之则转换为大写字母。
    public static void main11(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            char ch = str.charAt(0);
            char temp;
            if (ch >= 'a' && ch <= 'z')
            {
                temp = (char) (ch - 32);
            } else
            {
                temp = (char) (ch + 32);
            }
            System.out.println(temp);
        }
    }

    //KiKi想判断输入的字符是不是字母，请帮他编程实现
    public static void main10(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            char ch = str.charAt(0);
            if ((ch >= 'A' && ch <= 'Z') || (ch >= 'a' && ch <= 'z'))
            {
                System.out.println(ch + " is an alphabet.");
            } else
            {
                System.out.println(ch + " is not an alphabet.");
            }
        }
    }

    //KiKi开始学习英文字母，BoBo老师告诉他，
    // 有五个字母A(a), E(e), I(i), O(o),U(u)称为元音，
    // 其他所有字母称为辅音，
    // 请帮他编写程序判断输入的字母是元音（Vowel）
    // 还是辅音（Consonant）。
    public static void main8(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            str = str.toUpperCase();
            char[] ch = str.toCharArray();
            if (ch[0] == 'A' || ch[0] == 'E' || ch[0] == 'I' || ch[0] == 'O' || ch[0] == 'U')
            {
                System.out.println("Vowel");
            } else
            {
                System.out.println("Consonant");
            }
        }
    }

    //KiKi参加了语文、数学、外语的考试，请帮他判断三科中的最高分。
    // 从键盘任意输入三个整数表示的分数，
    // 编程判断其中的最高分。
    public static void main7(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            String[] strings = str.split(" ");
            int max = Integer.MIN_VALUE;

            for (int i = 0; i < strings.length; i++)
            {
                if (max < Integer.parseInt(strings[i]))
                {
                    max = Integer.parseInt(strings[i]);
                }
            }
            System.out.println(max);
        }
    }

    //KiKi想知道一个整数的奇偶性，请帮他判断。
    // 从键盘任意输入一个整数（范围-231~231-1），
    // 编程判断它的奇偶性。
    public static void main6(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            int num = Integer.parseInt(str);
            if (num % 2 == 1)
            {
                System.out.println("Odd");
            } else
            {
                System.out.println("Even");
            }
        }
    }

    //iKi想知道他的考试分数是否通过，请帮他判断。
    // 从键盘任意输入一个整数表示的分数，
    // 编程判断该分数是否在及格范围内，
    // 如果及格，即：分数大于等于60分，是输出“Pass”，
    // 否则，输出“Fail”。
    public static void main5(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            int num = Integer.parseInt(str);
            if (num >= 60)
            {
                System.out.println("Pass");
            } else
            {
                System.out.println("Fail");
            }
        }
    }


    //KiKi想知道他的考试成绩是否完美，请帮他判断。
    // 从键盘输入一个整数表示的成绩，
    // 编程判断成绩是否在90~100之间，
    // 如果是则输出“Perfect”。
    public static void main4(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            int num = Integer.parseInt(str);
            if (num > 90 && num < 100)
            {
                System.out.println("Perfect");
            }
        }
    }

    //据说智商140以上者称为天才，KiKi想知道他自己是不是天才，
    // 请帮他编程判断。输
    // 入一个整数表示一个人的智商，如
    // 果大于等于140，则表明他是一个天才，输出“Genius”。
    public static void main3(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            int num = Integer.parseInt(str);
            if (num >= 140)
            {
                System.out.println("Genius");
            }
        }
    }

    //假设你们社团要竞选社长，有两名候选人分别是A和B，
    // 社团每名同学必须并且只能投一票，
    // 最终得票多的人为社长.
    public static void main2(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();

        char[] chars = str.toCharArray();
        int A = 0, B = 0;
        for (int i = 0; i < chars.length; i++)
        {
            if (chars[i] == 'A')
            {
                A++;
            }
            if (chars[i] == 'B')
            {
                B++;
            }
        }
        if (A > B)
        {
            System.out.println("A");
        } else if (B > A)
        {
            System.out.println("B");
        } else
        {
            System.out.println("E");
        }
    }


    //期中考试开始了，
    // 大家都想取得好成绩，争夺前五名。
    // 从键盘输入n个学生成绩（不超过40个），
    // 输出每组排在前五高的成绩。
    public static void main1(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();

        int n = Integer.parseInt(str);      //输入人数

        str = br.readLine();    //输入成绩
        String[] strings = str.split(" ");
        int[] ints = new int[strings.length];

        for (int i = 0; i < n; i++)
        {
            ints[i] = Integer.parseInt(strings[i]);
        }

        Arrays.sort(ints);
        fun(ints);

        System.out.println(ints[0] + " " + ints[1] + " "
                + ints[2] + " " + ints[3] + " " + ints[4]);
    }

    public static int[] fun(int[] a)    //逆置数组
    {
        for (int i = 0; i < a.length / 2; i++)
        {
            int t = a[i];
            a[i] = a[a.length - i - 1];
            a[a.length - i - 1] = t;
        }
        return a;
    }
}
