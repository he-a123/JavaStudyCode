package day31.demo1;

import java.lang.reflect.Constructor;

/**
 * 反射获取私有的构造方法运行
 * 不推荐，破坏了程序的封装性，安全性
 * 暴力反射
 */
public class ReflectDemo4 {
    public static void main(String[] args)throws  Exception {
        Class c = Class.forName("day31.demo.Person");
        //geyDeclaredConstructor() 获取所有构造方法，包括私有
        /*Constructor[] cons = c.getDeclaredConstructors();
       //(int,java.lang.String,java.lang.String)
        for(Constructor con : cons){
            System.out.println(con);*/
        //Constructor 类的方法getDeclaredConstructor（Class...c）获取到指定参数列表的构造方法
        Constructor con = c.getDeclaredConstructor(int.class ,String.class,String. class);
              //Constructor类的父类AccessibleObject有一个方法setAccessible(boolean b)
            con.setAccessible(true);//可以调用私有的构造器
               Object obj= con.newInstance(20,"苏","蜡");
        System.out.println(obj);

        }
    }

