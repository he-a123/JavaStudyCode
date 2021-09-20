package day20_Map.demo1;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/*

Map集合获取方式
entrySet方法，键值对映射关系（结婚证）获取
实现步骤：
1、调用map集合方法entrySet（）将集合中的映射关系对像，
存储到Set集合   Set<Entry <k,v>>
2、迭代Set集合
3、获取出的Set集合的元素，是映射关系对象
4、通过映射关系对象方法getKey，getValue获取键值对

创建内部对象    外部类.内部类 = new
 */
public class EntryDemo {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<Integer,String>();
        map.put(1,"abc");
        map.put(2,"ybc");
        map.put(3,"ebc");
        map.put(4,"dbc");
        map.put(5,"cbc");
        map.put(6,"bbc");
        Set<Map.Entry<Integer, String>> set = map.entrySet();
        //迭代器
       Iterator<Map.Entry<Integer, String>> it = set.iterator();
        while (it.hasNext()){
            Map.Entry<Integer, String> entry = it.next();
            Integer key = entry.getKey();
            String value = entry.getValue();
            System.out.println(key+"="+value);
        }
        System.out.println("==============");
        //增强for
        for(Map.Entry<Integer,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+"="+entry.getValue());
        }
    }
}
