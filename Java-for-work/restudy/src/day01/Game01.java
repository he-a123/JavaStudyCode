package day01;

import java.util.Random;
import java.util.Scanner;

public class Game01 {
    public static void main(String[] args) {
        while (true) {
            int r = new Random().nextInt(5);
            System.out.println("随机数已生成");
            System.out.print("请输入您要猜的数字：");
            Scanner s = new Scanner(System.in);
            int elementnum = s.nextInt();
            if (elementnum == r) {
                System.out.println("猜对了");
                break;
            }
            while (elementnum != r) {


                if (elementnum > r){
                    System.out.println("猜大了");
                    break;
                }else if (elementnum < r){
                    System.out.println("猜小了");
                    break;
                }
            }

            }

        }
    }





