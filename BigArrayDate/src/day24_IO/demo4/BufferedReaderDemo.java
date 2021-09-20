package day24_IO.demo4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * 字符输入流的缓冲流
 * java.io.BufferedReader 继承Reader
 * 读取功能read（）单个字符，字符数组
 * 构造方法：
 *BufferedReader(Reader r)
 * 可以是任意的字符输入流
 * FileReader  InputStreamReader
 * BufferedReader 自己的构造功能
 * String readLine() 读取文本行\r\n
 *
 * 方法读取到文本末尾，返回null
 * 小特点：
 * 获取内容方法一般都有返回值
 * int 没有返回的都是负数
 * 引用类型 找不到返回null
 *   boolean 找不到返回false
 *   String s = null
 *   String s = "null"
 *
 *   readLine()方法返回行的有效字符，没有\r\n
 */
public class BufferedReaderDemo {
    public static void main(String[] args)throws IOException {
        int Linenumber = 0;
        //创建字符输入流缓冲对象，构造方法传递字符输入流，包装数据源文件
        BufferedReader bfr = new
                BufferedReader(new FileReader("d:\\a.txt"));
        //循环读取文本行，结束条件readLine()返回null
        String s = null;
        while ((s=bfr.readLine())!= null){
            Linenumber++;
            System.out.println(Linenumber+"  "+s);
        }
       // bfr.close();
        //调用缓冲流方法readLine()读取文本行

        String line = bfr.readLine();
        System.out.println(line);
         line = bfr.readLine();
        System.out.println(line);
         line = bfr.readLine();
        System.out.println(line);
         line = bfr.readLine();
        System.out.println(line);
        bfr.close();
    }
}
