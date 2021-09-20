package cn.itcast.day05.Demo03;
/*
所有的引用型变量，都可以赋值为一个null值，但其中代表什么值都没有。

数组必须进行new初始化才能使用其中的元素。
如果只是赋值了一个null，没有进行new创建
那么将会发生
空指针异常NullPointerException

原因：忘了 new
解决：补上 new
 */
public class Demo02ArrarNull {
    public static void main(String[] args) {
        int [] array = null;
      //  array = new int[3];
        System.out.println(array[0]);

    }
}
