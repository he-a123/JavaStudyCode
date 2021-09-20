package day24_IO.demo2;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 字节输出流的缓冲流
 * java.io.BufferedOutputStream作用：提高原有输出流的写入效率
 * BufferedOutputStream 继承自OutPutStream
 * 方法：写入write字节和字节数组
 *
 * 构造方法：
 * BufferedOutputStream（OutputStream out）
 * 可以传递任意的字节输出流，传递的是哪个字节流，就对哪个字节流提高效率
 * FileOutputStream
 */
public class BufferedOutputStreamDemo {
    public static void main(String[] args) throws IOException {
        //创建字节输出流，绑定文件
        //FileOutputStream fos= new FileOutputStream("d:\\a.txt");
        //创建字节输出流缓冲流的对象，构造方法中，传递字节输出流
        BufferedOutputStream bos = new BufferedOutputStream
               (new FileOutputStream("d:\\a.txt"));
        bos.write(55);
        byte[] bytes = "Helloworld".getBytes();
        bos.write(bytes);
        bos.write(bytes,4,3);
        bos.close();
    }
}
