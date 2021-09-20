package day23_IO.demo1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * FileOutputStreamDemo 文件的续写和换行问题
 * 续写：FileOutputStream构造方法的第二个参数中加入true
 * 在文件中写入换行，以符号形式换行  \r\n  可以写在
 * 上一行的末尾，也可以写在下一行的开头
 */
public class FileOutputStreamDemo1 {
    public static void main(String[] args) throws IOException {
        File file = new File("d:\\a.txt");
        FileOutputStream fos = new
                FileOutputStream(file, true);
        fos.write("hello\r\n".getBytes());
        fos.write("world".getBytes());
        fos.close();
    }
}

