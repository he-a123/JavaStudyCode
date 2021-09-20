package cn.itcast.day05.Demo03;

import javax.naming.PartialResultException;

/*
1、数组元素反转，其实就是对称位置的元素交换。
2、通常遍历数组用的是一个索引：
int i = 0；
现在表示对称位置需要两个索引：
int min = 0；
int max = array。length-1；
3、如何交换两个变量的值?
int a = 10;
int b = 20;
如果是两个水杯，都是满的，如何交换？借助第三个空杯子。
int temp = a；
a = b；
b = temp；
用第三个变量倒手
什么时候停止交换
（1）min==max
（2）min>max
什么时候停止交换？
min<max
 */
public class Demo07ArrayReverse {
    public static void main(String[] args) {
       int[] array = {12,30,63,25,91,20,13,20};
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("----------------------");
        /*
        初始化语句：int min= 0，max= arraylength-1
        条件判断句：min<max
        步进表达式：min++，min--
        循环体：用第三个变量倒手
         */
        for(int min = 0, max = array.length-1;min<max;min++,max--){
           int temp = array[min];
           array[min]=array[max];
           array[max]=temp;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("----------------------");
    }
}
