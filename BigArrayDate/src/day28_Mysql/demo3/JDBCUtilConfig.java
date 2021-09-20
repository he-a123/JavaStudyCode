package day28_Mysql.demo3;

import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/**
 * 编写JDBC的工具类，获取数据库的连接
 * 采用配置文件的方式
 * 读取配置文件，获取连接执行一次，Static{}
 */
public class JDBCUtilConfig {
    private static Connection con;
    private static String driverClass;
    private static String url;
    private static String username;
    private static String password;
    static {
        try {
            readConfig();
        Class.forName(driverClass);
       con = DriverManager.getConnection(url,username,password);} catch (Exception e) {
        throw new RuntimeException("数据库连接失败");
        }
    }
    private static void readConfig ()throws Exception{
        InputStream in = JDBCUtilConfig.class.
                getClassLoader().getResourceAsStream
                ("database.properties");
        Properties pro = new Properties();
        pro.load(in);
        driverClass = pro.getProperty("driverClass");
        url = pro.getProperty("url");
        username = pro.getProperty("username");
        password = pro.getProperty("password");
    }
    public static Connection getConnection(){
        return con;
    }
}
