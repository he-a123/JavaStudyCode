package day23_IO.demo2;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream读取文件
 * 读取方法int read（byte[] b）读取字节数组
 * 数组作用:缓冲作用，提高效率
 * read返回int，表示读取到了多少个有效的字节数
 */
public class FileInputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new
                FileInputStream("d:\\a.txt");
        //创建一个字节数组
        byte[] b = new byte[1024];
        int len = 0;
        while ((len = fis.read(b))!= -1){
            System.out.print(new String(b ,0 ,len));
        }
        /*int len = fis.read(b);
        System.out.println(new String(b));
        System.out.println(len);*/
        fis.close();
    }
}
