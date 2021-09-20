package day22_IO.demo1;

import java.io.File;
import java.io.IOException;

/**
 * File类的创建和删除功能
 * 文件或者是目录
 *
 */
public class FileDemo3 {
    public static void main(String[] args) throws IOException{
        function_2();
    }
    /**
     * File类的删除功能
     * boolean delete();
     * 删除的文件或者是文件夹名称，在File构造方法中给出
     * 删除成功返回true,删除失败返回false
     * 删除方法，不走回收站，直接从硬盘中删除
     * 删除有风险
     */
    public static void  function_2() {
        File file = new File("d:\\a.txt");
        File fAile = new File("d:\\b.txt\\d\\e\\f");
        boolean b = file.delete();
        boolean c = fAile.delete();
        System.out.println(b);
        System.out.println(c);
    }
    /**
     * file 创建文件夹功能
     * boolean mkdir (:\\);创建单层文件夹
     * boolean mkdirs (:\\    \\    \\);创建多层文件夹也可以创建单层文件夹
     * 创建的路径也在File构造方法中给出
     * 文件夹已经存在了，就不会在创建
     */
    public static void  function_1() {
        File file= new File("d:\\a.txt");
        File fAile= new File("d:\\b.txt\\d\\e\\f");
        boolean b = file.mkdir();
        boolean c = fAile.mkdirs();
        System.out.println(b);
        System.out.println(c);
    }
    /**
     * File的文件创建功能
     * boolean createNewFile()
     * 创建的文件路径和文件名，在File的构造方法中给出
     * 文件已经存在了，就不再创建
     */
    public static void  function() throws IOException {
        File file= new File("d:\\a.txt");
        boolean b = file.createNewFile();
        System.out.println(b);
    }
}
