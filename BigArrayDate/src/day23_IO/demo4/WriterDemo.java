package day23_IO.demo4;

import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符输出流
 * java.io.Writer  所有字符输出流的超类
 * 写文件，只能写文本文件
 *
 * 写的方法write
 *      write(int c) 写一个字符
 *      write(char[] c)写一个字节数组
 *      write（char[] c, int ,int ）写入字符数组的一部分，开始索引，写几个
 *      write(String s)写入字符串
 *
 *      Writer类的子类对象FileWriter
 *      构造方法：写入数据目的
 *      File 类对象
 *      String 文件名
 *
 *      字符输出流写数据的时候，必须要运行一个功能，刷新功能
 *      flush();
 */
public class WriterDemo {
    public static void main(String[] args)throws IOException {
        FileWriter fw = new FileWriter("d:\\a.txt");
        //写一个字符
        fw.write(100);
        fw.flush();
        //写字符数组
        char[] c ={'a','b','c','d'};
        fw.write(c);
        fw.flush();//写一次刷一次
        fw.write(c,0,4);
        fw.flush();
        fw.write("hello");
        fw.flush();
        fw.close();
    }
}
