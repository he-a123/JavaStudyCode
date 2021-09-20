package day19_Hash.demo2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HomeWork2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        list.add("k");
        list.add("b");
        list.add("c");
        list.add("a");
        list.add("e");
        list.add("f");
        list.add("m"); System.out.println(list);
        sort(list);
        System.out.println(list);

    }
    private static void sort(List<String>list){
        StringBuilder s = new StringBuilder();
        for(String thisStr : list){
            s.append(thisStr);
        }
        //System.out.println(s.toString());
        char[] charArray = s.toString().toCharArray();
        Collections.sort(list);

    }
}
