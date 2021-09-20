package Day01.Demo02;

public class Demo04PhoneParam {
    public static void main(String[] args) {
        Phone one = new Phone();
        one.brand = "苹果";
        one.price = 6399.1;
        one.color = "黑色";

        method(one);//传递进去的参数其实就是地址值
    }

    private static void method(Phone param) {

        System.out.println(param.brand);//苹果
        System.out.println(param.price);//6399.1
        System.out.println(param.color);//黑色
    }
}
