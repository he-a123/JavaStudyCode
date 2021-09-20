package day24_IO.demo1;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 转换流
 * java.io.InputStreamReader 继承Reader
 * 字符输入流，读取文本文件
 * 字节流向字符的桥梁，将字节流转字符流
 * 读取方法：
 * read() 读取一个字符，读取字符数组
 * 技巧：OutputStreamWriter 写了文件
 *      InputStreamWriter 读取文件
 *
 *      OutputStreamWriter(OutputStream out)所有字节输出流
 *      InputStreamWriter(InputStream in)所有字节输入流
 *      InputStreamWriter(InputStream in，String charseName)
 *      传递编码表名字
 */
public class InputStreamReaderDemo {
    public static void main(String[] args) throws IOException {
        readUTF();
    }
    /**
     * 转换流，InputStreamReader 读取文件
     * 采用UTF-8编码表，读取UTF文件
     */
    public static void readUTF()throws IOException{
        FileInputStream fis = new FileInputStream("d:\\b.txt");
        InputStreamReader isr = new
                InputStreamReader(fis,"UTF-8");
        char[] ch = new char[1024];
        int len = isr.read(ch);
        System.out.println(new String(ch,0 ,len));
        isr.close();
    }
    /**
     *  转换流，InputStreamReader读取文本
     *  采用系统默认编码表，读取GBK文件
     */
    public static void readGBK()throws IOException {
        //创建字节输入流，传递文本文件
        FileInputStream fis = new FileInputStream("d:\\b.txt");
        //创建一个转换流对象，构造方法，包装字节输入流
        InputStreamReader isr= new InputStreamReader(fis);
        char[] ch = new char[1024];
        int len = isr.read(ch);
        System.out.println(new String(ch,0,len));
        isr.close();
    }

}
