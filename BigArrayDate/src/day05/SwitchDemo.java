package day05;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {
        System.out.println("请输入学生成绩：");
        Scanner sc = new Scanner(System.in);
        double num = sc.nextDouble();
       int a = 0;
        if(num >=90 && num <=100){
           a = 1;
            }else if(num>=80 && num < 90){
            a = 2;
        } else if(num >= 70 && num < 80){
            a = 3;
        }else if(num >= 60 && num < 70){
            a = 4;
        }else if (num <60&& num >=0){
            a = 5;
        }else{
            System.out.println("数据错误");
        }
        switch (a){
            case 1:
                System.out.println("考试成绩为： A");
                break;
            case 2:
                System.out.println("考试成绩为： B");
                break;
            case 3:
                System.out.println("考试成绩为： C");
                break;
            case 4:
                System.out.println("考试成绩为： D");
                break;
            case 5:
                System.out.println("考试成绩为：不及格");
                break;
            default:
                System.out.println("错误！");
        }
    }
}
