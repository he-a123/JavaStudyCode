package day30.demo2;

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
 *         送的Ip地址
 *  *          数据包对象DatagramPocket方法，个体Address()获取的是发送端的IP地址对象
 *  *          返回值是InetAddress对象
 *  *          接收到的字节个数
 *  *          数据包对象DatagramPacket方法，getLength()
 *  *          发送方的端口号
 *  *          数据包对象DatagramPacket方法getPort()发送端口
 *  *        6、关闭资源 发
 */

/**
 * 实现UDP接收端
 * 永不停歇的接收端
 */
public class UDPReceive {
    public static void main(String[] args) throws IOException {
        DatagramSocket ds= new DatagramSocket(60000);
        byte[] data = new byte[1024];
        while (true) {
            DatagramPacket dp = new DatagramPacket(data, data.length);
            ds.receive(dp);
            int length = dp.getLength();
            String ip = dp.getAddress().getHostAddress();
            int port = dp.getPort();
            System.out.println(ip + ":" + port+":");
            System.out.println(new String(data, 0, length));
        }
            //   ds.close();
    }
}
