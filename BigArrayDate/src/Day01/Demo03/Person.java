package Day01.Demo03;
/*
问题描述：定义Persion的年龄时，无法阻止不合理的数值被设置进来。
解决方案：用private关键字进行修饰，那么本类中依然可以随意访问。
但是超出了本类范围之外就不能再直接访问了。
间接访问private成员变量，就是定义一对儿Geter/Setter方法

必须叫setXxx或者getXxx命名规则
对于getter来说，不能有参数，返回值类型和成员变量对应；
对于setter来说，不能有返回值，参数类型和成员变量对应。
 */
public class Person {
    String name;//姓名
   private int age;//年龄

    public void show(){
        System.out.println("我叫；" + name + "年龄：" + age);
    }
    //这个成员方法，专门用于向age设置数据

    public void setAge(int num) {
        if(num<100 && num >=9){
            age = num;
        }else {
            System.out.println("数据不合理!");
        }

    }
//这个成员方法，专门用于获取age数据
    public int getAge() {
        return age;
    }
}
