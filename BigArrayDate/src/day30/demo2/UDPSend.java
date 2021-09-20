package day30.demo2;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

/**
 * 实现UDP协议的发送端：
 *  实现封装数据的类 Java.net.DatagramPacket  将数据包装
 *  实现数据传输的类java.net,DatagramSocket  将数据包发出去
 *
 *  实现步骤：
 *          1.创建DatagramPacket对象，封装数据，包括接收端的地址和端口
 *          2.创建DatagramSocket类的方法send，发送数据包
 *          3.调用DatagramSocket类方法send，发送数据包
 *          4.关闭资源
 *
 *
 *          DatagramPacket构造方法
 *          DatagramPacket(byte[] buf ,int length ,InetAddress address,int port)
 *
 *          DatagramSocket()构造方法
 *          DatagramSocket（）空参
 *          方法：send（DatagramPacket d）
 */

/**
 * 实现UDP发送，键盘输入的形式
 * 输入完毕，发送给接收端
 */
public class UDPSend {
    public static void main(String[] args) throws IOException {
        InetAddress inet = InetAddress.getByName("192.168.31.105");
        DatagramSocket ds = new DatagramSocket();
        Scanner sc = new Scanner(System.in);
        while (true) {
            String massage = sc.nextLine();
            byte[] date = massage.getBytes();
            DatagramPacket dp = new DatagramPacket(date, date.length, inet, 60000);
            ds.send(dp);
        }
        //ds.close();
    }
}
