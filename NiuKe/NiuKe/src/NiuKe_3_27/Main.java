package NiuKe_3_27;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/3/27 下午 13:13
 */
public class Main
{
    //iKi想知道已经给出的三条边a，b，c能否构成三角形，如果能构成三角形，判断三角形的类型（等边三角形、等腰三角形或普通三角形）。
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = null;

        while ((str = br.readLine()) != null)
        {
            String[] strings = str.split(" ");
            int a = Integer.parseInt(strings[0]), b = Integer.parseInt(strings[1]), c = Integer.parseInt(strings[2]);

            if (a + b > c && a + c > b && c + b > a)
            {
                if (a == c && b == c)
                {
                    System.out.println("Equilateral triangle!");
                } else if (a == b || a == c || b == c)
                {
                    System.out.println("Isosceles triangle!");
                } else
                {
                    System.out.println("Ordinary triangle!");
                }
            } else
            {
                System.out.println("Not a triangle!");
            }
        }
    }
}
