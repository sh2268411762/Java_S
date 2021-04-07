package NiuKe_4_4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description KiKi学习了面向对象技术，学会了通过封装属性（变量）和行为（函数）定义类，现在他要设计一个电子日历类TDate。
 * 它有3个私有数据成员：Month,Day,Year和若干个公有成员函数，要求：
 * （1）带有默认形参值的构造函数，默认值为0, 0, 0；
 * （2）输出日期函数，用“日/月/年”格式输出日期；
 * （3）设置日期函数，从键盘输入年、月、日。
 * @Date 2021/4/6 上午 10:42
 */
class TDate
{
    private int Year;
    private int Month;
    private int Day;

    public TDate(int year, int month, int day)
    {
        Year = year;
        Month = month;
        this.Day = day;
    }

    public TDate()
    {
        Year = Month = Day = 0;
    }

    @Override
    public String toString()
    {
        return Day + "/" + Month + "/" + Year;
    }

    public void setDate(int year, int month, int day)
    {
        Year = year;
        Month = month;
        Day = day;
    }
}

public class Main
{
    public static void main(String[] args) throws IOException
    {
        TDate tDate = new TDate();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] strings = str.split(" ");
        tDate.setDate(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]), Integer.parseInt(strings[2]));
        System.out.println(tDate.toString());
    }
}
