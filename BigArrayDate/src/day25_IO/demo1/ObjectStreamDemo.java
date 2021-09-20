package day25_IO.demo1;

import java.io.*;

/**
 * IO流对象，实现对象Person序列化，和反序列化
 * ObjectOutPutStream 写对象，实现序列化
 * ObjectOutPutStream 读对象，实现反序列化
 */
public class ObjectStreamDemo {
    public static void main(String[] args)
            throws IOException,ClassNotFoundException {
        function();
        function_1();
    }

    /**
     * ObjectInputStream
     * 构造方法：ObjectInputStream(InputStream in)
     * 传递任意的字节输入流，输入流封装文件，必须是序列化的文件
     * Object readObject() 读取对象
     *
     */
    public static void function_1()
            throws IOException,ClassNotFoundException{
        FileInputStream fis =
                new FileInputStream("d:\\preson.txt");
        //创建反序列化流，构造方法中，传递字节输入流
        ObjectInputStream ois = new ObjectInputStream(fis);
        Object obj = ois.readObject();
        System.out.println(obj);
        ois.close();

    }
    /*
    ObjictOutputStream
    构造方法：ObjectOutputStream(OutputStream out)
    传递任意字节输出流
    void writeObject(Object o)写出对象方法
     */
    public static void function()throws IOException {
        //创建字节输出流封装文件，
        FileOutputStream fos =
                new FileOutputStream("d:\\preson.txt");
        //创建写出对象的序列化流对象，构造方法传递字节输出流
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        Person p = new Person("lisi",20);
        //调用序列化流方法writeObject，写对象
        oos.writeObject(p);
        oos.close();
    }
}
