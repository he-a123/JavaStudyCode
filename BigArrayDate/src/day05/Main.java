package day05;

import java.util.Scanner;
class Newname{
    public static void main(String[] args)
    {
        System.out.println("请输入想要求和的两个数字： ");
        Scanner sc =  new  Scanner(System.in);
        Scanner sc1 =  new Scanner(System.in);
        int i = sc.nextInt();
        int j = sc1.nextInt();
       /*int num =*/ Addnumber(i,j);
        System.out.println("输入的两个数的和是：" + Addnumber(i,j));

    }
   public static int Addnumber(int i, int j){
        return i + j;
    }
}