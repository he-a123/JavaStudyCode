package day22_IO.demo4;

import java.io.File;

/**
 * 对一个目录下的所有内容，进行完全的遍历
 */
public class FileDemo {
    public static void main(String[] args) {
    File dir = new File("C:\\各种软件集中营");
    getAllDir(dir);
    }
    /**
     * 定义方法，实现目录的全遍历
     * 编程技巧，方法的递归调用，自己调用自己
     */
    public static void getAllDir(File dir){
        System.out.println(dir);
        //调用listFiles()对目录，dir进行遍历
        File[] fileArr = dir.listFiles();
        for(File s : fileArr){
            //判断一下变量f表示的路径是不是文件夹
            if(s.isDirectory()){
                //是一个文件夹，就要去遍历这个目录
                //本方法，getAllDir，就是给这个目录进行遍历
                //继续调用本方法getAllDir，传递他目录
                getAllDir(s);
            }else {
                System.out.println(s);
            }
        }
    }
}
