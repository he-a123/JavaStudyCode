package day22_IO.demo2;

import java.io.File;

/**
 * File类的获取功能
 */
public class FileDemo {
    public static void main(String[] args) {
        function_3();
    }
    /**
     * File类的获取功能
     * String getParent();
     * File getParentFile();
     * 获取父路径
     */
    public static void function_3(){
        File file = new File("D:\\TGP\\wegame.exe");
        File parent = file.getParentFile().getParentFile();
        System.out.println(parent);
    }
    /**
     *  File类的获取功能
     *  String getAbsolutePath();返回String对象
     *  File getAbsoluteFile();返回File对象---常用
     *  获取绝对路径
     *  在ide等开发环境中，写入一个相对路径，获取到的是绝对位置工程根目录
     */
    public static void function_2(){
        File file = new File("src");
        File abslute = file.getAbsoluteFile();
        System.out.println(abslute);
    }

    /**
     *  File类的获取功能
     *  long length();
     *  返回路径中表示的文件的字节数
     *  只是文件大小，不能获取文件夹大小
     */
    public static void function_1(){
        File file = new File("D:\\TGP\\wegame.exe");
        long length = file.length();
        System.out.println(length);
    }
    /**
     * File类的获取功能
     * String getName();
     * 返回路径中表示的文件或者文件名
     * 获取路径中的最后部分的名字可以是文件夹，也可以是文件
     * 属于字符串功能
     */
    public static void function(){
        File file = new File("D:\\TGP\\wegame.exe");
        String name = file.getName();
        System.out.println(name);
    }
}
