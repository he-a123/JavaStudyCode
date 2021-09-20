package day20_Map.demo1;

import java.util.HashMap;
import java.util.Map;

/*
使用HashMap集合存储自定义的对象
自定义对象，可以作为键出现，也可以作为值出现
 */
public class HashMapDemo {
    public static void main(String[] args) {
        funcation_1();
    }
    /*
    HashMap  存储自定义对象Person，Person作为键出现
    键的对象是Person类型，值是字符串
    保证键的唯一性，存储到键的对象，重写hashCold和equals
     */
    public  static void funcation_1(){
        Map<Person,String> map = new HashMap<Person,String>();
        map.put(new Person(20,"小炮"),"班德尔城");
        map.put(new Person(30,"德莱厄斯"),"诺克萨斯");
        map.put(new Person(30,"德莱厄斯"),"诺克萨斯");
        map.put(new Person(40,"盖伦"),"德玛西亚");
        map.put(new Person(50,"德莱文"),"诺克萨斯");
        map.put(new Person(30,"光辉女郎"),"德玛西亚");
        map.put(new Person(80,"寒冰射手"),"艾欧尼亚");
        for(Person key : map.keySet()){
            String value = map.get(key);
            System.out.println(key+ value);
        }
        System.out.println("=================");
        for(Map.Entry<Person,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+entry.getValue());
        }
    }
    /*
    HashMap  存储自定义对象Person，作为值出现
     */
    public static void function(){
        HashMap<String,Person> map = new HashMap<String ,Person>();
        map.put("北京",new Person(20,"小王"));
        map.put("上海",new Person(21,"小李"));
        map.put("天津",new Person(22,"小张"));
        map.put("兰州",new Person(23,"小马"));
        map.put("重庆",new Person(24,"小刘"));
        for(String key :map.keySet()){
            Person value = map.get(key);
            System.out.println(key+ value);
        }
        System.out.println("=============");
        for(Map.Entry<String,Person> entry: map.entrySet()){
            String key = entry.getKey();
            Person value = entry.getValue();
            System.out.println(key+value);
        }
    }
}
