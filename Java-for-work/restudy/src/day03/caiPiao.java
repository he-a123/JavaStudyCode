package day03;

import java.util.ArrayList;
import java.util.Random;

public class caiPiao {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        stepOne(list);
        PaiXu(list);
        stepTwo(list);
        stepThree(list);

    }

    private static void PaiXu(ArrayList<Integer> list) {
        int num = 0;
        for (int i = 0; i < list.size(); i++) {
            for (int j = 0; j < list.size(); j++) {
                if(list.get(i)<list.get(j)){
                    num=list.get(i);
                    list.set(i,list.get(j));
                    list.set(j,num);
                }
            }
        }
    }

    private static void stepThree(ArrayList<Integer> list) {
        System.out.print("中奖号码为：");

        System.out.print("{");
        for (int i = 0; i < list.size(); i++) {
            if(i== list.size()-1){
                System.out.print(list.get(i)+"}");
            }else {
                System.out.print(list.get(i)+",");
            }
        }
    }

    private static void stepTwo(ArrayList<Integer> list) {
        for (int i = 0; i < list.size()-1; i++) {
            for (int j = i+1; j < list.size(); j++) {
                while (list.get(i)==list.get(j)){
                    /*int a = new Random().nextInt(33);*/
                   /* if(a>0){
                    //list.remove(j);*/
                   if (list.get(j)<33) {
                       list.set(j, list.get(j) + 1);
                   }else {
                       list.set(j,list.get(j)-1);
                   }
                   /*}else {
                       int b = new Random().nextInt(34);
                       list.set(i,b);
                    }*/
                }
            }
        }
    }

    private static void stepOne(ArrayList<Integer> list) {
        while (list.size() < 7) {
            int a = new Random().nextInt(34);
            if(a>0 ){
            list.add(a);
        }
        }
    }
}
