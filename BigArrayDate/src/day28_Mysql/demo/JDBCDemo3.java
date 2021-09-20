package day28_Mysql.demo;

import java.sql.*;
import java.util.Scanner;

/**
 * Java程序实现用户登录，用户名和用户密码，数据库检查
 * 防止被注入攻击
 *  Statement 接口实现类，作用执行SQL语句，返回结果集
 *  有一个子接口PreparedStatement（sol预编译存储，多次高效的执行SQL）
 *  PreparedStatement的实现类在驱动的数据库中，如何获取实现类
 *
 *  是Connection数据库连接对象的方法
 *  PreparedStatement PrepareStatement(String sql)
 */
public class JDBCDemo3 {
    public static void main(String[] args)throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/mybase?serverTimezone=UTC";

        String username= "root";

        String password = "147565";
         Connection con = DriverManager.getConnection
                 (url,username,password);

        // Statement stat = con.createStatement();
         //执行sql语句，数据表，查询用户名和密码，如果存在登陆成功，如果不成功登录失败
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String pass = sc.nextLine();
        String sql = "select * from users where username= ? and upassword = ?" ;
        //调用Connection接口的方法prepareStatement，用于获取PreparedStatement接口的实现类
        //方法中参数，SQL语句中的参数全部采用问号占位符  调用该方法时参数要改为问号  ？
        PreparedStatement pst = con.prepareStatement(sql);
        //调用pst对象set方法，设置问号占位符上的参数
        pst.setObject(1,user);
        pst.setObject(2,pass);
        //System.outa.println(sql);
        //调用方法，执行Sql，获取结果集
        ResultSet rs = pst.executeQuery();
        while (rs.next()){
            System.out.println(rs.getString("username")
            +"  "+rs.getString("upassword"));
        }
        //System.out.println(rs.next());
        rs.close();
        pst.close();
        con.close();
    }
}
