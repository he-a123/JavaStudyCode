package day29.Demo1;

import org.apache.commons.dbcp.BasicDataSource;

import javax.sql.DataSource;

/*
* 使用DBCP实现数据库的连接池
* 连接池配置，自定义类
* 最基本4项必须完整
* 对数据库连接池其他配置，自定义
* */
public class JDBCUtils {
    //创建BasicDataSource类对象
    private static BasicDataSource datasource
            = new BasicDataSource();
    //使用静态代码块，对BasicDataSource对象中的配置进行自定义
    static {
        //数据库连接信息必须配
        datasource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        datasource.setUrl("jdbc:mysql://localhost:3306/mybase?serverTimezone=UTC");
        datasource.setUsername("root");
        datasource.setPassword("147565");
        //对连接池中的连接数量进行配置，可选配
        datasource.setInitialSize(100);//最大初始化连接
        datasource.setMaxActive(50);//最大连接数量
        datasource.setMaxIdle(30);//最大空闲数
        datasource.setMinIdle(1);//最小空闲数
    }

    //定义静态方法，返回BasicDataSource类对象
    public static DataSource getDataSource(){
        return datasource;
    }

}
