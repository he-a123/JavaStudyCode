package Arrlist_demo;

import java.util.*;

public class TestDemo {
    public static void main(String[] args) {
        //arrayTest();
        //listTest();
        //setTest();
       // mapTest();
        genericTest();
    }

    private static void genericTest() {
        ArrayList<Tiger> arr = new ArrayList<>();
        arr.add(new Tiger("东北虎"));
        arr.add(new Tiger("华南虎"));
        arr.add(new Tiger("孟加拉虎"));
        System.out.println(arr);
        Iterator<Tiger> it = arr.iterator();
        while(it.hasNext()){
            Tiger next = it.next();
            next.eat();
        }
    }

    static class Sheep{
        String name;
        public void  eat(){
            System.out.println(this.name + "吃草");
        }
        @Override
        public String toString() {
            return "Sheep@name" + this.name ;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public Sheep() {
        }

        public Sheep(String name) {
            this.name = name;
        }
    }
    static class Tiger{
        String name;

        public Tiger() {
        }

        public Tiger(String name) {
            this.name = name;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        @Override
        public String toString() {
            return "Tiger@name" + this.name;
        }
        public void eat(){
            System.out.println(this.name + "吃羊");
        }
    }
    /*
                集合遍历Map
         */
    private static void mapTest() {
        Map<String,String> map = new HashMap<>();
        map.put("qqf","aa");
        map.put("qqe","aaaa");
        map.put("qqd","a");
        map.put("qqa","daaa");
        //增强for遍历(entry集合)
        for (Map.Entry<String, String> entry :
                map.entrySet()) {
            System.out.println(entry);

        }
        System.out.println("--------------");
        //增强for循环（key集合）
        for (String key : map.keySet()) {
            System.out.println(key + " = " + map.get(key));
        }
        System.out.println("---------------");
        //通过遍历值遍历集合
        //Set<String> str = new HashSet<>();
        for (String value : map.values()) {
           // str.add(value);
            System.out.println(value);
        }

    }


    /*
            集合遍历set
     */

    private static void setTest() {
        Set<String> set = new HashSet<>();
        set.add("qa");
        set.add("qw");
        set.add("qe");
        set.add("qd");
        //增强for遍历
        for (String s : set) {
        System.out.println(s);
        }
        //迭代器遍历iterator

        for(Iterator<String> it = set.iterator();it.hasNext();){
            System.out.println(it.next());

        }
    }

    /*
            集合遍历List
     */
    private static void listTest() {
        List<String> list = new ArrayList<>();
        list.add("11");
        list.add("15");
        list.add("13");
        list.add("14");
        //增强for遍历集合
        for (String s : list) {
            System.out.println(s);
        }
        //下标遍历集合
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }


    }

    /*
            数组的遍历
     */
    private static void arrayTest() {
        String[] arr = {"xx","yy","zz"};
        //增强for遍历
        for (String s : arr) {
            System.out.println(s);
        }
        //下标遍历
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
