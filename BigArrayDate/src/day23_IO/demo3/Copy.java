/*package day23_IO.demo3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 将数据源c:\\a.txt
 * 复制到d:\\a.txt
 * 字节流进行复制，绑定数据源
 * 字节输出流传输，绑定数据目的地
 *
 * 输入，读取1字节
 * 输出，写入1字节
 */
/*public class Copy {
  //  public static void main(String[] args) {
        //定义两个两个流对象变量
        FileInputStream  fis = null;
        FileOutputStream fos = null;
        try {//建立两个流的对象，绑定数据源和数据目的
            fis = new FileInputStream("D:\\安装包\\jdk-14_windows-x64_bin.exe");
            fos = new FileOutputStream("e:\\jdk-14_windows-x64_bin.exe");
                //字节输入流读一个字节输出流输出一个字节
            int len = 0;
            while(( len =fis.read())!= -1){
                fos.write(len);
            }
        }catch(IOException ex){
            System.out.println(ex);
            throw new RuntimeException("文件复制失败！");
        }finally {
            try {
                if(fos != null)
                fos.close();
            }catch (IOException ex){
                throw new RuntimeException("释放资源失败");
            }finally {
                try {
                    if(fis != null)
                        fis.close();
                }catch (IOException ex){
                    throw new RuntimeException("释放资源失败");
                }
            }
        }
    }
}*/
