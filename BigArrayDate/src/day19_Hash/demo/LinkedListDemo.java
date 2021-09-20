package day19_Hash.demo;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        /*
        LinkedList 链表集合特有功能
         自身特点：链表底层实现，查询慢，增删快

         子类特有功能，不能多态调用
         */
        //function();
        function_3();

    }
    /*
    E removeFirst()  移除并返回集合开头
    E removeLast()  移除并返回集合结尾
     */
    public static  void  function_3(){
        LinkedList<String> link = new LinkedList<String>();
        link.add("abc");
        link.add("abc1");
        link.add("abc2");
        link.add("abc3");
        System.out.println(link);
        String first=link.removeFirst();
        String last = link.removeLast();
        System.out.println(first);
        System.out.println(last);
        System.out.println(link);
    }
 /*
    E getFirst() 获取开头
    E getLast（） 获取结尾
  */
public static  void  function_2(){
    LinkedList<String> link = new LinkedList<String>();
    link.add("abc");
    link.add("abc1");
    link.add("abc2");
    link.add("abc3");
    // link.clear();
    System.out.println(link);
    if(!link.isEmpty()){
    //if(link.size()!=0) {
        System.out.println(link.getFirst());
        System.out.println(link.getLast());
    }
}


/*
addFirst(E)添加链表开头
addLast(E)添加链表结尾
 */

public static void function_1(){
    LinkedList<String> link = new LinkedList<String>();
    link.addLast("a");
    link.addLast("b");
    link.addLast("c");
    link.addLast("d");
    link.addLast("e");
    System.out.println(link);
    link.addFirst("1");
    link.addFirst("2");
    link.addFirst("3");
    System.out.println(link);
}
public static void function(){
    LinkedList<String> link = new LinkedList<String>();
    link.add("abc");
    link.add("abc1");
    link.add("abc2");
    link.add("abc3");
    System.out.println(link);
    link.addFirst("321");
    link.addLast("331");
    System.out.println(link);
}
}
