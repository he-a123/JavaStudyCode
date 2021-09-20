package cn.itcast.day04.Demo04;
/*
对于方法类似的功能来说，因为参数列表不一样，却需要记住那么多不同的方法名称，太麻烦

方法的重载(over load) :多个方法的名称一样，但参数列表不一样。
好处：只需要记住唯一一个方法名称，就可以实现类似的多个功能
方法重载与下列因素相关
1、参数个数不同
2、参数类型不同
3、参数的多类型顺序不同

方法重载与下列因素无关
1、与参数的名称无关
2、与方法的返回值类型无关
 */
public class Demo01MethodOverload {
    public static void main(String[] args) {
        /*System.out.println(sumTwo(10,20));
        System.out.println(sumThree(10,20,30));
        System.out.println(sumFour(10,20,30,40));*/

        System.out.println(sum(10,20));
        System.out.println(sum(10,20,30));
        System.out.println(sum(10,20,40,50));
       // System.out.println(sum(10,20));
        sum(10,20);
}
    public static int sum(int a,double b){
      return (int)(a + b);
    }
    public static int sum(double a,int b){
        return (int)(a + b);
    }
    public static int sum(int a, int b){
        System.out.println("两个参数的方法运行");
        return a + b ;
    }
    //错误写法！与方法的返回值类型无关
   /* public static double sum(int a,double b){
        return a + b +0.0;
    }*/
    //错误写法！与参数名称无关
    /*public static int sum(int x,double y){
        return (int)(x + y);
    }*/
    public static int sum(double a,double b){
        return (int)(a + b);
    }
    public static int sum(int a, int b,int c){
        System.out.println("三个参数的方法运行");
        return a + b + c ;
    }
    public static int sum(int a, int b, int c, int d){
        System.out.println("四个参数的方法运行");
        return a + b + c + d;
    }
}
