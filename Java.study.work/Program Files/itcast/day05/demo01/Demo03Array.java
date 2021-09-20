package cn.itcast.day05.demo01;
/*
使用静态初始化数组的时候，格式还可以省略一下。
标准格式：
 数据类型【】 数组名称 = new 数据类型【】 {元素1..........元素n}

省略格式：
 数据类型【】 数组名称 ={元素1..........元素n}

 注意事项：
 1、静态初始化没有直接指定长度，但仍然会自动推算长度
 2、静态初始化标准格式可以拆分成为两个步骤。
3、动态初始化也可以拆分成为两个步骤。
4、静态初始化一旦使用省略格式，就不能拆分成为两个步骤了

使用建议
如果不确定数组当中的具体内容，就是用动态初始化；
 否则，已经确定了具体内容，用静态初始化
 */
public class Demo03Array {
    public static void main(String[] args) {
        int[] arrayA = {10,20,30};
        //静态初始化标准格式可以拆分成为两个步骤。
        int[] arrayB;
        arrayB = new int []{11,21,31};
        //动态初始化也可以拆分成为两个步骤
        int[] arrayC;
        arrayC = new int [5];
        /*静态初始化的省略格式，不能拆分成为两个步骤
        int arrayD ;
        arrayD = {11,21,31};*/
    }
}
