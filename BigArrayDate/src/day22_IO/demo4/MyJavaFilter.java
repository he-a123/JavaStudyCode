package day22_IO.demo4;

import java.io.File;
import java.io.FileFilter;

public class MyJavaFilter implements FileFilter {



    public boolean accept(File pathname) {
        if(pathname.isDirectory())
            return true;
        return pathname.getName().toLowerCase().endsWith(".java");
    }
}
