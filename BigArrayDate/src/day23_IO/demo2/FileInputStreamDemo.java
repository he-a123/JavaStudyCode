package day23_IO.demo2;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream 读取文件
 *
 * 子类构造方法：为这个流对象绑定数据源
 * 参数：
 *      File 类型对象
 *      String 对象
 *      输入流读取文件的步骤
 *              1.创建字节输入流的子类对象
 *              2.调用读取方法read读取
 *              3.关闭资源
 *
 *          特点：
 *              read（）方法执行一次，就会自动读取下一个字节
 *              返回值，返回的是读取到的字节，当读取到文件的结尾的时候
 *              返回-1
 */
public class FileInputStreamDemo {
    public static void main(String[] args)throws IOException {
        FileInputStream fis = new
                FileInputStream("d:\\a.txt");
        //读取一个字节，调用方法read 返回int
        //使用循环方式读取文件，while 循环结束的条件-1
        int len = 0;//接受read方法返回值
        while((len = fis.read()) != -1){
            System.out.print((char)len);
        }
       /* int i = fis.read();
        System.out.println((char)/*加char将整数强转成字符*///i);
       /* i= fis.read();
        System.out.println(i);
        i= fis.read();
        System.out.println(i);
        */
        fis.close();
    }
}
