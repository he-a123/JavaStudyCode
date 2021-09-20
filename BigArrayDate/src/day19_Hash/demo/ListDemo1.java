package day19_Hash.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/*
迭代器的并发修改异常java.util.ArrayList$Itr.checkForComodification
就是在遍历的过程中，使用了集合的方法修改了集合的长度，这是不允许的
 */
public class ListDemo1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<String>();
        List<Integer> li = new LinkedList<Integer>();
        list.add("aaa");
        list.add("aaa1");
        list.add("aaa2");
        list.add("aaa3");
        list.add("aaa4");
        //对集合使用迭代器进行获取，获取时判断集合中是否存在“abc3”对象
        //如果有，添加一个元素“ABC3”
        Iterator<String> it = list.iterator();
        while(it.hasNext()){
            String s = it.next();
            if(s.equals("aaa3") ){
                list.add("ABC3");
            }
            System.out.println(s);
        }
    }
}
