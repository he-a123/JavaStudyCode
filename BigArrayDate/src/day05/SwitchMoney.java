package day05;

import java.util.Scanner;

public class SwitchMoney {
    public static void main(String[] args) {
        /*1)根据工龄(整数)给员工涨工资(整数),工龄和基本工资通过键盘录入
        	(2)涨工资的条件如下：
        		[10-15)     +5000
       		    [5-10)      +2500
        		[3~5)       +1000
      		    [1~3)       +500
       		    [0~1)       +200
        	(3)如果用户输入的工龄为10，基本工资为3000，程序运行后打印格式"您目前工作了10年，基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元"*/
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您的工龄 ：");
        int i = sc.nextInt();
        int a = 0;
        if (i >= 10 && i <= 15){
           a = 1;
        }else if(i >= 5 && i < 10){
            a = 2;
        }else if(i >= 3 && i < 5){
            a = 3;
        }else if(i >= 1 && i < 3){
            a = 4;
        }else if(i > 0 && i < 1){
            a = 5;
        }
        else{
            System.out.println("输入错误");
        }
        switch (a){
            case 1:
                System.out.println("您目前工作了" + i +"年，基本工资为 3000元, 应涨工资 5000元,涨后工资 8000元");
                break;
            case 2:
                System.out.println("您目前工作了" + i +"年，基本工资为 3000元, 应涨工资 2500元,涨后工资 5500元");
                break;
            case 3:
                System.out.println("您目前工作了" + i + "年，基本工资为 3000元, 应涨工资 1000元,涨后工资 4000元");
                break;
            case 4:
                System.out.println("您目前工作了" + i + "年，基本工资为 3000元, 应涨工资 500元,涨后工资 3500元");
                break;
            case 5:
                System.out.println("您目前工作了" + i +"年，基本工资为 3000元, 应涨工资 200元,涨后工资 3200元");
                break;
        }

    }

}
