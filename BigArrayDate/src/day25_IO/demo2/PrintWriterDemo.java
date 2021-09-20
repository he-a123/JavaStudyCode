package day25_IO.demo2;

import java.io.*;

/**
 * 打印流
 *  PrintStream
 *  PrintWriter
 *  打印流的特点：
 *      1、此流不负责数据源，只负责数据目的
 *      2、为其他输出流添加功能
 *      3、永远不会抛出IOException
 *          但是，可能会抛出其他异常
 *
 *       两个打印流的方法，完全一致
 *       构造方法，就是打印流的输出目的端
 *       PrintStream
 *          构造方法，接收File类型，接收字符串文件名，接收字节输出流OutputStream
 *       PrintWriter
 *          构造方法，接收File类型，接收字符串文件名，接收字节输出流OutputStream，
 *          接收字符输出流Writer
 */
public class PrintWriterDemo {
    public static void main(String[] args)throws FileNotFoundException {
        function_1();
    }
    /*
    打印流，可以开启自刷新功能
    满足两个条件：
        1、输出数据目的必须是流对象
            OutputStream Writer
         2、必须调用println，printf，format三个方法中的一个，才可以启用自动刷新功能

     */
    public static void function_3() throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("d:\\6.txt");
        PrintWriter pw = new PrintWriter(fos,true);
        pw.println("i");
        pw.println("love");
        pw.println("j");
        pw.close();
    }
    /*
    打印流，输出目的，是流对象
    可以是字节输出流，可以是字符输出流
    OutputStream Writer
     */
    public static void function_2() throws FileNotFoundException {
        FileOutputStream fos = new FileOutputStream("d:\\4.txt");
       // FileWriter fw = new FileWriter("d:\\5.txt");
        PrintWriter pw = new PrintWriter(fos);
        pw.write("打印流");
        pw.close();
    }
    /**
     * 打印流，输出目的，String文件名
     */
    public static void function_1() throws FileNotFoundException {
        PrintWriter pw = new PrintWriter("d:\\2.txt");
        pw.println(3.5);
        pw.close();
    }
    /**
     * 打印流，向File对象的数据目的写入数据
     * 方法print println 原样输出
     * write 方法走编码表
     * @throws FileNotFoundException
     */
    public static void function() throws FileNotFoundException {
        File file = new File("d:\\2.txt");
        PrintWriter pw = new PrintWriter(file);
        pw.println(100);
        pw.write(100);
        pw.close();
    }
}
