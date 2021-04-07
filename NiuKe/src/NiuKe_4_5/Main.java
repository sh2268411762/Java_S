package NiuKe_4_5;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/4/6 上午 10:08
 */

class shape
{
    private int x;
    private int y;
}

class Rectangle extends shape
{
    private int l = 0;
    private int w = 0;

    public Rectangle(int l)
    {
        super();
        this.l = this.w = l;
    }

    public Rectangle(int l, int w)
    {
        super();
        this.l = l;
        this.w = w;
    }

    public int GetArea()
    {
        return this.w * this.l;
    }
}

class Circle extends shape
{
    private double r = 0;

    public Circle(double parseDouble)
    {
        this.r = parseDouble;
    }

    public double GetArea()
    {
        return 3.14 * this.r * this.r;
    }
}

class Square extends Rectangle
{
    private int l;

    public Square(int l)
    {
        super(l);
    }
}


public class Main
{
    //KiKi理解了继承可以让代码重用，他现在定义一个基类shape，
    // 私有数据为坐标点x,y,  由它派生Rectangle类和Circle类，
    // 它们都有成员函数GetArea()求面积。
    // 派生类Rectangle类有数据：矩形的长和宽；
    // 派生类Circle类有数据：圆的半径。
    // Rectangle类又派生正方形Square类，定义各类并测试。
    // 输入三组数据，分别是矩形的长和宽、圆的半径、正方形的边长，
    // 输出三组数据，分别是矩形、圆、正方形的面积。圆周率按3.14计算。

    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine(); //矩形
        String[] strings = str.split(" ");
        Rectangle r = new Rectangle(Integer.parseInt(strings[0]), Integer.parseInt(strings[1]));
        System.out.println(r.GetArea());


        str = br.readLine();
        Circle c = new Circle(Double.parseDouble(str));
        double ci = c.GetArea();
        if ((ci * 100) % 100 > 0)
        {
            System.out.println((double) Math.round(ci * 100) / 100);
        } else
        {
            System.out.println((int) ci);
        }

        str = br.readLine();
        Square s = new Square(Integer.parseInt(str));
        System.out.print(s.GetArea());
    }
}
