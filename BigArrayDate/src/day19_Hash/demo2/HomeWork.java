package day19_Hash.demo2;

import java.util.ArrayList;
import java.util.List;

public class HomeWork {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("a");
        list.add("a");
        list.add("a");
        list.add("b");
        list.add("b");
        list.add("c");
        list.add("d");
        list.add("d");
        list.add("e");
        list.add("e");
        list.add("f");
        System.out.println(list);
        System.out.println(frequency(list,"a"));
        System.out.println(frequency(list,"b"));
        System.out.println(frequency(list,"c"));
        System.out.println(frequency(list,"d"));
        System.out.println(frequency(list,"e"));
        System.out.println(frequency(list,"f"));
    }
    private static String frequency(List<String>list, String str){
       int count = 0;
       for(String thisStr :list){
           if (thisStr.equals(str)){
               count++;
           }
       }
       String resultStr = str + "," + count;
       return resultStr;
    }
}
