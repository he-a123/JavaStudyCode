package day30.demo4;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 实现TCP图片上传客户端
 * 实现步骤：
 *      1、Socket套接字连接服务器
 *      2、通过Socket套接字获取字节输出流，写图片
 *      3、使用自己的流对象，读取图片数据源
 *      FileInputStream
 *      4、读取图片，使用字节输出流，将图片写道服务器
 *      采用字节数组进行缓冲
 *      5、通过Socket套接字获取字节输入流
 *      读取服务器发回来的上传反馈
 *      6、关闭资源
 *
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket= new Socket("192.168.31.105",8880);
        //获取字节输出流，将图片写道服务器
        OutputStream out = socket.getOutputStream();
        //获取字节输入流，读取本机上的数据源图片
        FileInputStream fis = new FileInputStream("c:\\T.mp4");
        //开始读写字节数组
        int len =0;
        byte[] bytes= new byte[1024*8];
        while ((len=fis.read(bytes))!=-1){
            out.write(bytes,0,len);
        }
        //给服务器写终止序列
        socket.shutdownOutput();
        //获取字节输入流，读取服务器反馈
        InputStream in = socket.getInputStream();
        len=in.read(bytes);
        System.out.println(new String(bytes,0,len));
        fis.close();
        socket.close();
    }
}
