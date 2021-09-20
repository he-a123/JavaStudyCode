package day19_Hash.demo1;

import java.util.HashSet;

/*
HashSet集合自身特点：
底层数据结构，哈希表
存储取出都比较快
线程不安全，运行速度快
 */
public class HashSetDemo1 {
    public static void main(String[] args) {
        /*HashSet<String> set = new HashSet<String >();
        set.add(new String("abc"));
        set.add(new String("cba"));
        set.add(new String("def"));
        set.add(new String("ghi"));
        set.add(new String("bca"));
        set.add(new String("jkl"));
        System.out.println(set);
        System.out.println(new String("cba").hashCode());
        System.out.println(new String("bca").hashCode());
        System.out.println(new String("abc").hashCode());*/
        HashSet<Person> setPerson = new HashSet<Person>();
        setPerson.add(new Person("a",15));
        setPerson.add(new Person("b",14));
        setPerson.add(new Person("b",14));
        setPerson.add(new Person("c",13));
        setPerson.add(new Person("d",12));
        setPerson.add(new Person("e",11));
        System.out.println(setPerson);
    }
}
