package day01;

import java.util.Scanner;

public class KuCunGL {
    public static void main(String[] args) {
        //choosepd();
        String [] str =new String[]{ "牛奶  ","八宝粥","瓜子  ","矿泉水",
                "花生  "};
        int [] in = new int[]{80,100,60,40,10};
        while (true){
        Swich(str,in);
        }
    }
    private static void Swich(String str[],int in[]){
       int a = choosepd();
        switch (a){
            case 1:
            exe1(str,in);
            case 2:
            exr2(in);
            case 3:
            break;

            default:
                System.out.println("您的输入有误，请重新输入！");
        }

    }
    private static void exr2(int x[]){
        System.out.println("请输入要修改商品的序号：");
        int i = new Scanner(System.in).nextInt();
        System.out.println("请输入该商品的数量：");
        int j = new Scanner(System.in).nextInt();
        if (i>=0 && i < 5){
        x[i] = j;

    }
    }
    private static void exe1(String str[],int in[]){
        System.out.println(
                "---------------库存清单--------------");
        System.out.println("序号   "+"品类    "+"数量");

       // String [] St={};
        for (int i = 0; i < 5; i++) {
            System.out.println("  " + i+"   "+str[i] + " " +
                    " " +
                    " " + in[i]);
        }
        System.out.println(
                "----------------------------------------------");

    }
    private static int choosepd(){
        System.out.println("------------------库存管理------------------");
        System.out.println("1.查看库存清单");
        System.out.println("2.修改商品库存数量");
        System.out.println("3.退出");
        System.out.println("请输入要执行的操作序号：");
        int num = new Scanner(System.in).nextInt();
        return num;
    }
}
