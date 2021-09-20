package day28_Mysql.demo;

import java.sql.*;

/**
 * JBDC技术，查询数据表，获取结果集
 */
public class JDBCDemo1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        //1、注册驱动
        Class.forName("com.mysql.cj.jdbc.Driver");
        //2、获取连接对象

        String url = "jdbc:mysql://localhost:3306/mybase?serverTimezone=UTC";
        String username= "root";
        String password = "147565";
        Connection con = DriverManager.
                getConnection(url,username,password);
       //3、获取执行SQL 语句对象
        Statement stat= con.createStatement();
        //拼写查询语句
        String sql = "select * from sort";
        //4、调用执行者对象方法，执行SQL语句获取结果集
        //ResultSet executeQuery(String sql)    执行SQL语句中的select查询
        //返回值ResultSet接口的实现类对象，实现类在MySQL驱动中
        ResultSet rs = stat.executeQuery(sql);
        //5、处理结果集
        //ResultSet 接口方法boolean next() 返回true ，说明有结果集，反之说明没有结果集
        while (rs.next()){
            //要获取每列数据，使用的是ResultSet接口方法getxxx,在方法中建议写String的列名
            System.out.println
                    (      rs.getInt("sid")
                     +"  "+rs.getString("sname")
                     +"     "+ rs.getDouble("sprice")
                     +"      "+rs.getString("sdesc")+"\t"
                    );
           // rs.getInt(0);
        }
        //System.out.println(rs.next());
        rs.close();
        stat.close();
        con.close();
    }
}
