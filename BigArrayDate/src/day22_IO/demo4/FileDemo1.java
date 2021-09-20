package day22_IO.demo4;

import java.io.File;

/**
 * 遍历目录，获取目录下的所有.java文件
 */
public class FileDemo1 {
    public static void main(String[] args) {
        getAllJava(new File("D:\\"));
    }
    public static void  getAllJava(File dir){
        File [] file = dir.listFiles(new MyJavaFilter());
        for(File f : file){
        if(f.isDirectory()){
            getAllJava(f);
        }else {
            System.out.println(f);
        }
        }
    }
}
