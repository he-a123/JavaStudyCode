package day31.demo1;

import java.io.File;
import java.lang.reflect.Field;

/**
 * 反射获取成员变量，并修改值
 * Person类中的String name 举例
 */
/*public class ReflectDemo5 {
    public static void main(String[] args) throws Exception {
        Class c = Class.forName("day31.demo.Person");
        //Object obj = c.arrayType();
        Object obj = c.newInstance();
        //获取成员变量  Class类的方法getField（）class文件中的所有公共的成员变量
        //返回值是Filed[] Filed 类描述成员对象的类
        /*Field[] fields= c.getFields();
        for(Field f :fields){
            System.out.println(f);
        }*/
        //获取指定的成员变量String name
        //Class类的方法 Field getField（传递字符串类型的成员变量名）  获取指定的成员变量
        /*Field field=c.getField("name");
        System.out.println(field);
        //Field类的方法void set(Object obj, Object value),修改成员变量的值
        //Object obj 必须有对象支持，Object value 修改后的值
        field.set(obj,"赵四");
        System.out.println(obj);
    }
}*/
