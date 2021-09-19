package day01;

import java.util.Random;

public class Array {
    public static void main(String[] args) {
        arr();
    }

    private static void arr() {
        int [] ar = new int[6];
        int x = 0;
        while(x<6){
            int i = 0;
            while(i<6) {
                int r = new Random().nextInt(100);
                ar[i] = r;i++; x++;
            }
        }
        int max = ar[0];
        for (int j = 0; j < ar.length; j++) {
            if (ar[j]>max){
                max = ar[j];
            }
            System.out.print(" "+ar[j]+ " ");

        }
        System.out.println();
        System.out.println(max);

    }
}
