package day28_Mysql.demo;

import java.sql.SQLException;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;


/**
 * JDBC操作数据库的步骤
 * 1、注册驱动
 * //告知jvm使用的是哪一个数据库驱动
 * 2、获得链接
 * //使用JDBC中的类，完成对MySQL数据库链接
 * 3、获得语句执行平台
 * //通过连接对象，获取对SQL语句执行者对象
 * 4、执行SQL语句
 * //使用执行者对象，向数据库执行SQL语句
 * 5、处理结果
 * //获取到数据库的执行后结果
 * 6、释放资源
 * //close()
 */
public class JDBCDemo {
    public static void main(String[] args)
            throws ClassNotFoundException, SQLException {
        //1、注册驱动 使用反射技术，将驱动类加入到内容
        //使用java.sql.DriverManager类静态方法registerDriver(Driver driver)
        //Driver是一个接口，参数传递，MySQL驱动的实现类
        //DriverManager.registerDriver(new Driver());
        //和驱动类源代码相同，重复注册2次程序
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2、获得数据库的连接 DriverManager类中静态方法
        //static connection getConnection(String url,String user, String password)
        //返回值是Connection接口实现类，在mysql驱动程序
        //url:数据库地址 jdbc:mysql://连接的主机的IP地址:端口号//数据库的名字
        String url = "jdbc:mysql://localhost:3306/mybase?serverTimezone=UTC";
        String username= "root";
        String password = "147565";
        Connection con = DriverManager.
                getConnection(url,username,password);
        //System.out.println(con);
        //3、获得语句执行平台，通过数据库连接对象，获取到SQL语句执行者对象
        //con对象调用方法，Statement createStatement（） 获取Statement对象，将SQL语句发送到数据库
        //返回值是Statement接口的实现类对象，在MySQL驱动程序
        Statement state= con.createStatement();
        //System.out.println(state);
        //4、调用sql语句
        //通过执行者对象调用方法执行SQL语句，获取结果
        //int executeUpdate(String sql) 执行数据库中的SQL语句，仅限于执行insert delete update 不允许执行Select
        //返回值int，代表操作成功数据表多少行
       int row = state.executeUpdate("insert into sort " +
                "(sname, sprice, sdesc) values\n" +
                "('汽车',80900,'疯狂涨价')");
        System.out.println(row);
        //6、释放资源 一堆close();
        state.close();
        con.close();

    }



}











