package day20_Map.demo;

import java.util.HashMap;
import java.util.Map;

/*
Map接口中的常用方法
    使用Map接口的实现类  HashMap
 */
public class MapDemo {
    public static void main(String[] args) {
        function_2();
    }
    /*
    移除集合中的键值对，返回被移除之前的值
    V remove(k)
     */
    public static void function_2(){
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("a",1);
        map.put("d",12);
        map.put("u",15);
        map.put("h",99999);
        System.out.println(map);
        Integer value = map.remove("h");
        System.out.println(value);
        System.out.println(map);
    }
    /*
    通过键对象获取值对象
    用V get（K）
    如果集合中没有这个键，返回null
     */
    public static void function_1(){
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("a",1);
        map.put("d",12);
        map.put("u",15);
        map.put("h",999999999+999999999);
        System.out.println(map);
        Integer i = map.get("h");
        System.out.println(i);
        Map<Integer,String> map1 = new HashMap<Integer,String >();
        map1.put(1,"a");
        map1.put(2,"b");
        map1.put(3,"egjjljhgsdhhjghfgdfsdfghhjffhgdfsdas");
        map1.put(4,"d");
        System.out.println(map1);
        String value = map1.get(3);
        System.out.println(value);
    }
    /*
    将键值对存储到集合中
    V put(k,v) k 作为键的对象，v 作为值的对象
    当存储的是重复的对象时，后边的重复对象会覆盖前边相同对
    象的值
    返回值一般情况下返回null，只有存储重复键的时候，将
    返回被覆盖之前的值，也就是i = 1
     */
    public static void function(){
        //创建对象，HashMap，存储对象，键是字符串，值是整数
        Map<String,Integer> map = new HashMap<String, Integer>();
        map.put("a",1);
        Integer i = map.put("a",5);
        System.out.println(i);//1
        map.put("b",2);
        Integer n = map.put("e",10);
        System.out.println(n);//null
        map.put("c",3);
        map.put("d",4);
        System.out.println(map);
    }
}
