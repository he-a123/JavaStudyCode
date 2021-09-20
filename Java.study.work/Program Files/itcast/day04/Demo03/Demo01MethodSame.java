package cn.itcast.day04.Demo03;
/*
题目要求：
定义一个方法，用来判断两个数是否相同。
 */
public class Demo01MethodSame {
    public static void main(String[] args) {
        System.out.println(isSame(10,20));
        System.out.println(isSame(30,30));
    }
    /*
    三要素：
    返回值类型：Boolean
    方法名称：isSame
    参数列表：int a ,int b
     */
    public static boolean isSame(int a,int b){
        /* boolean same;
         if(a==b){
         same = true;
    }else {
             same = false;
         }*/
        return a == b;
    }
    //same= a == b ? true : false;
   //boolean  same = a == b ;

}
