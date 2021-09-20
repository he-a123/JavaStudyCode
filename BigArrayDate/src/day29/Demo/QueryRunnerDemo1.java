package day29.Demo;

import day28_Mysql.demo2.Sort;
import day28_Mysql.demo3.JDBCUtilConfig;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.*;


import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

/*
* QueryRunner数据查询操作
*   调用QueryRunner类方法query（connection con,String sql,ResultSetHandle r,Object param ）
* ResultSetHandle r 表示结果集的处理方式，传递ResultSetHandle接口实现类
* Object... param表示SQL语句中的？占位符
* 注意：query方法返回值是一个 T 泛型，具体返回值数据类型，跟随结果集处理方式变化

 * */
public class QueryRunnerDemo1 {
    private static Connection con = JDBCUtilConfig.getConnection();

    public static void main(String[] args) throws SQLException {
//arrayHandler();
        //arrayListHandler();
        //beanHandler();
       // beanListHandler();
       // columnListHandler();
        //scalarHandler();
        //mapHandler();
        mapListHandler();
    }
    /*
    * 结果集第八种处理方法，MapListHandler
    * 将结果集的每一行数据存储到Map集合，键：列名  值：每一列的数据
    * Map集合过多，存储到List集合*
    */
    public static void mapListHandler() throws SQLException {
        QueryRunner qr =new QueryRunner();
        String sql = "select * from sort ";
        List<Map<String,Object>> list = qr.query(con,sql,new MapListHandler());
        //遍历集合
        for(Map<String,Object> map:list){
            for(String key:map.keySet()){
                System.out.print(key+"  "+map.get(key)+"\t");
            }
            System.out.println();
        }
    }
     /*
     * 结果集的第七种处理方法，MapHandler
     * 将结果集第一行数据，封装到Map集合中
     * Map<键，值>  键：表示列名  值：表示这列的数据
     */
    public static void mapHandler() throws SQLException {
        QueryRunner qr =new QueryRunner();
        String sql = "select * from sort ";
        //调用方法query方法，传递结果集实现类MapHangler
        //返回值：Map集合，Map接口实现类是泛型
       Map<String,Object> map= qr.query(con,sql,new MapHandler());
       for(String key: map.keySet()){//map集合的遍历别忘
           System.out.println(key+"   "+map.get(key));
       }
    }

    /*
    * 结果集第六种处理方法，ScalarHandler
    * 对于结果集查询后只有一个结果
    * */
    public static void scalarHandler() throws SQLException {
        QueryRunner qr =new QueryRunner();
        String sql = "select count(*) from sort ";
        Long count=qr.query(con,sql,new
                ScalarHandler<Long>());
        System.out.println(count);
    }
    /*
    * 结果集第五种处理方法，ColumnListHandler
    * 结果集，指定列的数据，存储到List集合
    * List<Object>  是因为每一列的数据类型都不一样
    * */
    public static void columnListHandler() throws SQLException {
        QueryRunner qr =new QueryRunner();
        String sql = "select * from sort ";
       List<Object> list = qr.query(con,sql,new
               ColumnListHandler<Object>
               ("sname"));
       for(Object obj:list){
           System.out.println(obj);
       }
        System.out.println(list);
    }
    /*
    * 结果集第四种处理方法，BeanListHandler
    * 将数据结果集的每一行数据，封装成JavaBean对象
    * 多个JavaBean对象封装到List集合中
    * */
    public static void beanListHandler() throws SQLException {
        QueryRunner qr =new QueryRunner();
        String sql = "select * from sort ";
       List<Sort> list = qr.query(con,sql,
               new BeanListHandler<Sort>(Sort.class));
       for(Sort s:list){
           System.out.println(s);
       }
    }

    /*
    *结果集第三种处理方法BeanHandler
    * 将结果集的第一行数据封装成JavaBean对象
    * 注意：被封装成数据到JavaBean对象，Sort必须有空参构造
    * */
    public static void beanHandler() throws SQLException {
        QueryRunner qr =new QueryRunner();
        String sql = "select * from sort ";
        Sort s = qr.query(con,sql,new BeanHandler
                <Sort>(Sort.class));
        System.out.println(s);

    }
    /*
    * 结果集的第二种处理方式，ArrayListHandler
    * 将结果集的每一行，封装到对象数组中，出现很多对象数组
    * 对象数组存储到List集合
    * */
    public static void arrayListHandler() throws SQLException {
        QueryRunner qr =new QueryRunner();
        String sql = "select * from sort where sid>0";
        //调用query方法，结果集处理的参数上，传递实现类ArrayListHandler
        //获取方法返回值，每行是一个对象数组，存储到了LIst集合
        List<Object[]> result =
                qr.query(con,sql,new
                        ArrayListHandler());
        //System.out.println(result);`
        //集合的遍历
        for(Object[] objs:result){
            //遍历对象数组
        for(Object obj:objs) {
            System.out.print(obj+"\t");
        }
            System.out.println();
        }
    }
    /*
    * 结果集第一种处理方法，ArrayHandler
    * 将结果集的第一行存储到对象数组中 Object[]
    * */
    public static void arrayHandler() throws SQLException {
        QueryRunner qr =new QueryRunner();
        String sql = "select * from sort";
        //调用Query执行查询，传递连接对象，sql语句，结果集处理方式的实现类
        Object[] result =qr.query(con,sql,new ArrayHandler());
        for(Object obj:result){
            System.out.print(obj+"\t");
        }
    }
}
