package day18_Iterator;

import java.util.ArrayList;



public class ArrayListDemo {

    

    public static void main(String[] args) {
        ArrayListPer();
    }
    public static void ArrayListPer(){
      ArrayList<Person> array = new ArrayList<Person>();
      array.add(new Person("张三",18));
        array.add(new Person("里斯",20));
        array.add(new Person("里斯",20));
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i));
        }

    }
}
