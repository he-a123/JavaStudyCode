package day28_Mysql.demo3;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 加载properties配置文件
 * IO读取文件，键值对存储到集合
 * 从集合中以键值对方式获取数据库的连接信息，完成数据库的连接
 */
public class PropertiesDemo {
    public static void main(String[] args) throws Exception {
        //使用类的加载器，调用配置文件
        InputStream in = PropertiesDemo.class.getClassLoader().getResourceAsStream("database.properties");
       /* FileInputStream fis = new FileInputStream("src/database.properties");*/
       // System.out.println(in);
        Properties pro = new Properties();
        pro.load(in);
        //System.out.println(pro);
        //获取集合中的键值对
        String driverClass = pro.getProperty("driverClass");
        String url = pro.getProperty("url");
        String username = pro.getProperty("username");
        String password = pro.getProperty("password");
        Class.forName(driverClass);
        Connection con = DriverManager.getConnection
                (url,username,password);
       // System.out.println(con);

    }
}
