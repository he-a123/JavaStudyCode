package day20_Map.demo2;

import java.util.LinkedHashMap;

/*
LinkedHashMap继承HashMap
保证迭代顺序
 */
public class LinkedHashMapDemo {
    public static void main(String[] args) {
        LinkedHashMap<String,String> link = new LinkedHashMap<String, String>();
        link.put("a","1");
        link.put("b","1");
        link.put("c","1");
        link.put("d","1");
        link.put("e","1");
        System.out.println(link);

    }
}
