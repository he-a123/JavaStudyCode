package day19_Hash.demo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HashSetDemo {
  /*
  set接口特点：
  不允许存储相同元素
  没有索引
  Set接口的实现类，HashSet（哈希表）
  特点：无序集合，存储和取出顺序不同，没有索引，不存储重复元素
  代码编写上和ArrayList完全一致
   */
  public static void main(String[] args) {
    Set<String> set = new HashSet<String>();
    set.add("asd");
    set.add("awd");
    set.add("awd");
    set.add("ard");
    Iterator<String> it = set.iterator();
    while (it.hasNext()){
      System.out.println(it.next());
    }
    System.out.println("============");
    for(String s : set){
      System.out.println(s);
    }
  }

}
