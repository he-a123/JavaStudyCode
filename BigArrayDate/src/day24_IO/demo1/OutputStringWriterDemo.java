package day24_IO.demo1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;

/**转换流
 * Java.io.OutputStreamWriter 继承Writer类
 * 就是一个字符输出流，写文本文件
 * write（）字符，字符数组，字符串
 *
 * 字符通向字节的桥梁，将字符流转换成字节流
 *
 * OutputStreamWriter 使用方式
 * 构造方法：
 * OutputStreamWriter(OutputStream out)接收所有字节输出流
 *  但是：字节输出流：FileOutputStream
 *
 *  OutputStreamWriter(OutputStream out , String charseName)
 *  String charseName 传递编码表名字 GBK  UTF-8  不区分大小写
 *
 *  OutputStreamWriter 有个子类，FileWriter  常用方法
 */
public class OutputStringWriterDemo {
    public static void main(String[] args) throws IOException{
        writeUTF();
    }
    /**
     * 转换流对象OutputStreamWriter写文本
     *      * 文本采用UTF-8的形式写入
     */
    public static void writeUTF()throws IOException{
        //创建字节输出流，绑定文件
        FileOutputStream fos = new FileOutputStream("d:\\b.tx" +
                "t");
        //创建流对象，构造方法绑定字节输出流
        OutputStreamWriter osw = new
                OutputStreamWriter(fos,"utf-8");
        osw.write("你好");
        osw.close();
    }
    /**转换流对象OutputStreamWriter写文本
     * 文本采用GBK的形式写入
     *
     */
    public static void writeGBK()throws IOException {
        //创建一个字节输出流，绑定数据文件
        FileOutputStream fos = new
                FileOutputStream("d:\\a.txt");
        //创建转换流对象，构造方法，绑定字节输出流
        OutputStreamWriter osw = new OutputStreamWriter
                (fos,"gbk");
        //转换流写对象
        osw.write("你好");
        osw.close();
    }
}
