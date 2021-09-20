package day06;

import java.util.ArrayList;
import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        ArrayList<Goods> array = new ArrayList<Goods>();
        addGoods(array);
       /* PrintGoodsName(array);
        ChangeGoodsInformation(array);*/
        while (true){
            int number = chooseFunction();
            switch (number){
                case 1:
                    PrintGoodsName(array);
                    break;
                 case 2:
                     ChangeGoodsInformation(array);
                     break;
                case 3:
                    return;

                 default:
                     System.out.println("无此功能");
                     break;
            }
        }
    }
    public static void addGoods(ArrayList<Goods> array){
        Goods g1 = new Goods();
        Goods g2 = new Goods();
        g1.brand = "MacBook";
        g1.count = 3;
        g1.price = 9998.0;
        g1.size = 14.5;
        g2.brand = "华硕A30";
        g2.count = 18;
        g2.price = 7544.9;
        g2.size = 15.5;
        array.add(g1);
        array.add(g2);
    }
    public static void PrintGoodsName(ArrayList<Goods> array){
        System.out.println("---------------商品信息--------------");
        System.out.println("  品牌   价格    尺寸  库存");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).brand+" "
                    + array.get(i).price+"  "  +array.get(i).size+
                    "   " + array.get(i).count );


        }
        System.out.println("总库存为：" + (array.get(0).count + array.get(1).count) );
        System.out.println("总价格为：" + (array.get(0).price* array.get(0).count + array.get(1).count*array.get(1).price) );
    }
    public static void ChangeGoodsInformation(ArrayList<Goods> array){
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < array.size(); i++) {
            Goods g = array.get(i);
            System.out.println("请输入" + g.brand + "的库存数");
            g.count = sc.nextInt();
        }

    }
    public static int chooseFunction(){
        System.out.println("---------库存管理--------------");
        System.out.println("1、查看库存清单");
        System.out.println("2、修改商品库存数量");
        System.out.println("3、退出");
        System.out.println("请输入要执行的操作序号：");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        return num;
    }


}
