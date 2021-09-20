package day22_IO.demo3;

import java.io.File;
import java.io.FileFilter;

public class MyFilter implements FileFilter {
    public boolean accept(File pathname){
        /**
         * pathname 接收到的也是文件的全路径
         * c:....
         * 对路径进行判断，如果是某个指定文件，返回true，不是，返回false
         */
        String name = pathname.getName();
        return name.endsWith(".java");//判断该文件是不是以此后缀结尾
       // return pathname.getName().endsWith(".java");
        //return true;
    }
}
