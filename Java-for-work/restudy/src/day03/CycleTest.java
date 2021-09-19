package day03;

import java.util.Random;
import java.util.Scanner;

public class CycleTest {
    public static void main(String[] args) {
        //Test1();
       // Test2();
        //Test3();
        //Test4();
        //Test5();
        //Test6();
        // Test7();
        //Test8();
       // Test9();
        Test10();
    }
//数组中的元素查找---折半查找
    private static int Test10() {
        int [] arr =new int[20];
        for (int j = 0; j < arr.length; j++) {
            int i = new Random().nextInt(100);
            arr[j] = i;
            System.out.print(arr[j]+"\t");
        }
        System.out.println();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int num = arr[i];
                    arr[i]= arr[j];
                    arr[j]=num;
                }

            }
            //System.out.print(arr[i]+"\t");
        }
        int num = new Random().nextInt(100);
        int min = 0;
        int max = arr.length-1;
        int mid = 0;
        while (min<max){
        mid = (min+max)/2;
        if(arr[mid]>num){
            max=mid-1;
        }else if(arr[mid]<num){
            min = mid +1;
        }else {
            System.out.println(mid +"  "+num);
            return mid;
        }
        }
        return -1;
    }

    //数组中数据普通查找
    private static void Test9() {
        int [] arr =new int[20];
        for (int j = 0; j < arr.length; j++) {
            int i = new Random().nextInt(100);
            arr[j] = i;
            System.out.print(arr[j]+"\t");
        }
        System.out.println();
        int a =20; //new Random().nextInt(100);
        for (int i = 0; i < arr.length; i++) {
            if(a==arr[i]){
                System.out.println(i+"  "+a);
            }
        }
        System.out.println(-1);
    }

    //冒泡排序
    private static void Test8() {
        int [] arr =new int[20];
        for (int j = 0; j < arr.length; j++) {
            int i = new Random().nextInt(100);
            arr[j] = i;
            System.out.print(arr[j]+"\t");
        }
        System.out.println();
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length - 1 - i; j++) {
                if (arr[j] > arr[j+1]) {
                    int num = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = num;
                }
            }
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }

    //数组排序
    private static void Test7() {
        int [] arr =new int[20];
        for (int j = 0; j < arr.length; j++) {
            int i = new Random().nextInt(100);
            arr[j] = i;
            System.out.print(arr[j]+"\t");
        }
        System.out.println();
        /*for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int num = arr[i];
                    arr[i]= arr[j];
                    arr[j]=num;
                }

            }
            //System.out.print(arr[i]+"\t");
        }*/
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if(arr[i]< arr[j]){
                    int num = arr[i];
                    arr[i]= arr[j];
                    arr[j]=num;
                }

            }
            //System.out.print(arr[i]+"\t");
        }
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+"\t");
        }
    }
//数组逆序
    private static void Test6() {
       // int a = new Random().nextInt(20);
        int [] arr =new int[10];
        for (int j = 0; j < arr.length; j++) {
            int i = new Random().nextInt(100);
            arr[j] = i;
            System.out.print(arr[j]+"\t");
        }
        System.out.println();
        int num;
        for (int i = 0,  j= arr.length-1;i < j; i++,j--) {
                num=arr[i];
                arr[i]=arr[j];
                arr[j]=num;
           /* num=arr[i];
            arr[i]=arr[arr.length-i-1];
            arr[arr.length-i-1]=num;*/


        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - 1) {
                System.out.print(arr[i] + ",");
            } else {
                System.out.print(arr[i] + "]");
            }

        }
    }

//定义数组打印格式
    private static void Test5() {
        int a = new Random().nextInt(20);
        int [] arr =new int[a];
        System.out.print("[");
        for (int j = 0; j < arr.length; j++) {
            int i = new Random().nextInt(100);
                    arr[j]=i;
                    if(j<arr.length-1){
            System.out.print(arr[j]+",");
                    }else{
                        System.out.print(arr[j]+"]");
                    }
        }
    }
//打印99乘法表
    private static void Test4() {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j+ "x"+ i+ "=" + i*j+
                        "\t");
            }
            System.out.println();
        }

    }
//打印大小写字母表
    private static void Test3() {
        char A = 'A';
        char a = 'a';
        for (int i = 0; i < 26; i++) {
            System.out.print(A+"\t");
            System.out.print(a+"\t");
            A++;
            a++;
        }
    }
//求水仙花数
    private static void Test2() {
        for (int i = 100; i < 1000; i++) {
           if(i==(i%10)*(i%10)*(i%10)+(i/10%10)*(i/10%10)*(i/10%10)+
                   (i/100%10)*(i/100%10)*(i/100%10)) {
               System.out.print(i+"\t");
           }
        }
    }
//求奇数和
    private static void Test1() {
        int sum = 0;
        for (int i = 0; i < 100; i++) {
            if (i%2 != 0){
                sum +=i;
                System.out.print(i+"\t");
            }

        }
        System.out.println();
        System.out.println(sum);
    }
}
