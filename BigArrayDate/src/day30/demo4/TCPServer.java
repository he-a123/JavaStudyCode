package day30.demo4;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

/**
 * TCP图片上传服务器
 * 1、Server Socket 套接字对象，监听8880端口
 * 2、方法accept（）获取客户端连接对象
 * 3、客户端连接对象获取字节输入流，读取客户端发送的图片
 * 4、创建File对象，绑定上传文件夹
 *  判断文件夹存在，不存在，自行创建文件夹
 *  5、创建字节输出流，输出流的数据目的就在File对象所在文件夹
 *  6、字节流读取文件，字节流将图片存储到目的文件夹中
 *  7、将上传反馈回馈到客户端
 *  8、关闭资源
 */
public class TCPServer {
    public static void main(String[] args) throws IOException {
 ServerSocket server = new ServerSocket(8880);
        Socket socket = server.accept();
        //通过客户端连接对象，获取字节输入流，读取客户端图片
        InputStream in = socket.getInputStream();
        //将目的文件封装到File对象
        File upload = new File("d:\\upload");
        if (!upload.exists()) {
            upload.mkdirs();
        }
        //防止文件重名，被覆盖，重新定义文件名
        //规则：域名+毫秒值+6位随机数
        String filename = "it" + System.currentTimeMillis() + new Random().nextInt(99999) + ".mp4";
        //创建字节输出流，将文件写入到目的文件夹中
        FileOutputStream fos = new FileOutputStream(upload + File.separator + filename);
        //读写字节数组
        byte[] bytes = new byte[1024 * 8];
        int len = 0;
        while ((len = in.read(bytes)) != -1) {
            fos.write(bytes, 0, len);
        }

        //通过客户端连接对象，获取字节输出流
        //反馈数据回写客户端
        socket.getOutputStream().write("上传成功".getBytes());
        fos.close();
        socket.close();
         server.close();
    }
}
