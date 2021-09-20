package day22_IO.demo1;

import java.io.File;

/**
 * File类的构造方法
 * 三种重载方式
 */
public class FileDemo1 {
    public static void main(String[] args) {
        function_2();
    }
    /**
     * File(String parent , String child)
     * 传递路径，传递File类型的父路径，字符串子路径
     * 好处：父路径是File类型，父路径可以直接调用File方法
     */
    public static void function_2(){
        File parent = new File("d:");
        File file = new File(parent,"java");
        System.out.println(file);
    }


    /**
     * File(String parent , String child)
     * 传递字符串的父路径和字符串的子路径
     * 好处：可以单独的操作父路径，也可以单独的操作子路径
     */
    public static void function_1(){
        File file = new File("d:","java");
        System.out.println(file);
    }
    /**
     * File(String pathname)
     * 传递路径名：可以写道文件夹，也可以写道一个文件
     * c:\\abc   c:\\abc\\Demo.java
     * 将路径封装File类型对象
     */
    public static void function(){
        File file  = new File("d:\\ide\\java.class");
        System.out.println(file);
    }
}
