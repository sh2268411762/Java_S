package NiuKe_4_3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * @author 枳洛淮南
 * @version 1.0
 * @Description 功能
 * @Date 2021/4/6 上午 11:03
 */

//KiKi学习了结构体和指针，他了解了结构体类型可以定义包含多个不同类型成员，
// 而指针本质是内存地址，是引用数据的另外一种方式。
// 现在他想将多个输入的数据通过结构体和指针的方式连接在一起，形成一个单向链表，
// 即：每个结点是结构体类型，包括整型数据成员（data）和结构体指针类型成员（next），
// 每个结点的指针部分指向下一个输入的结点。具体建立过程如下：
// 先输入n个整数，按照数据输入的顺序建立一个带头结点的单链表，
// 再输入一个数据m,将单链表中的值为m的结点全部删除。输出删除后的单链表信息。
class Node
{
    public int data;
    public Node next;

    public Node(int data)
    {
        this.data = data;
        this.next = null;
    }
}

public class Main
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());    //输入的 n 个数据

        String str = br.readLine(); //输入的 n 个整数
        String[] strings = str.split(" ");
        Node root = new Node(-1);
        Node cur = root;
        //将字符串转为整型
        for (String string : strings)
        {
            cur.next = new Node(Integer.parseInt(string));
            cur = cur.next;
        }
        //链表构建完成

        n = Integer.parseInt(br.readLine());    //要删除的值
        root = fun(root, n);


        if (root != null)
        {
            cur = root.next;
            while (cur != null)
            {
                System.out.print(cur.data + " ");
                cur = cur.next;
            }
        }
    }

    public static Node fun(Node root, int n)
    {
        if (root.next == null)
        {
            return null;
        }
        Node cur = root.next;
        Node newHead = new Node(-1);
        Node prev = newHead;
        int count = 0;
        while (cur != null)
        {
            if (cur.data != n)
            {
                prev.next = cur;
                prev = prev.next;
                count++;
            }
            cur = cur.next;
        }
        prev.next = null;

        System.out.println(count);
        return newHead;
    }
}
