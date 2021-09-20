package day29.Demo1;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.ArrayListHandler;

import java.sql.SQLException;
import java.util.List;

/*
* 测试工具类
* 提供DataSource接口的数据连接池
* QueryRunner类构造方法，接收DataSource接口的实现类
* 在后边再次调用update，query无需传递他们Connection连接对象
* */
public class QueryRunnerDemo {
    //定义两个方法，来实现数据的添加和数据的查询
    //QueryRunner类对象写在成员位置
    private static QueryRunner qr = new QueryRunner(JDBCUtils.getDataSource());
    public static void main(String[] args) {
        //  insert();
        select();
        //  delete();
        // update();
    }
    public static void update() {
        String sql = "update  sort set sname=? , sprice=?,sdesc=? where sid=?";
        try {
            Object[] params = {"电脑笔记本",18901,"华硕笔记本电脑",5};
            int row = qr.update(sql, params);
            System.out.println(row);
        }catch(SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException("数据修改失败");
        }
    }
    //数据删除
    public static void delete() {
        String sql = "delete from sort where sid>=? and sid<?";
        try {
            Object[] params = {6,11};
            int row = qr.update(sql, params);
            System.out.println(row);
        }catch(SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException("数据删除失败");
        }
    }
    //数据查询
    public static void select() {
        String sql = "select * from sort";
        try {
            List<Object[]> list = qr.query(sql, new ArrayListHandler());

        for (Object[] objs : list) {
            for (Object obj : objs) {
                System.out.print(obj + "\t");
            }
            System.out.println();
        }
    }catch(SQLException ex){
            ex.printStackTrace();
            throw new RuntimeException("数据查询异常");
        }

    }
public static void insert(){
        String sql = "insert into sort (sid,sname,sprice,sdesc) values (?,?,?,?),(?,?,?,?),(?,?,?,?)";
        Object[]params = {6,"榴莲",100.32,"榴莲本莲",7,"苹果",0.32,"苹果爱泼",8,"香蕉",10.32,"不呐呐",};
        try{
    int row =qr.update(sql,params);
            System.out.println(row);
}catch (SQLException ex){
            ex.printStackTrace();
    throw new RuntimeException("数据添加失败")  ;
        }
    }
}
