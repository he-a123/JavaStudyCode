package Day01.Demo02;

public class Demo03phoneSame {
    public static void main(String[] args) {
        //根据phone类，创建一个名为one的对象
        //格式：类名称 对象名 = new 类名称();
        Phone one = new Phone();
        System.out.println(one.brand);//null
        System.out.println(one.color);//0.0
        System.out.println(one.price);//null
        System.out.println("-----------------------");

        one.brand = "华为";
        one.price = 99822.000000;
        one.color = "黑色";
        System.out.println(one.brand);//华为
        System.out.println(one.color);//黑色
        System.out.println(one.price);//99822.0
        System.out.println("-----------------------");

        one.call("张姣荣");//给娇娇打电话
        one.sendMessage();//群发短信
        //将one当中保存的对象地址赋值给two
        Phone two = new Phone();
        System.out.println(two.brand);//null
        System.out.println(two.color);//0.0
        System.out.println(two.price);//unll
        System.out.println("-----------------------");

        two.brand = "苹果";
        two.price = 9822.0;
        two.color = "蓝色";
        System.out.println(two.brand);//苹果
        System.out.println(two.color);//蓝色
        System.out.println(two.price);//9822.0
        System.out.println("-----------------------");

        two.call("张姣荣");//给娇娇打电话
        two.sendMessage();//群发短信
    }
}
