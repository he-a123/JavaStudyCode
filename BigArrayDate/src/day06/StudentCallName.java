package day06;

import java.util.ArrayList;
import java.util.Random;

public class StudentCallName {


    public static void main(String[] args) {
        ArrayList<StudentName> array = new ArrayList<StudentName>();
        NameAge(array);
        PrintStudentName(array);
        randomStudentName(array);
    }
    public static void NameAge(ArrayList<StudentName>array){
      StudentName stu1 = new StudentName();
      StudentName stu2 = new StudentName();
      StudentName stu3 = new StudentName();
      StudentName stu4 = new StudentName();
      StudentName stu5 = new StudentName();
      StudentName stu6 = new StudentName();
        StudentName stu7 = new StudentName();
        StudentName stu8 = new StudentName();
        StudentName stu9 = new StudentName();
        StudentName stu10 = new StudentName();
        StudentName stu11 = new StudentName();
        StudentName stu12 = new StudentName();
        StudentName stu13 = new StudentName();
        StudentName stu14 = new StudentName();
        StudentName stu15 = new StudentName();
        StudentName stu16 = new StudentName();
        StudentName stu17 = new StudentName();
        StudentName stu18 = new StudentName();
        StudentName stu19 = new StudentName();
        StudentName stu20 = new StudentName();
        StudentName stu21 = new StudentName();
        StudentName stu22 = new StudentName();
        StudentName stu23 = new StudentName();
        StudentName stu24 = new StudentName();
        stu1.name = "寒冰射手";
        stu1.age = 18;
        stu2.name = "麦林炮手";
        stu2.age = 15;
        stu3.name = "小提莫";
        stu3.age = 5;
        stu4.name = "凯南";
        stu4.age = 16;
        stu5.name = "阿木木";
        stu5 .age = 1000;
        stu6.name = "小猫咪";
        stu6.age = 18;
        stu7.name = "诺克萨斯之手";
        stu7.age = 28;

        array.add(stu1);
        array.add(stu2);
        array.add(stu3);
        array.add(stu4);
        array.add(stu5);
        array.add(stu6);
        /*array.add(stu7);
        array.add(stu8);
        array.add(stu9);
        array.add(stu10);
        array.add(stu1);
        array.add(stu1);*/
        }
        public  static void PrintStudentName(ArrayList<StudentName>array){

            for (int i = 0; i <array.size();i ++){

                System.out.println("姓名：" + array.get(i).name+ "  "+ "年龄：" + array.get(i).age );
            }
            }
            public static void randomStudentName(ArrayList<StudentName>array) {
                Random ran = new Random();
                int a = ran.nextInt(array.size());
                System.out.println("被点名的英雄是："+ "姓名：" +array.get(a).name + "  " + "年龄：" +array.get(a).age);
    }



        }

