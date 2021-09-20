package day09;
/*
超市菜单管理系统

实现

        1、 商品数据的初始化
        2、用户菜单的选择
        3、根据选择执行不同的功能
               3.1、Read     查看商品
               3.2、Create   添加商品
               3.3、Delete   删除商品
               3.4、Update   修改商品
 */
import java.util.ArrayList;
import java.util.Scanner;

public class Floot {
    public static void main(String[] args) {
        ArrayList<FruitItem> array =
                new ArrayList<FruitItem>();
        init(array);
        while (true){
            mainMenu();

            int choose = chooseFunction();
            switch (choose){
                case 1 :
                    showFunction(array);
                      break;
                case 2:
                    addFruit(array);
                    break;
                case 3:
                    deleteFruit(array);
                    break;
                case  4 :
                    updateFruit(array);
                    break;
                case  5 :
                    return;
                default:
                    System.out.println("输入错误！");
                    break;
            }


        }
 }
 //修改商品
 public static void updateFruit(ArrayList<FruitItem>array) {
     System.out.println("选择的是商品修改功能");
     System.out.println("请输入商品编号：");
     Scanner sc = new Scanner(System.in);
     int ID = sc.nextInt();
     for (int i = 0; i < array.size(); i++) {
         FruitItem item = array.get(i);
         if(item.ID == ID){
             System.out.println("请您输入新的商品编号：");
             item.ID = sc.nextInt();
             System.out.println("请您输入新的商品名字：");
             item.name = sc.next();
             System.out.println("请您输入新的商品价格：");
             item.money = sc.nextDouble();
             System.out.println("商品修改成功！");
             return;

         }
     }
     System.out.println("输入编号不存在！");
 }
 //删除商品
 public  static  void deleteFruit(ArrayList<FruitItem>array){
     System.out.println("选择的是商品删除功能");
     System.out.println("请输入商品编号：");
        Scanner sc = new Scanner(System.in);
        int ID = sc.nextInt();
     for (int i = 0; i < array.size(); i++) {
         FruitItem item = array.get(i);
         if(ID == array.get(i).ID){
             array.remove(i);
             System.out.println("删除成功！");
             return;
         }
     }
     System.out.println("您的输入有误！");
 }
 //添加商品
 public  static void addFruit(ArrayList<FruitItem>array){
     System.out.println("您选择的是商品添加功能！");
     Scanner sc = new Scanner(System.in);
     System.out.println("请输入需要添加商品的编号：");
        int ID = sc.nextInt();
     System.out.println("请输入需要添加商品的名字：");
        String name = sc.next();
     System.out.println("请输入商品的价格：");
     double money = sc.nextDouble();
     FruitItem item = new FruitItem();
     item.ID = ID;
     item.name = name;
     item.money = money ;
     array.add(item);
     System.out.println("添加成功！");
 }
 //商品清单
        public static  void showFunction(ArrayList<FruitItem>array){
            System.out.println();
            System.out.println("===================商品库存清单==================");
            System.out.println("商品编号           商品名称           商品单价");


            for (int i = 0; i < array.size(); i++) {
                FruitItem item = array.get(i);
                System.out.println("  "+ item.ID + "          " + item.name+"   " +
                        "      " + item.money +"\t");
            }
    }
    //给集合添加元素
        public static void init(ArrayList<FruitItem>array){
         FruitItem f1 = new FruitItem();
         f1.ID = 9001;
         f1.money = 12.5;
         f1.name = "少林寺核桃酥饼";

            FruitItem f2 = new FruitItem();
            f2.ID = 9002;
            f2.money = 15.5;
            f2.name = "尚康杂粮牡丹饼";

            FruitItem f3 = new FruitItem();
            f3.ID = 9003;
            f3.money = 22.5;
            f3.name = "新疆原产哈密瓜";

            array.add(f1);
            array.add(f2);
            array.add(f3);
        }
        //商品管理系统界面
        public static void mainMenu(){
            System.out.println();
            System.out.println("========================超市商品清" +
                    "单管理系统=============================");
            System.out.println("1、货物清单   2、添加商品  3、" +
                    " 删除货物  4、 修改货物  5、退出");
            System.out.println("请您输入要操作的功能序号");
        }
        public static int chooseFunction(){
            Scanner sc = new Scanner(System.in);
            return sc.nextInt();

        }
}
