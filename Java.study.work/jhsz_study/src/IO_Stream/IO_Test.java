package IO_Stream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

public class IO_Test {
    public static void main(String[] args) throws IOException {
        InputStreamTest();
    }

    private static void InputStreamTest() throws IOException {
        InputStream in = System.in;
      //  int content = in.read();//每次只会读取到一个字节的数据
        //需要把字节流转换为字符流使用
        InputStreamReader isr = new InputStreamReader(in);
        BufferedReader br = new BufferedReader(isr);

        System.out.println(br.readLine());


    }
}
