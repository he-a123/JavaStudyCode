package day01;

import java.util.Scanner;

public class Shop {
    public static void main(String[] args) {
        String[] name = new String[]{"牛奶  ","八宝粥","瓜子  ","矿泉水",
                "花生  "};
        int [] num = new int[]{80,100,60,40,10};

        while (true){
             int choose = chooseFunction();
        switch (choose){
            case 1:
                Function1(name,num);
                break;
            case 2:
                Function2(num);
                break;
            case 3:
                exit();
                return ;
            default:
                System.out.println("您的输入有误，请重新输入！");
        }
    }
    }

    private static void exit() {
        System.out.println("正在退出系统.....");
    }

    private static void Function2(int[] num) {
        System.out.println(
                "----------------修改商品数量---------------");
        System.out.println("请输入要修改商品的序号：");
        int i = new Scanner(System.in).nextInt();
        if(i>=0 && i<5){
        System.out.print("请输入数量：");
        int h = new Scanner(System.in).nextInt();
        for (int j = 0; j < num.length; j++) {
           num[i]=h;
        }
        }else {
            System.out.println("您的输入有误，请重新操作！");
        }
    }

    private static void Function1(String name[],int num[]){
        System.out.println(
                "---------------库存清单--------------");
        System.out.println("序号   "+"品类    "+"数量");
        for (int i = 0; i < name.length; i++) {
            System.out.println(i+"      "+name[i]+"   "+num[i]+
                    "\t");
        }
        System.out.println(
                "-----------------------------------");
    }
    private static int chooseFunction(){
        System.out.println("------------------库存管理------------------");
        System.out.println("1.查看库存清单");
        System.out.println("2.修改商品库存数量");
        System.out.println("3.退出");
        System.out.print("请输入要执行的操作序号：");
        int choose = new Scanner(System.in).nextInt();
        return choose;
    }
}
