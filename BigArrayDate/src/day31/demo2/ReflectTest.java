package day31.demo2;

import java.lang.reflect.Method;
import java.util.ArrayList;

/**
 * 定义一个集合类，泛型String
 * 要求向集合中添加Interger类型
 *
 * 反射方式，获取集合ArrayList类的Class文件对象
 * 通过class文件对象，调用add方法
 */
public class ReflectTest {
    public static void main(String[] args) throws Exception {
        ArrayList<String> array = new ArrayList<String>();
       // array.add(100);
        array.add("老6");
        //反射方式，获取出集合ArrayList类的class文件对象
        Class c = array.getClass();
        //获取ArrayList.class文件中的方法add
        Method method=c.getMethod("add",Object.class);
        //System.out.println(method);
        //使用invoke运行ArrayList方法add
        method.invoke(array,100);
        method.invoke(array,101);
        method.invoke(array,103);
        method.invoke(array,105);
        System.out.println(array);

    }
}
