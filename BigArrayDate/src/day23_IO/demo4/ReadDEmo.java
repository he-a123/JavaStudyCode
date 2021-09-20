package day23_IO.demo4;

import java.io.FileReader;
import java.io.IOException;

/*
字符输入流读取文本文件，所有字符输入流的超类，没有读取字符串的功能
Java.IO.Reader
作用
专门读取文本文件
read() 读取一个字符
int read(char[] c) 读取字符数组

Reader类是抽象类，找到子类对象FileReader
构造方法：绑定数据源
参数：
    File 类型对象
    String  字符串对象
 */
public class ReadDEmo {
    public static void main(String[] args)throws IOException {
        FileReader fr = new FileReader("d:\\a.txt");
       /* int len = 0;
        while((len= fr.read())!= -1){
            System.out.print((char)len);
        }*/
       char[] ch = new char[1024];
       int len = 0;
       while((len= fr.read(ch))!= -1){
           System.out.print(new String(ch,0,len));
       }
        fr.close();
    }
}
