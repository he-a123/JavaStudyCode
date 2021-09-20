package day28_Mysql.demo3;

import java.sql.Connection;

public class TestJDBCUtils {
    public static void main(String[] args) {
        Connection con = JDBCUtilConfig.getConnection();
        System.out.println(con);
    }
}
