package day24_IO.demo3;

import java.io.*;

/**
 * 文件复制方式，字节流，一共4个方式
 * 1.字节流读写单个字节      //836191  毫秒
 * 2.字节流读写字节数组  //1137毫秒
 * 3.字节缓冲区读写单个字节    //6295  毫秒
 * 4.字节缓冲区读写字节数组    //282  毫秒
 */


public class copyDemo {
    public static void main(String[] args) throws IOException {
        long f = System.currentTimeMillis();
        copy_4(new File("d:\\a.exe"),new
                File("d:\\b.exe"));
        long e = System.currentTimeMillis();
        System.out.println(e-f);
    }
    /**
     * 方法，实现文件复制
     * 4.字节缓冲区读写字节数组
     */
    public static void copy_4(File src,File desc)throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src) );

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = bis.read(bytes))!=-1){
            bos.write(bytes,0,len);
        }
        bis.close();
        bos.close();

    }
    /**
     * 方法，实现文件复制
     * 3.字节缓冲区读写单个字节
     */
    public static void copy_3(File src,File desc)throws IOException {
        BufferedInputStream bis = new BufferedInputStream(new FileInputStream(src) );

        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream(desc));
          int len = 0;
          while ((len = bis.read())!=-1){
              bos.write(len);
          }
            bis.close();
            bos.close();

    }
    /**
     * 方法，实现文件复制
     * 2.字节流读写字节数组
     */
    public static  void copy_2(File src,File desc)throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(desc);
        int len = 0;
        byte[] bytes = new byte[1024];
        while ((len = fis.read(bytes))!=-1){
            fos.write(bytes,0,len);
        }
        fos.close();
        fis.close();

    }
    /**
     * 方法，实现文件复制
     * 1.字节读写单个字节
     */
    public static void copyByte(File src,File desc)throws IOException {
        FileInputStream fis = new FileInputStream(src);
        FileOutputStream fos = new FileOutputStream(desc);
        int len = 0;
        while ((len = fis.read())!=-1){
        fos.write(len);
        }
        fos.close();
        fis.close();

    }
}
