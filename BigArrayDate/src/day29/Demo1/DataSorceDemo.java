package day29.Demo1;

import org.apache.commons.dbcp.BasicDataSource;

import java.sql.Connection;
import java.sql.SQLException;

/*
* 连接jar包中，定义好的类BasicDatasource
* 实现数据源规范接口 javax.sql.DataSource
* */
public class DataSorceDemo {
    public static void main(String[] args){
        //创建DataSource接口的实现类对象
        //实现类，org.apache.commons.dbcp
        BasicDataSource dataSource = new BasicDataSource();
        //连接数据库的4个基本信息，通过对象方法setXXX设置进来
        dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/mybase?serverTimezone=UTC");
        dataSource.setUsername("root");
        dataSource.setPassword("147565");
        //调用getConnection获取数据库的连接
        try {
            Connection con = dataSource.getConnection();
            System.out.println(con);
        }catch (SQLException ex){
           // ex.printStackTrace();
            System.out.println(ex);
            throw new RuntimeException("数据库连接失败");
        }


    }
}
