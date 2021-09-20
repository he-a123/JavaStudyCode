package day28_Mysql.demo;

import java.sql.*;
import java.util.Scanner;

/**
 * Java程序实现用户登录，用户名和用户密码，数据库检查
 * 演示注入攻击
 *
 */
public class JDBCDemo2 {
    public static void main(String[] args)throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.cj.jdbc.Driver");

        String url = "jdbc:mysql://localhost:3306/mybase?serverTimezone=UTC";

        String username= "root";

        String password = "147565";
         Connection con = DriverManager.getConnection
                 (url,username,password);
         Statement stat = con.createStatement();
         //执行sql语句，数据表，查询用户名和密码，如果存在登陆成功，如果不成功登录失败
        Scanner sc = new Scanner(System.in);
        String user = sc.nextLine();
        String pass = sc.nextLine();
        String sql = "select * from users where username='"+ user + "'and upassword='"+ pass + "'" ;
        System.out.println(sql);
        ResultSet rs = stat.executeQuery(sql);
        while (rs.next()){
            System.out.println(rs.getString("username")
            +"  "+rs.getString("upassword"));
        }
        //System.out.println(rs.next());
        rs.close();
        stat.close();
        con.close();
    }
}
