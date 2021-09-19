package day02;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class SuiJiDM {
    public static void main(String[] args) {

        ArrayList<Student> arr = new ArrayList<>();
        Student su1 = new Student();
        Student su2 = new Student();
        Student su3 = new Student();
        su1.name = "张三";
        su2.name = "李四";
        su3.name = "王麻子";
        su1.age = 18;
        su2.age = 17;
        su3.age = 19;
        arr.add(su1);
        arr.add(su2);
        arr.add(su3);
        while(true){
           int a = PrintDemo();
           switch (a){
               case 0:
                   STNameList(arr);
                    break;
               case 1:
                randomStudent(arr);
                   break;
               case 2:
                   AddStudent(arr);
                   break;
               default:
                   System.out.println("正在退出系统......");
                   return;



        }
       }
    }
    private static void AddStudent(ArrayList<Student> arr ) {

        System.out.println("请输入学生序号：");
        int a = new Scanner(System.in).nextInt();
        System.out.println("请输入学生姓名：");
        String b = new Scanner(System.in).next();
        System.out.println("请输入学生年龄：");
        int c = new Scanner(System.in).nextInt();
        Student su = new Student();
        su.name = b;
        su.age = c;
        ArrayList<Student> arr1 = new ArrayList<>();
        arr1.add(su);
        STNameList(arr);
        System.out.println("增加的学生为：");
        for (int i = 0; i < arr1.size(); i++) {
            System.out.println(arr1.get(i).name+"  "+arr1.get(i).age);

        }
    }

    private static void STNameList(ArrayList<Student> arr) {
        System.out.println("------学生名单----");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).name+"   "+arr.get(i).age);
        }
    }

    private static int PrintDemo() {
        System.out.println(
                "---------学生名单查询与点名系统------------");
        System.out.println("0.学生名单");
        System.out.println("1.点名系统");
        System.out.println("2.增加学生");
        System.out.println("3.删除学生");
        System.out.println("4.修改学生名单");
        System.out.println("5.退出系统");
        System.out.println(
                "------------------------------------------");
        System.out.print("请输入需要操作项目序号：");
        int a = new Scanner(System.in).nextInt();
        return a;
    }

    private static void randomStudent(ArrayList<Student> arr ) {
        System.out.println("---------抽到的同学-------");
        int i = new Random().nextInt(arr.size());
        System.out.println(arr.get(i).name+"  "+arr.get(i).age);

    }
}
