package Day01.Demo02;

public class Demoo5PhoneReturn {
    public static void main(String[] args) {
        Phone two = getPhone();
        System.out.println(two.brand);//苹果
        System.out.println(two.price);//9630.1
        System.out.println(two.color);//蓝色
    }
    public static Phone getPhone(){
        Phone one = new Phone();
        one.brand = "苹果";
        one.color = "蓝色";
        one.price = 9630.1;
        return one;
    }
}
