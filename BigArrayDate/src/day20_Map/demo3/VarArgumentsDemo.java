package day20_Map.demo3;
/*
JDK1.5新特性，方法的可变参数
前提：方法参数数据类型确定，参数的个数任意
 */
public class VarArgumentsDemo {
    public static void main(String[] args) {
      // getSum();
       int sum = getSum(1,2,3,4,5,6,7);
        System.out.println(sum);
    }
    /*
    可变参数的注意事项：
    1、一个方法中，可变参数只能有一个
    2、可变参数，必须写在参数列表的最后一位
     */
    public static void function(Object...o){
                        //funcation(int b, int c ,int...a)//正确写法
                        //funcation(int...a,String...b)//错误写法
    }
    /*
    定义方法计算10个整数和
    方法的可变参数实现
    可变参数语法：数据类型...变量名
    可变参的实质就是数组
     */
    public static int getSum(int...a){
        int sum = 0;
        for(int i : a){
            sum = sum + i;
        }
        return sum;

    }

    /*
    定义方法，计算3个整数和

     */
   /* public static int getSum(int a ,int b, int c){
        return a+ b +c;
    }
    /*
    定义一个方法，计算2个整数和
     */
   /* public static int getSum(int a, int b){
        return a+b;
    }*/
}
