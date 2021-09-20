package day28_Mysql.demo1;

import java.sql.*;

/**
 * PrepareStatement接口实现数据表的查询操作
 */
public class JBDCDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mybase?serverTimezone=UTC";
        String username = "root";
        String password = "147565";
        Connection con = DriverManager.
                getConnection(url, username, password);
        String sql = "select * from sort ";
        PreparedStatement pst = con.prepareStatement(sql);
        //调用pst对象的方法，执行查询语句，Select
       ResultSet rs= pst.executeQuery();
       while (rs.next()){
           System.out.println(
                   rs.getString("sid")+"  "
                  + rs.getString("sname")+"  "
                   +rs.getString("sprice")+"  "
                   +rs.getString("sdesc")
           );

       }
       rs.close();
       pst.close();
       con.close();

    }
}
