package day20_Map.demo5;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * Map集合的嵌套，Map中存储的还是Map集合
 */
public class MapMapDemo {
    public static void main(String[] args) {
       function();

    }
    public static void function(){
        HashMap<String,String> javase = new HashMap<String, String>();
        HashMap<String,String> javaee = new HashMap<String, String>();
        javase.put("123","小明");
        javase.put("124","小李");
        javaee.put("223","憨憨");
        javaee.put("224","铁憨憨");
        HashMap<String,HashMap<String,String>> hash =
                new HashMap<String, HashMap<String, String>>();
        hash.put("基础班",javase);
        hash.put("就业班",javaee);
      //  keySet(hash);
        entrySet(hash);
        //System.out.println(hash);
    }
    public static void entrySet(HashMap<String,HashMap<String,String>> hash){
        //调用hash集合方法entrySet，将hash集合的键值关系对象
        //存储到set集合
        Set<Map.Entry<String,HashMap<String,String>>> classNameSet = hash.entrySet();
        Iterator<Map.Entry<String,HashMap<String,String >>> classNameIt = classNameSet.iterator();
        while(classNameIt.hasNext()){
            //classNameIt.next();方法，提取出的是hash集合的键值关系对象
            Map.Entry<String,HashMap<String,String>> classNameEntry = classNameIt.next();
            //classNameEntry方法getKey，getValue
            String classNameKey = classNameEntry.getKey();
            HashMap<String, String> classMap = classNameEntry.getValue();
            Set<Map.Entry<String,String>> studentSet = classMap.entrySet();
            Iterator<Map.Entry<String,String>> studentIt = studentSet.iterator();
            while(studentIt.hasNext()){
            Map.Entry<String,String> studentEntry = studentIt.next();
            String numKey = studentEntry.getKey();
            String nameValue = studentEntry.getValue();
                System.out.println(classNameKey + "="+ numKey + "=="+ nameValue);
            }
        }
    }

    /**
     * 利用keySet遍历
     * @param hash
     */
    public static void keySet(HashMap<String,HashMap<String,String>> hash){

        Set<String> calssNameSet = hash.keySet();
        Iterator<String> classNameIt= calssNameSet.iterator();
        while(classNameIt.hasNext()){
            String classNameKey = classNameIt.next();
            HashMap<String ,String> classMap= hash.get(classNameKey);
            Set<String> studentNum = classMap.keySet();
            Iterator<String> studengIt = studentNum.iterator();
            while(studengIt.hasNext()){
                String nameKey = studengIt.next();
                String nameValue = classMap.get(nameKey);
                System.out.println(classNameKey+"==="+nameKey+"--"+nameValue);
            }
        }
    }
}
