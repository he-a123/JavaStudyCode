package cn.itcast.day04.Demo03;
/*
题目要求
定义一个方法，用来打印指定次数的字符串
 */
public class Demo03MethodPrint {
    public static void main(String[] args) {
       printCount(5);
    }
    /*
    三要素
    返回值类型：只是一堆打印操作而已，没计算，也没结果要告诉调用处
    方法名称：printCount
    参数列表；到底打印多少次？必须告诉我，否则不知道多少次没法打印。次数：int
     */
    public static void printCount(int num) {
        for (int i = 0; i < num; i++) {
            System.out.println("回不去了" + (i + 1));

        }
    }


}
