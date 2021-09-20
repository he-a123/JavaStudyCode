package JAVA_Continue.demo1;

import java.util.ArrayList;
//群主的类
public class Manger extends User {
    public Manger(){}

    public Manger(int money, String name) {
        super(money, name);
    }
    public ArrayList<Integer> send(int totalMoney,
                                   int count){
        //首先需要一个集合，用来存储若干个红包的金额
        ArrayList<Integer> redList =
                new ArrayList<Integer>();
        //首先看群主有多少钱
        int leftMoney = super.getMoney();
        if (totalMoney > leftMoney){
            System.out.println("余额不足");
            return redList;
        }
        //扣钱，重新设置余额
        super.setMoney(leftMoney - totalMoney);
        //发红包需要平均拆分成为count份
        int avg = totalMoney / count;
        int mod = totalMoney % count;
        //除不开的零头，包在最后一个红包中
        //下面把红包一个一个放到集合中
        for (int i = 0; i < count -1; i++) {
            redList.add(avg);
        }
        //最后一个红包
        int last = avg + mod;
        redList.add(last);
        return redList;

    }
}
