package day31.demo1;

/**
 * 反射获取构造方法并运行，快捷的方式
 * 有前提：
 *  被反射的类，必须具有空参数构造方法
 *  构造方法权限必须public
 */
/*public class ReflectDemo3 {
    public static void main(String[] args) throws Exception{
        Class c = Class.forName("day31.demo.Person");
        //Class类中定义方法，T newInstance() 直接创建被反射类的对象实现
        Object obj = c.newInstance();
        //Person{age=0, name='null', sex='null'}
        System.out.println(obj);
    }
}
*/