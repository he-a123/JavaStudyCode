package day22_IO.demo2;

/*
 *File类获取功能
 * list
 * listFiles
 */

import java.io.File;

public class FileDemo2 {
    public static void main(String[] args) {
        function_1();
    }
        public static void function_2(){
        //获取系统中的所有根目录
        File[] fileArr = File.listRoots();
        for(File f : fileArr){
            System.out.println(f);
        }
        }
    /**
     * File类的获取功能
     * File[] listFile()
     * 获取到，File构造方法中封装的路径中的文件和文件名（遍历一个目录）
     */
    public static void function_1(){
        File file = new File("c:\\ps 2019");
        File[] fileArr= file.listFiles();
        for(File s: fileArr){
           // String f = s.toString();
            System.out.println(s);
        }
    }
    /*
     *File类的获取功能
     * String[] list();
     * 获取到，File构造方法中封装的路径中的文件和文件名（遍历一个目录）

     */
    public static void function(){
        File file = new File("c:");
        String [] strArr= file.list();
        System.out.println(strArr.length);
        for(String str :strArr){
            System.out.println(str);
        }
    }

}
