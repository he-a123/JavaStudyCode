package JAVA_Continue.demo1;

import java.util.ArrayList;
import java.util.Random;
//普通成员
public class Member extends User {
    /**
     * Constructs a new object.
     */
    public Member() {
    }

    public Member(int money, String name) {
        super(money, name);
    }
    public void receive(ArrayList<Integer> list){
        //从多个红包当中随机抽取一个，给我自己
        //随机获取一个集合当中的索引编号
        int index = new Random().nextInt(list.size());
       //根据索引，从集合中删除，并且得到被删除的红包
        int delta = list.remove(index);
        //当前成员自己本来有多少钱
        int money = super.getMoney();
        //加法，并且重新设置回去
        super.setMoney(money+delta);
    }
}
