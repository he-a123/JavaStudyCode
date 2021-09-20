package day31.demo1;

import java.lang.reflect.Method;

/**
 * 反射获取有参数的成员方法并执行
 * public void sleep (String,int,double)
 */
/*public class ReflectDemo7 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("day31.demo.Person");
        Object obj= c.newInstance();
        //调用Class类的方法getMethod获取指定的方法sleep运行
        Method method=c.getMethod("sleep",int.class,String.class,double.class);
        //调用Method类方法invoke（obj,args)运行sleep方法
        method.invoke(obj,100,"休眠",888.33);


    }
}*/
