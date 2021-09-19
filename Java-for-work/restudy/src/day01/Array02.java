package day01;

import java.util.Random;
import java.util.Scanner;

public class Array02 {
    public static void main(String[] args) {
        Example();
        //System.out.println(ran());
       //arr();
    }
    private static  void Example(){
        int[][] i = arr();
        int sum = 0;
        for (int q = 0; q < i.length; q++) {
            System.out.print("[");
            for (int j = 0; j < i[q].length; j++) {
                sum += i[q][j];
               System.out.print(i[q][j]+",");
               if(i[q].length !=0 && j==i[q].length-1){
                   System.out.println(i[q][j]+"]");
               }else if(i[q].length==0){
                   System.out.println("]");
               }
            }           // System.out.println("]");

        }

        System.out.println(sum);
    }

    private  static int[][] arr() {
        int [][] f =new int[5][];
        for (int k = 0; k < f.length; k++) {
            //System.out.println("请输入数组长度：");
            int x = new Random().nextInt(50);
            int[] j = new int[x];
            for (int q = 0; q < j.length; q++) {
               j[q]=ran();
              // System.out.print(j[q]+",");
            }
            f[k]=j;
         // System.out.println();
    }


        return f;
    }
    private static int ran(){
        int r = new Random().nextInt(100);
        return r;
    }
}
