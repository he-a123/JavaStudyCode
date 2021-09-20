package day30.demo1;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * 实现UDP接收端
 *  实现封装数据包Java.net.Datagrampacket 将数据接收
 *  实现输出传输  java.net.DatagramSocket 接收数据包
 *
 *  实现步骤：
 *      1.创建DatagramSocket对象，绑定端口号
 *      端口号要和发送端口号一致
 *      2、创建一个字节数组，接收发来的数组
 *      3、创建数据包对象DatagramPacket
 *      4、调用DatagramSocket对象方法
 *      receive(DatagramPacket dp)接收数据，将数据放在数据包中
 *      5、拆包
 *          发送的Ip地址
 *          数据包对象DatagramPocket方法，个体Address()获取的是发送端的IP地址对象
 *          返回值是InetAddress对象
 *          接收到的字节个数
 *          数据包对象DatagramPacket方法，getLength()
 *          发送方的端口号
 *          数据包对象DatagramPacket方法getPort()发送端口
 *        6、关闭资源
 */
public class UDPReceive {
    public static void main(String[] args) throws IOException {
        //创建数据包传输对象DatagramSocket 绑定端口号
        DatagramSocket ds= new DatagramSocket(8080);
        //创建字节数组
        byte[] data = new byte[1024];
        //创建数据包对象，传递字节数组
        DatagramPacket dp = new DatagramPacket(data,data.length);
        ds.receive(dp);
        //获取接收到的字节个数
        int length = dp.getLength();
        //获发送端的IP地址对象
       String ip = dp.getAddress().getHostAddress();
       //获取发送端端口号
        int port = dp.getPort();
        System.out.println(ip+"...:..."+port);
        System.out.println(new String(data,0,length));
        ds.close();
    }
}
