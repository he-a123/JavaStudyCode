package Day01.Demo02;

public class Demo01phoneTwo {
    public static void main(String[] args) {
        //根据phone类，创建一个名为one的对象
        //格式：类名称 对象名 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("-----------------------");

        one.brand = "华为";
        one.price = 99822.000000;
        one.color = "黑色";
        System.out.println(one.brand);
        System.out.println(one.color);
        System.out.println(one.price);
        System.out.println("-----------------------");

        one.call("张姣荣");
        one.sendMessage();
        System.out.println("--------------------------");

        Phone two = new Phone();
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println("-----------------------");

        two.brand = "苹果";
        two.price = 9822.0;
        two.color = "蓝色";
        System.out.println(two.brand);
        System.out.println(two.color);
        System.out.println(two.price);
        System.out.println("-----------------------");

        two.call("张姣荣");
        two.sendMessage();
    }
}
