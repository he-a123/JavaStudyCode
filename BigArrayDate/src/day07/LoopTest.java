package day07;

import org.w3c.dom.ls.LSOutput;

public class LoopTest {//求奇数和
    /*
    1.1	编写程序求 1+3+5+7+……+99 的和值。
题目分析：
通过观察发现，本题目要实现的奇数（范围1-100之间）的累加和。
1.	为了记录累加和的值，我们需要定义一个存储累加和的变量
2.	我们要获取到1-100范围内的数
3.	判断当前数是否为奇数，是奇数，完成累加和操作
4.	累加完毕后，最终显示下累加和的值
解题步骤：
1.	定义一个用来记录累加和的变量
2.	使用for循环语句，完成1-100之间每个数的获取
3.	使用if条件语句，判断当前数是否是奇数，是奇数，进行累加和操作
4.	使用输出语句，打印累加和变量的值

     */
   /* public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 100; i++) {
            if(i % 2 == 1){
                sum += i;

            }
        }
        System.out.println(sum);
    }*/
   public static void main(String[] args) {
       int sum = 0;
       for (int i = 1; i <= 100; i+=2) {
           sum += i;
       }
       System.out.println(sum);
   }

}
