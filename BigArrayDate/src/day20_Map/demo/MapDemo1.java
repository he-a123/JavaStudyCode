package day20_Map.demo;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*
Map集合遍历
        利用键获取值
        Map接口中定义方法KeySet
        所有的键存储到Set集合
 */
public class MapDemo1 {
    public static void main(String[] args) {
        function_1();
    }
/*1、调用map集合方法KeySet，所有的键存储到Set中
   2、遍历Set集合，获取出Set集合中的所有元素（Map中的键）
   3、调用Map集合方法get，通过键获取到值

 */
/*
增强for
 */
public static void function_1(){
    Map<String,Integer> map = new HashMap<String, Integer>();
    map.put("a",10);
    map.put("b",20);
    map.put("c",30);
    map.put("d",40);
    map.put("e",50);
    for(String key:map.keySet()){
        Integer value = map.get(key);
        System.out.println(key+"="+value);
    }
}
/*
迭代器
 */
public static void function(){
    Map<String,Integer> map = new HashMap<String, Integer>();
    map.put("a",10);
    map.put("b",20);
    map.put("c",30);
    map.put("d",40);
    map.put("e",50);
    Set<String> set =map.keySet();
    System.out.println(set.getClass());
    Iterator<String> it= set.iterator();
    while (it.hasNext()){
        String key = it.next();
        Integer value = map.get(key);
        System.out.println(key+ "...."+ value);
    }
}
}

