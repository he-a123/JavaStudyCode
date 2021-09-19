package day02;

import java.util.ArrayList;
import java.util.Scanner;

public class ShopAsstent {
    public static void main(String[] args) {
        Goods g = new Goods();
        Goods g1= new Goods();
        Goods g2 = new Goods();
        ArrayList<Goods> arr = new ArrayList<>();
        g.brand= "华为";
        g.count=13;
        g.price=5399.99;
        g.size=7.9;
        g1.brand= "小米";
        g1.count=13;
        g1.price=5399.99;
        g1.size=7.9;
        g2.brand= "比迪";
        g2.count=13;
        g2.price=5399.99;
        g2.size=7.9;
        arr.add(g);
        arr.add(g1);
        arr.add(g2);
       while (true){
           int a = perfice();
           switch (a){
               case 1:
                   ShoppingList(arr);
                   break;
               case 2:
                   ChangeCount(arr);
                   break;
               case 3:
                   exit();
                   return;
               default:
                   System.out.println(
                           "-------------------");
                   System.out.println("错误输入！");

                   break;
           }
       }
    }

    private static void exit() {
        System.out.println("正在退出系统......");

    }

    private static void ChangeCount(ArrayList<Goods> arr) {
        System.out.println("请输入商品编号：");
        int i = new Scanner(System.in).nextInt();
        if(i>=0 && i<arr.size()) {
            System.out.println("请输入商品数量：");
            arr.get(i).count= new Scanner(System.in).nextInt();
           /* for (int i1 = 0; i1 < arr.size(); i1++) {*/
                arr.set(i,arr.get(i));
            //}

        }else {
            System.out.println("错误输入！");
        }
    }


    private static void ShoppingList(ArrayList<Goods> arr) {

        System.out.println(
                "-----------------商品清单-----------------");
        System.out.println("brand  "+"count   "+"price    "+
                " size"+"\t");
        for (int i = 0; i < arr.size(); i++) {
            System.out.println(arr.get(i).brand+"    "+
                    arr.get(i).count+"      "+arr.get(i).price+"   "+
                    arr.get(i).size+"\t");
        }
    }

    private static int perfice(){
        System.out.println("-----------库存清单-----------");
        System.out.println("1.查看商品清单");
        System.out.println("2.修改商品库存数");
        System.out.println("3.退出");
        System.out.println("请输入需要操作的项目序号：");
        int a = new Scanner(System.in).nextInt();
        return a;
    }
}
