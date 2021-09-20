package day20_Map.demo4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/*
集合操作的工具类
Collections
 */
public class CollectionsDemo {
    public static void main(String[] args) {
        function_2();
    }
    /**
     * Collections.shuffle方法
     * 对list集合中的元素，进行随机排列
     */
    public static void function_2() {
        List<String> list = new ArrayList<String>();
        list.add("例子");
        list.add("李子");
        list.add("离子");
        list.add("梨子");
        list.add("驴子");
        list.add("狗子");
        System.out.println(list);
        Collections.shuffle(list);
        System.out.println(list);
    }
    /**
     * Collections.binarySearch静态方法
     * 对list集合进行二分搜索，方法参数，传递list集合，传递被查找的元素
     *
     */
    public static void function_1(){
        List<String> list = new ArrayList<String>();
        list.add("例子");
        list.add("李子");
        list.add("离子");
        list.add("梨子");
        list.add("驴子");
        list.add("狗子");
      int index = Collections.binarySearch(list,"驴子");
        System.out.println(index);
    }
    /*
    *Collections.sort静态方法
    * 对于List集合，进行升序排列
    **/
    public static void function(){
        //创建list集合
        List<String> list = new ArrayList<String>();
        list.add("大家");
        list.add("大一");
        list.add("大学");
        list.add("大象");
        list.add("大树");
        System.out.println(list);
        //调用集合工具类方法sort
        Collections.sort(list);
        System.out.println(list);
    }
}
