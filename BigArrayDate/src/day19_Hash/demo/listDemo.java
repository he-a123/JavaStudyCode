package day19_Hash.demo;

import java.util.ArrayList;
import java.util.List;

/*
list接口派系，继承Collection接口
下面有很多实现类
List接口特点：有序，索引，可以重复元素
实现类；ArrayList，LinkedList

List接口中的抽象方法，有一部分方法和他父类接口collection是一样的
List接口的特有方法，带索引的功能
 */
public class listDemo {
    public static void main(String[] args) {
        function_2();
    }
    /*
    set(int index,E);
    修改指定索引上的元素
    返回修改之前的元素
     */
    public static  void function_2(){
        List<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.println(list);
        int i = list.set(3,10);
        System.out.println(i);
        System.out.println(list);

    }
    /*
    remove(int index );
    移除指定索引上的元素。
     */
    public static void function_1() {
        List<Double> list = new ArrayList<Double>();
        list.add(1.2);
        list.add(1.3);
        list.add(1.4);
        list.add(1.5);
        list.add(1.6);
        System.out.println(list);
        //list.remove(3);
        Double d = list.remove(3);
        System.out.println(d);
        System.out.println(list);
    }

    /*
    add(int index,E)
    将元素插入到指定索引上
     */
    public static void function(){
        List<String> list = new ArrayList<String>();
        list.add("aaa");
        list.add("aa5a");
        list.add("aaa2");
        list.add("aaa0");
        list.add("aaa3");
        System.out.println(list);
        list.add(5,"bbb");
        System.out.println(list);
    }
}
