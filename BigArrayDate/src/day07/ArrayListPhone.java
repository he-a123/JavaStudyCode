package day07;

import java.util.ArrayList;

public class ArrayListPhone {
    /*定义一个手机类Phone，包含三个属性品牌(brand)、
    价格(price)、颜色(color)。
  创建四个手机("小米"、"华为"、"乐视"、"奇酷")对象
  存入ArrayList集合中，并遍历输出。*/
    public static void main(String[] args) {
        ArrayList<Phone> array = new ArrayList<Phone>();
        addArray(array);
        printArray(array);
    }
    public static void addArray(ArrayList<Phone>array){
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        Phone p3 = new Phone();
        Phone p4 = new Phone();
        p1.brand = "小米";
        p1.color = "白色";
        p1.price = 1450.9;
        p2.brand = "华为";
        p2.color = "黑色";
        p2.price = 3450.9;
        p3.brand = "乐视";
        p3.color = "灰色";
        p3.price = 3450.9;
        p4.brand = "奇酷";
        p4.color = "蓝色";
        p4.price = 4450.9;
        array.add(p1);
        array.add(p2);
        array.add(p3);
        array.add(p4);
    }
    public static void printArray(ArrayList<Phone>array){
        for (int i = 0; i < array.size(); i++) {
            System.out.println("  品牌："+array.get(i).brand + "  颜色：" +array.get(i).color + "  价格：" + array.get(i).price);
        }
    }
}
