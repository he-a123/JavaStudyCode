package day28_Mysql.demo1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class JBDCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mybase?serverTimezone=UTC";
        String username= "root";
        String password = "147565";
        Connection con = DriverManager.
                getConnection(url,username,password);
        //拼写SQL的修改语句，采用？号占位
        String sql = "update sort set sname=?,sprice=? where sid=?";
        //调用数据库连接对象con的方法preparedStatement获取SQL语句的预编译对象
        PreparedStatement pst = con.prepareStatement(sql);
        //调用pst的方法setxxx设置？占位
        pst.setObject(1,"汽车美容");
        pst.setObject(2,59998);
        pst.setObject(3,9);
        //调用pst的方法执行SQl语句
        pst.executeUpdate();
        pst.close();

        con.close();

}
}
