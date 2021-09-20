package day20_Map.demo2;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.Map;

/*
Map接口实现类Hashtable
底层数据结果哈希表，特点和HashMap是一样的
Hashtable 线程安全集合，运行速度慢
HashMap   线程不全集合，运行速度快
Hash table命运和Vector是一样的，从JDK 1.2 开始，被更先进的HashMap取代
 HashMap 允许存储null值，null键
 Hashtable 不允许存储null值，null键

 虽然Hashtable已经被淘汰，但他的子类Properties，依然很好用，可以结合io流实现
 数据的永久储存
 */
public class HashTableDemo {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap<String,String>();
        map.put(null,null);
        System.out.println(map);
        Map<String,String> map1 = new Hashtable<String, String>();
        map1.put(null,null);
        System.out.println(map1);
    }
}
