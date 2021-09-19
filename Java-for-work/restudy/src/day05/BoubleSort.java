package day05;

import java.util.Arrays;
import java.util.Random;

public class BoubleSort {
    public static void main(String[] args) {
        int [] arr = new int[10];
        step01(arr);
       // step02(arr);
        step03(arr);

    }

    private static void step03(int[] arr) {
        System.out.print("{");
        for (int i = 0; i < arr.length; i++) {
            if(i==arr.length-1){
            System.out.print(arr[i]+"}");
        }else {
                System.out.print(arr[i]+",");
            }
        }
    }

    private static void step02(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i; j++) {
                if(arr[j]>arr[j+1]){
                    int num = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1] = num;
                }
            }
        }
    }

    private static void step01(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            int a = new  Random().nextInt(100);
            arr[i] = a;
        }
        Arrays.sort(arr);
    }
}
