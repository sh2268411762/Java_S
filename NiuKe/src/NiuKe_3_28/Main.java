package NiuKe_3_28;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/3/28 下午 12:27
 */
public class Main
{
    //KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，
    // 该任务是打印用“*”组成的菱形图案。
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            int num = Integer.parseInt(str);
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < num; i++)
            {
                for (int j = 0; j < num + 1; j++)
                {
                    if (j >= num - i)
                    {
                        stringBuffer.append("* ");
                    } else
                    {
                        stringBuffer.append(" ");
                    }
                }
                stringBuffer.append("\n");
            }
            for (int i = 0; i < num + 1; i++)
            {
                for (int j = 0; j < num + 1; j++)
                {
                    if (j >= i)
                    {
                        stringBuffer.append("* ");
                    } else
                    {
                        stringBuffer.append(" ");
                    }
                }
                stringBuffer.append("\n");
            }
            System.out.print(stringBuffer);
            stringBuffer.setLength(0);
        }
    }

    //KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，
    // 该任务是打印用“*”组成的翻转金字塔图案。
    public static void main11(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            int num = Integer.parseInt(str);
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < num; i++)
            {
                for (int j = num; j > 0; j--)
                {
                    if (j > num - i)
                    {
                        stringBuffer.append(" ");
                    } else
                    {
                        stringBuffer.append("* ");
                    }
                }
                stringBuffer.append("\n");
            }
            System.out.print(stringBuffer);
            stringBuffer.setLength(0);
        }
    }

    //KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，
    // 该任务是打印用“*”组成的金字塔图案。
    public static void main10(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            int num = Integer.parseInt(str);
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < num; i++)
            {
                for (int j = 0; j < num; j++)
                {
                    if (j >= num - i - 1)
                    {
                        stringBuffer.append("* ");
                    } else
                    {
                        stringBuffer.append(" ");
                    }
                }
                stringBuffer.append("\n");
            }
            System.out.print(stringBuffer);
            stringBuffer.setLength(0);
        }
    }

    //KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，
    // 该任务是打印用“*”组成的带空格直角三角形图案。
    public static void main9(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            int num = Integer.parseInt(str);
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < num; i++)
            {
                for (int j = 0; j < num; j++)
                {
                    if (j < num - i - 1)
                    {
                        stringBuffer.append("  ");
                    } else
                    {
                        stringBuffer.append("* ");
                    }
                }
                stringBuffer.append("\n");
            }
            System.out.print(stringBuffer);
            stringBuffer.setLength(0);
        }
    }

    //KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，
    // 该任务是打印用“*”组成的翻转直角三角形图案。
    public static void main8(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            int num = Integer.parseInt(str);
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < num; i++)
            {
                for (int j = num; j > i; j--)
                {
                    stringBuffer.append("* ");
                }
                stringBuffer.append("\n");
            }
            System.out.print(stringBuffer);
            stringBuffer.setLength(0);
        }
    }

    //KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，
    // 该任务是打印用“*”组成的直角三角形图案。
    public static void main7(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            int num = Integer.parseInt(str);
            for (int i = 0; i < num; i++)
            {
                StringBuffer stringBuffer = new StringBuffer();
                for (int j = 0; j <= i; j++)
                {
                    stringBuffer.append("* ");
                }
                System.out.println(stringBuffer);
            }
        }
    }

    //KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，
    // 该任务是打印用“*”组成的正方形图案
    public static void main6(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            int num = Integer.parseInt(str);
            for (int i = 0; i < num; i++)
            {
                StringBuffer stringBuffer = new StringBuffer();
                for (int j = 0; j < num; j++)
                {
                    stringBuffer.append("* ");
                }
                System.out.println(stringBuffer);
            }
        }
    }

    //KiKi学习了循环，BoBo老师给他出了一系列打印图案的练习，
    // 该任务是打印用“*”组成的线段图案。
    public static void main5(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            int num = Integer.parseInt(str);
            StringBuffer stringBuffer = new StringBuffer();
            for (int i = 0; i < num; i++)
            {
                stringBuffer.append("*");
            }
            System.out.println(stringBuffer);
        }
    }

    //KiKi实现一个简单计算器，实现两个数的“加减乘除”运算，
    // 用户从键盘输入算式“操作数1运算符操作数2”，
    // 计算并输出表达式的值，
    // 如果输入的运算符号不包括在（+、-、*、/）范围内，
    // 输出“Invalid operation!”。
    // 当运算符为除法运算，即“/”时。如果操作数2等于0.0，
    // 则输出“Wrong!Division by zero!”
    public static void main4(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            String[] strings = str.split("[+\\-*/]");
            if (strings.length < 2)
            {
                System.out.println("Invalid operation!");
            } else
            {
                double a = Double.parseDouble(strings[0]), b = Double.parseDouble(strings[1]);
                char ch = str.charAt(strings[0].length());


                if (ch == '/' && b == 0.0)   //操作数为0
                {
                    System.out.println("Wrong!Division by zero!");
                } else
                {
                    double ret = 0.0;
                    if (ch == '+')
                    {
                        ret = a + b;
                    } else if (ch == '-')
                    {
                        ret = a - b;
                    } else if (ch == '*')
                    {
                        ret = a * b;
                    } else
                    {
                        ret = a / b;
                    }
                    System.out.printf("%.4f%c%.4f=%.4f", a, ch, b, ret);
                    System.out.println();
                }

            }
        }
    }

    //KiKi想获得某年某月有多少天，请帮他编程实现。
    // 输入年份和月份，计算这一年这个月有多少天。
    public static void main3(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            String[] strings = str.split(" ");
            int year = Integer.parseInt(strings[0]);
            int month = Integer.parseInt(strings[1]);


            int[] a = {31, 0, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
            if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0)
            {
                a[1] = 29;
            } else
            {
                a[1] = 28;
            }
            System.out.println(a[month - 1]);
        }
    }

    //从键盘输入a, b, c的值，编程计算并输出
    // 一元二次方程ax2 + bx + c = 0的根，当a = 0时，
    // 输出“Not quadratic equation”，
    // 当a ≠ 0时，根据△ = b2 - 4*a*c的三种情况计算并输出方程的根。
    public static void main2(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            String[] strings = str.split(" ");
            double a = Double.parseDouble(strings[0]);
            double b = Double.parseDouble(strings[1]);
            double c = Double.parseDouble(strings[2]);

            if (0 == a)
            {
                System.out.println("Not quadratic equation");
            } else
            {
                double temp = Math.pow(b, 2) - 4 * a * c;
                double v = (-b + Math.sqrt(temp)) / (2 * a);
                if (0 == temp)
                {
                    System.out.printf("x1=x2=%.2f", v);
                } else if (temp > 0)
                {
                    double ret2 = (-b - Math.sqrt(temp)) / (2 * a);
                    System.out.printf("x1=%.2f;x2=%.2f", ret2, v);
                } else
                {
                    double realPart = (-b) / (2 * a);
                    double imaginaryPart = Math.sqrt(-temp) / (2 * a);
                    System.out.printf("x1=%.2f-%.2fi;x2=%.2f+%.2fi", realPart, imaginaryPart, realPart, imaginaryPart);
                }
            }
            System.out.println();
        }
    }

    //在计算BMI（BodyMassIndex ，身体质量指数）的案例基础上，判断人体胖瘦程度。
    public static void main1(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            String[] strings = str.split(" ");
            double weight = Double.parseDouble(strings[0]);
            double height = Double.parseDouble(strings[1]) / 100;

            double ret = weight / (Math.pow(height, 2));
            if (ret >= 0 && ret < 18.5)
            {
                System.out.println("Underweight");
            } else if (ret >= 18.5 && ret <= 23.9)
            {
                System.out.println("Normal");
            } else if (ret > 23.9 && ret <= 27.9)
            {
                System.out.println("Overweight");
            } else if (ret > 27.9)
            {
                System.out.println("Obese");
            } else
            {
                System.out.println("好好输入行吗");
            }
        }
    }
}
