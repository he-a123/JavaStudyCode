package day31.demo;

import java.lang.*;
import java.lang.reflect.Constructor;

/**
 * 通过反射，获取有参数的构造方法并运行
 */
public class ReflectDemo2 {
    public static void main(String[] args)throws Exception {
    Class c = Class.forName("day31.demo.Person");
    //获取带有，String和int参数的构造方法
        //Constructor<T> getConstructor(类<?>... parameterTypes)
        //返回一个 Constructor对象，
        // 该对象反映 Constructor对象表示的类的指定的公共 类函数。
        //类<?>... parameterTypes传递要获取构造方法的参数列表
        Constructor con= c.getConstructor (int.class,String.class,String.class);
        System.out.println(con);
        //运行构造方法
        //T newInstance(Object....initargs)
        //Object....initargs 运行构造方法后，传递的实际参数
        Object obj=con.newInstance(30,"zhangsn","zhangsan");
        System.out.println(obj);


    }
}
