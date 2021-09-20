package day26.demo;

/**
 * 程序中的主线程
 */
public class Demo {
    public static void main(String[] args) {
        System.out.println(Math.abs(-9));
        function();

    }
    public static void function(){
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
        }
    }
}
