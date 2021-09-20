package day20_Map.demo3;
/*
JDK1.5新特性，静态导入
减少开发的代码量
标准写法，导入包的时候才能使用
 */
import java.util.Arrays;

import static java.lang.System.out;
import static java.util.Arrays.sort;
public class StaticImportDemo {
    public static void main(String[] args) {
        System.out.println("111111");
        out.println("111111");
        int[] arr = {1,2,1,6,5,3,4,9};
        Arrays.sort(arr);
        sort(arr);
        for (int i = 0; i < arr.length; i++) {
            out.print(arr[i]+"\t");
        }

    }
}
