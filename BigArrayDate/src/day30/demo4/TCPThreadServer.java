package day30.demo4;

import java.net.ServerSocket;
import java.net.Socket;


public class TCPThreadServer {
    public static void main(String[] args)throws Exception {
         ServerSocket server = new ServerSocket(8880);
        while (true) {
        Socket socket = server.accept();
        new Thread(new Upload(socket)).start();
    }
}
}
