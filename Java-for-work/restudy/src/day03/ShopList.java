package day03;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopList {
    public static void main(String[] args) {
        ArrayList<Goods> list= new ArrayList<>();
        goods(list);
        while (true){
            init();
        choosrFunction(list );
        }

    }

    private static void goods(ArrayList<Goods> list) {
        Goods go1 = new Goods();
        go1.name = "核桃仁";
        go1.number =9001;
        go1.price = 120.0;
        Goods go2 = new Goods();
        go2.name = "牡丹饼";
        go2.number =9002;
        go2.price = 20.0;
        Goods go3 = new Goods();
        go3.name = "哈密瓜";
        go3.number =9003;
        go3.price = 7.0;
        list.add(go1);
        list.add(go2);
        list.add(go3);
    }

    private static void choosrFunction(ArrayList<Goods> list  ) {
        System.out.println("请输入要操作的序号：");
        String i = new Scanner(System.in).next();

        switch (i){
            case "1":
                GoodsList(list);
                break;
            case "2":
                AddGoods(list);
                break;
            case "3":
                RemoveGoods(list);
                break;
            case "4":
                UpdateGoods(list);
                break;
            case "5":
                System.out.println("正在退出系统.....");
                return;
            default:
                System.out.println("输入错误，请重新输入....");
                break;
        }
    }

    private static void UpdateGoods(ArrayList<Goods> list) {
        System.out.println("请输入您要修改商品的编号：");
        int  num = new Scanner(System.in).nextInt();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).number== num){
                System.out.println("请输入商品编号：");
                int ID = new Scanner(System.in).nextInt();
                list.get(i).number = ID;
                System.out.println("请输入商品名称：");
                String Name= new Scanner(System.in).next();
                list.get(i).name=Name;
                System.out.println("请输入商品价格：");
                Double Price =
                        new Scanner(System.in).nextDouble();
                list.get(i).price= Price;
                System.out.println("商品修改完毕...");
            }else {
                System.out.println("商品编号输入错误！");
            }
        }
    }

    private static void RemoveGoods(ArrayList<Goods> list) {
        System.out.print("请输入想要删除的商品编号：");
        int num =new Scanner(System.in).nextInt();
        System.out.println("正在删除相关商品.....");
        for (int j = 0; j < list.size(); j++) {
            if(list.get(j).number== num){
                list.remove(j);
                System.out.println("商品信息删除完毕");
                return;
            }
        }
        System.out.println("编号输入有误！");
    }

    private static void AddGoods(ArrayList<Goods> list) {
        Goods go = new Goods();
        System.out.print("请输入商品名称：");
        String s = new Scanner(System.in).next();
        System.out.print("请输入商品编号：");
        int a = new Scanner(System.in).nextInt();
        System.out.print("请输入商品价格：");
        double b = new Scanner(System.in).nextDouble();
        go.name = s;
        go.number = a;
        go.price = b;
        list.add(go);
       /* for (int j = 0; j < list.size(); j++) {
            System.out.println(list.get(j).number + "      " +
                    " " +
                    " " + list.get(j).name + "      " + list.get(j).price);
        }*/
    }

    private static void GoodsList(ArrayList<Goods> list) {

        System.out.println(
                "==================商品库存清单==================");
        System.out.println("商品编号    "+"商品名称    "+"商品单价");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).number+"      " +
                    " " +
                    " "+list.get(i).name+"      "+list.get(i).price);
        }
        System.out.println(
                "------------------------------");
    }

    private static void init() {
        System.out.println(
                "========================超市货物管理系统=======================");
        System.out.println("1.货物清单");
        System.out.println("2.添加新货物");
        System.out.println("3.删除货物");
        System.out.println("4.修改货物");
        System.out.println("5.退出系统");

    }

}
