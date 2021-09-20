package day24_IO.demo4;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字节输出流缓冲区
 * java.io.BufferedWriter 继承Writer
 * 写入方法write() 单个字符，字符数组，字符串
 *
 * 构造方法
 * BufferedWriter(Writer w)传递任意字符输出流
 * 传递谁就高效谁
 * 能传递的字符输出流FileWriter，OutputStreamWriter
 *
 * BufferedWriter 具有自己特有的方法
 * void newLine() 写换行
 *
 * newLine()用于文本中的换行，\r\n也是用于文本中的换行
 *
 * newLine()具有平台无关性
 * \r\n    windows
 * \n      Linux
 * newLine() 运行结果，和操作系统是相对关系
 * JVM ：安装的是Windows版本，newLine()写的就是\r\n
 *      安装的是Linux版本，newLine()写的就是\n
 */
public class BuferedWriterDemo {
    public static void main(String[] args)throws IOException {
        //创建一个字符输出流，封装文件
        FileWriter fw = new FileWriter("d:\\a.txt");
        BufferedWriter bfw = new BufferedWriter(fw);
        bfw.write(100);
        bfw.newLine();
        bfw.flush();//字符流，需要刷新
        bfw.write("你好".toCharArray());
        bfw.newLine();
        bfw.flush();
        bfw.write("大家都好");
        bfw.flush();
    }
}
