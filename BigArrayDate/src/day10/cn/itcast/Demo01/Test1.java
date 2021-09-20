package day10.cn.itcast.Demo01;


import day10.cn.itcast.Demo01.HomeWorkDemo;

public class Test1 {


    public static void main(String[] args) {
        HomeWorkDemo h = new HomeWorkDemo();
        HomeWorkDemo h1 = new HomeWorkDemo();

        h.addNumber();
        //h.compareAB();
        h.caculater();
        boolean e = h.compareAB();
        System.out.println(e + "比较结束");

    }


}
