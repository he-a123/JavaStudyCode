package day18_Iterator.Iterator;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

public class IteratorDemo {
    public static void main(String[] args){
        funcation_2();
    }
    public static void funcation_2(){
        Collection<String> coll = new ArrayList<String>();
        coll.add("a");
        coll.add("bbfb");
        coll.add("cc");
        coll.add("ddd");
        coll.add("eee322");
        //coll.add(2);
        Iterator<String> it = coll.iterator();
        String[] str = new String[10];
        while (it.hasNext()){
            System.out.println(it.next());
        }

    }
    public static void funcation_1(){

        List list = new ArrayList();
        list.add("asd");
        list.add("ser");
        list.add("fgh");
        list.add(3);
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String str = (String) it.next();

           // System.out.println((String) it.next() + "\t");
           // System.out.println(str);
            System.out.println(str.length());
        }

    }

    public static void funcation(){
        Collection<String> coll= new ArrayList<String>();
        coll.add("aaa");
        coll.add("aaa20");
        coll.add("aa2a");
        coll.add("aa3a");
        coll.add("aa5a");
        coll.add("aaa8");
       // System.out.println(coll);
        //Iterator迭代器写法
        Iterator<String> it = coll.iterator();
       /* for(;it.hasNext();){
            System.out.print(it.next()+"\t");
        }*/
       //增强for循环遍历集合，公式
        //for(数据类型   变量名  ： 集合){
        //  System.out.println(变量名);
        // }
       for(String s :coll ){
           System.out.println(s.hashCode());
       }
       /* while(it.hasNext()){
            System.out.println(it.next());*/
        }
        /*if(it.hasNext()){
            System.out.println(it.next());
        }*/
    }

