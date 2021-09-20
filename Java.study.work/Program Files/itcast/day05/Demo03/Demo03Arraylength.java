package cn.itcast.day05.Demo03;
/*
如何获取数组长度，格式
数组名称。length

这将会得到一个int数字，代表数组的长度

数组一旦被创建，程序远行期间，长度不可变。
 */
public class Demo03Arraylength {
    public static void main(String[] args) {
        int[] arrayA= new int[3];
        int[] arrayB = {1,2,3,6,5,4,9,8,7,11,22,33,22,55,44,66,88,85,75,12,31,6,45,};
        int len = arrayB.length;
        System.out.println("arrayB数组的长度是：" + len);
        System.out.println("===========================");

        int[] arrayC = new int[3];
        System.out.println(arrayC.length);
        arrayC = new int[5];
        System.out.println(arrayC.length);
    }
}
