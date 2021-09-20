package day29.Demo;

import day28_Mysql.demo3.JDBCUtilConfig;
import org.apache.commons.dbutils.DbUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.Connection;
import java.sql.SQLException;

/**
 * 使用QueryRunner类，实现数据表的三个功能
 * insert delete update
 * 调用Query Runner类的方法update（connection con，String sql，Object ...param）
 * Object...param 可变参数，Object类型，SQL语句会出现？占位符
 数据库连接对象，自定义工具类的传递
 */
public class QueryRunnerDemo {
    private static Connection con = JDBCUtilConfig.getConnection();

    public static void main(String[] args) throws SQLException {
       // insert();
       // update();
        delete();
    }
    /*
     * 定义方法，使用QueryRunner类的方法update,将数据表中的数据删除
     * */
public static void delete() throws SQLException {
    //创建QueryRunner类对象
    QueryRunner qr = new QueryRunner();
    //写删除的SQL语句
    String sql = "delete from sort where sid=? ";
    //调用QueryRunner方法update
    int row = qr.update(con,sql,5);
    System.out.println(row);
    /*
    * 判断insert，update，delete执行是否成功
    * 对返回值row进行判断
    * if(row>0) 执行成功
    * */
    DbUtils.closeQuietly(con);
}
    /*
    * 定义方法，使用QueryRunner类的方法update,将数据表中的数据修改
    * */
    public static void update() throws SQLException {
        QueryRunner qr = new QueryRunner();
        //写修改sql的语句
        String sql = "update sort set sname=?,sprice=?,sdesc=? where sid=?";
        //定义数组，存储修改语句中？的参数
        Object[] params= {"花卉",100.88,"情人节玫瑰",4};
        //调用QueryRunner方法update
        int row = qr.update(con,sql,params);
        System.out.println(row);
        DbUtils.closeQuietly(con);
    }
    /*
    * 定义方法，使用QueryRunner类的方法update向数据表中添加数据
    *
    * */
    public static void insert() throws SQLException {
        //创建QueryRunner类对象
        QueryRunner qr = new QueryRunner();
        String sql = "insert into sort (sname,sprice,sdesc)values (?,?,?)";
       //将三个问号占位符的实际参数写在数组中
        Object[] param ={"体育用品",523.26,"购买体育用品"};
        //调用QueryRunner类的方法update执行SQl语句
        int row =qr.update(con,sql,param);
        System.out.println(row);
        DbUtils.closeQuietly(con);
    }
}
