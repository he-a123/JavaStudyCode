package cn.itcast.day04.Demo04;
/*
byte short int long float double char boolean
string
在调用输出语句的时候，println方法其实就是进行了多种数据类型的重载形式。
 */
public class Demo04OverLoadPrint {
    public static void myPrint(byte num){
        System.out.println(num);
    }
    public static void myPrint(short num){
        System.out.println(num);
    }
    public static void myPrint(int num){
        System.out.println(num);
    }
    public static void myPrint(long num){
        System.out.println(num);
    }
    public static void myPrint(float num){
        System.out.println(num);
    }
    public static void myPrint(double num){
        System.out.println(num);
    }
    public static void myPrint(char num){
        System.out.println(num);
    }
    public static void myPrint(boolean isssss){
        System.out.println(isssss);
    }
    public static void myPrint(String str){
        System.out.println(str);
    }
}
