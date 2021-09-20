package day22_IO.demo1;

import java.io.File;

import static java.io.File.pathSeparator;

/**
 * java.io.File
 * 将操作系统中的文件，目录，路径，封装成File对象
 * 提供方法，操作系统中的内容
 * File与系统种类无关的类
 * 文件   file
 * 目录  Directory
 * 路径 path
 */
public class FileDemo {
    public static void main(String[] args) {
        //File 类静态成员变量
        //与系统有关的路径分隔符
        String separator = File.pathSeparator;
        System.out.println(separator);//是一个分号，
        // 表示目录的分隔 而Linux的分隔符号是冒号 ：
        //与系统有关的默认名称分隔符
        separator = File.separator;
        System.out.println(separator);//向右的斜线 \ 目录名称的分隔
        //表示这个目录结束    Linux里是/
    }
}
