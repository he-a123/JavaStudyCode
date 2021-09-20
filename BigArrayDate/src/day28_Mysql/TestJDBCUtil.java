package day28_Mysql;

import JDBCutil.JDBCUtils;

import java.sql.*;

public class TestJDBCUtil {
    public static void main(String[] args) throws SQLException {
        Connection con = JDBCUtils.getConnection();
        PreparedStatement pst = con.prepareStatement("select * from sort");
       ResultSet rs =  pst.executeQuery();
       while (rs.next()){
           System.out.println(rs.getString("sid")+"  "
                   +rs.getString("sname")+"  "
                   +rs.getString("sprice")+"  "
                   +rs.getString("sdesc"));
       }
       JDBCUtils.close(con,pst, rs);
    }
}
