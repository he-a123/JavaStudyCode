package cn.itcast.day05.Demo03;

import org.w3c.dom.ls.LSOutput;

public class Demo05Arraymax {
    public static void main(String[] args) {
        int[] array = {10, 15, 61, 30, 700, 900, 6000};

        int max = array[0];//搭建大小比较场景
        for (int i = 0; i < array.length; i++) {
            //如果当前元素，比max更大，则换人
            if (array[i] > max) {
                max = array[i];
            }


        }
        System.out.println("最大值:" + max);
    }


}
