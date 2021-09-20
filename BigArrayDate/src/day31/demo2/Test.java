//package day31.demo2;


import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStream;
import java.lang.reflect.Method;
import java.util.Properties;

/**
 * 调用Person，Student，Worker
 * 类不清楚，方法也不清楚
 * 通过配置文件实现此功能
 * 运行的类名和方法名字，以键值对的形式，写在文本中
 * 运行哪个类，读取配置文件即可
 * 实现步骤
 *      1、准备配值文件，键值对
 *      2、IO流读取配置文件 Reader
 *      3、文件中键值对存储到集合中Properties
 *          集合保存键值对，就是类名和方法名
 *       4、反射获取指定类的class文件对象
 *       5、class文件对象，获取指定的方法
 *       6、运行方法
 */
/*public class Test {
    public static void main(String[] args) throws Exception {
        //IO流读取配置文件//创建集合对象
        Properties pro = new Properties();
        InputStream in = new BufferedInputStream(new FileInputStream("config.properties"));
        FileReader r= new FileReader("config.properties");


        //调用集合方法load，传递流对象
        pro.load(in);
        in.close();
        //通过键获取值
        String className = pro.getProperty("className");
        String methodName= pro.getProperty("methodName");
        //反射获取指定类的class文件对象
        Class c = Class.forName(className);
        Object obj = c.newInstance();
        //获取指定的方法名
        Method method = c.getMethod(methodName);
        method.invoke(obj);

}
}*/