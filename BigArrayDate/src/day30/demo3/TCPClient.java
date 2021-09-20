package day30.demo3;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 实现TCP客户端，连接到服务器哦
 * 和服务器实现数据交换
 * 实现tcp客户端程序的类 java.net.Socket
 *
 * 构造方法：
 *      Socket(String host,int port)    传递服务器IP和端口号
 *      注意：此构造方法只要运行，就会和服务器进行连接，
 *      连接失败，抛出异常
 *      OutputStream getOutputStream() 返回套接字的输出流
 *      作用：将数据输出，输出到服务器
 *      InputStream getInputStream() 返回套接字的输入流
 *      作用：从服务器端口读取数据
 *
 *      客户端服务器进行数据交换时，必须使用套接字对象Socket中获取的IO流，自己new的流，不能连接
 *
 */
public class TCPClient {
    public static void main(String[] args) throws IOException {
    //创建Socket对象，用于连接服务器
        Socket socket= new Socket("192.168.31.105",8000);
//      通过客户端的套接字对象Socket方法，获取字节输出流，将数据写向服务器
        OutputStream out = socket.getOutputStream();
        out.write("服务器ok".getBytes());
        //读取服务器发回的数据，使用socket套接字对象中的字节输入流
        InputStream in = socket.getInputStream();
        byte[] data = new byte[1024];
        int len= in.read(data);
        System.out.println(new String(data ,0,len));
        socket.close();
    }
}
