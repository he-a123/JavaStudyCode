package day19_Hash.demo1;

import java.util.LinkedHashSet;

/*
LinkedHashSet 基于链表的哈希值实现
继承自HashSet
LinkedHashSet 自身特性，具有顺序，存储和取出的顺序相同
线程不安全的集合，运行速度快
 */
public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> link = new LinkedHashSet<Integer>();
        link.add(321);
        link.add(321);
        link.add(123);
        link.add(241);
        link.add(251);
        link.add(261);
        System.out.println(link);
    }
}
