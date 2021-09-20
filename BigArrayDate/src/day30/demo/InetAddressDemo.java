package day30.demo;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * 表示互联网的IP地址
 *  Java .net.InetAddress
 *  静态方法
 *      static InetAddress getLocalHost()    LocalHost()  本地主机
 *      返回本地主机，返回值InetAddress对象
 *
 *      static InetAddress getByName(String hostName)传递主机名，获取IP地址对象
 *
 *      非静态方法：
 *          String getHostName()获取主机名
 *          String getHostAddress() 获取IP地址
 */
    public class InetAddressDemo {
    public static void main(String[] args) throws UnknownHostException {
         function();
        // function_1();

    }
    public static void function_1() throws UnknownHostException {
        InetAddress inet = InetAddress.getByName("168.192.31.1");
        System.out.println(inet);
    }


    public static void function() throws UnknownHostException {
        InetAddress inet= InetAddress.getLocalHost();
        System.out.println(inet);
        String ip = inet.getHostAddress();
        String name = inet.getHostName();
        System.out.println(ip);
        System.out.println(name);
       /* //toString切割方法split
        String host = inet.toString();
        String[] s = host.split("/");
        for(String f :s){
            System.out.println(f);*/
        }
    }




