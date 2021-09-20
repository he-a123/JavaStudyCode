package day23_IO.demo3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 字符流复制文本文件，必须文本文件
 * 字符流查询本机默认的编码表，简体中文GBK
 * FileReader 读取到数据
 * FileWriter 写入到数据目的包
 */
public class Copy2 {
    public static void main(String[] args) {
        FileReader fr = null;
        FileWriter fw = null;
        try {
        fr = new FileReader("d:\\a.txt");
        fw = new FileWriter("e:\\b.txt");
        char[] cbuf = new char[1024];
        int len = 0;
        while ((len = fr.read(cbuf))!=-1) {
            fw.write(cbuf, 0, len);
            fw.flush();
        }
        }catch(IOException ex){
            System.out.println(ex);
            throw new RuntimeException("复制失败");
         }finally {
        try {
            if(fw != null)
                fw.close();
        }catch (IOException ex){
            throw new RuntimeException("释放资源失败");
        }finally {
            try {
                if(fr != null)
                    fr.close();
            }catch (IOException ex){
                throw new RuntimeException("释放资源失败");
            }
        }
    }
    }
}
