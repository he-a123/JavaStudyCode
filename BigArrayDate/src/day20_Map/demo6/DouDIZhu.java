package day20_Map.demo6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

/**
 * 实现斗地主的功能、
 *      1、组合牌
 *      2、洗牌
 *      3、发牌
 *      4、看牌
 */
public class DouDIZhu {
    public static void main(String[] args) {
        //1、组合牌
        //创建Map集合，键是编号，值是牌
        HashMap<Integer,String> pooker = new HashMap<Integer, String>();
        //创建list集合，存储编号
        ArrayList<Integer> pookerNum = new ArrayList<Integer>();
        //定义13个点数的数组
        String[] numbers = {"2","A","K","Q","J","10","9","8","7","6","5","4","3"};
        //定义4个花色数组
        String[] colors = {"♠","♥","♣","♦"};
        //定义整数变量，作为键出现
        int index = 2;
        //遍历数组，花色+点数的组合，存储到Map集合
        for(String number:numbers){
            for(String color:colors){
                pooker.put(index,color+number);
                pookerNum.add(index);
                index++;
            }
        }
        //System.out.println(pooker);
        pooker.put(0,"大王");
        pookerNum.add(0);
        pooker.put(1,"小王");
        pookerNum.add(1);
        //洗牌，将牌的编号打乱
        Collections.shuffle(pookerNum);
       // System.out.println(pookerNum);
        //发牌功能，将牌编号，发给玩家集合，底牌集合
        ArrayList<Integer> player1= new ArrayList<Integer>();
        ArrayList<Integer> player2= new ArrayList<Integer>();
        ArrayList<Integer> player3= new ArrayList<Integer>();
        ArrayList<Integer> bottom= new ArrayList<Integer>();
            //发牌采用的是集合索引%3
        for(int i = 0 ;i <pookerNum.size();i++){
            //先将底牌做好
            if(i < 3){
                bottom.add(pookerNum.get(i));
            }else if(i % 3==0){//对索引%3判断
                player1.add(pookerNum.get(i));
            }else if(i % 3 ==1){
                player2.add(pookerNum.get(i));
            }else if(i % 3 ==2){
                player3.add(pookerNum.get(i));
            }
        }
            // 将玩家手中的编号排序
        Collections.sort(player1);
        Collections.sort(player2);
        Collections.sort(player3);
        //看牌，将玩家手中的编号，拿到Map集合中查找，根据键找值
       // 定义方法实现
        look("刘亦菲",player1,pooker);
        look("黄渤",player2,pooker);
        look("沈腾",player3,pooker);
        look("底牌",bottom,pooker);
    }
    public static void look(String name,ArrayList<Integer> player,HashMap<Integer,String> pooker){
        //遍历集合Arraylist，获取元素作为键，到集合Map中找值
        System.out.print(name+"  ");
        for( Integer key :player) {
            String value = pooker.get(key);
            System.out.print(value + " ");
        }
        System.out.println();
    }
}
