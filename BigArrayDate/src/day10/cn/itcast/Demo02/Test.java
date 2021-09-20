package day10.cn.itcast.Demo02;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<Elephant> array = new ArrayList<>();
        ArrayList<Refrigerator> array1 = new ArrayList<>();
        eleph(array);
        refrigerator(array1);
    }

    public static void eleph(ArrayList<Elephant>array){
        Elephant e = new Elephant();
        e.color ="白色";
        e.name = "肥猪";
        e.number = 9527;
        e.weight = 12.6;
        array.add(e);
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).color + array.get(i).weight + array.get(i).name +
                    array.get(i).number);
        }
    }
    public static void refrigerator(ArrayList<Refrigerator> array1){

        Refrigerator r = new Refrigerator();
        r.random = "海尔";
        r.color = "白色";
        r.volume = 100.8;
        array1.add(r);

        //array1.add(e);
        for (int i = 0; i < array1.size(); i++) {
            System.out.println(array1.get(i).random + "  " + array1.get(i).color + "  " + array1.get(i).volume);

        }


    }
}
