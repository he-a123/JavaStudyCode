package day24_IO.demo3;

import java.io.*;

/**
 * 使用缓冲区流对象，复制文本文件
 * 数据源BufferedReader + FileReader 读取
 * 数据目的 BufferedWriter + FileWriter 写入
 * 读取文本行，读一行，写一行，写换行
 */
public class copy_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader bfr = new BufferedReader
                (new FileReader("d:\\a.txt"));
        BufferedWriter bfw = new BufferedWriter
                (new FileWriter("d:\\b.txt"));
        String line = null;
        while((line = bfr.readLine())!= null){
            bfw.write(line);
            bfw.newLine();
            bfw.flush();

        }
        bfw.close();
        bfr.close();
    }
}
