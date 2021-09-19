package day04;

import java.util.ArrayList;
import java.util.Random;

public class SuiJiDianM {
    public static void main(String[] args) {
        ArrayList<Student> list = new ArrayList<>();
        addStudent(list);
        printStudent(list);
        randomStudent(list);
    }

    private static void randomStudent(ArrayList<Student> list) {
        //for (int i = 0; i < list.size(); i++) {
            int num = new Random().nextInt(list.size()-1);
            System.out.print("被点到的同学是：");
            System.out.println(list.get(num).getName()+" " +
                    "   "+list.get(num).getAge());
        //}
    }

    private static void printStudent(ArrayList<Student> list) {
        System.out.println("===========学生信息表==========");
        System.out.println("姓名"+"     " +"年龄");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName()+"   " +
                    " "+list.get(i).getAge());
        }

    }

    private static void addStudent(ArrayList<Student> list) {
        Student s = new Student();
        s.setName("张三");
        s.setAge(20);
      //  System.out.println("========");
        Student s1 = new Student();
        s1.setName("李四");
        s1.setAge(22);
        Student s2 = new Student();
        s2.setName("王麻子");
        s2.setAge(23);
        //System.out.println("==========");
        Student s3 = new Student();
        s3.setName("王五");
        s3.setAge(24);
        Student s4 = new Student();
        s4.setName("赵六");
        s4.setAge(25);
        list.add(s);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);

    }
}
