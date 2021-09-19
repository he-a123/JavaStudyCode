package day01;

import java.util.Scanner;

public class XinQi {
    public static void main(String[] args) {

        while(true){
            System.out.print("请输入星期：");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        Switch(i);
        continue;
        }

    }
    private static void Switch(int i){
        if( i<=0 | i>7){
            System.out.println("输入有误，请重新输入！");}


        switch (i) {
            case 1:
                System.out.println("星期一");
                break;
            case 2:
                System.out.println("星期二");
                break;
            case 3:
                System.out.println("星期三");
                break;
            case 4:
                System.out.println("星期四");
                break;
            case 5:
                System.out.println("星期五");
                break;
            case 6:
                System.out.println("星期六");
                break;
            case 7:
                System.out.println("星期日");
                break;
            default:
                System.out.println("输入有误！"
                );
                break;
        }
    }
}
