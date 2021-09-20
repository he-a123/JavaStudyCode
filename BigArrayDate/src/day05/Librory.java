package day05;



import java.util.Scanner;

    /**
     * 管理员能够进行的操作有3项（查看、修改、退出），我们可以采用（switch）菜单的方式来完成。 -------------库存管理------------
     * 1.查看库存清单 2.修改商品库存数量 3.退出 请输入要执行的操作序号： 每一项功能操作，我们采用方法进行封装，这样，可使程序的可读性增强。
     * 选择“1.查看库存清单”功能，则控制台打印库存清单 选择“2.修改商品库存数量”功能，则对每种商品库存数进行更新
     * 选择“3.退出”功能，则退出库存管理，程序结束
     *
     * @author 边天旭
     *
     */
    class Test_02 {
        public static void main(String[] args) {
            newMain();
        }

        static int jishu = 3;

        // 主要控制方法1
        public static void newMain() {

            String name[] = {"lenovo", " apple"};
            double size[] = {13.2, 14.0};
            double price[] = {6999.99, 8788.09};
            int count[] = {0, 0};
            while (true) {
                switch (printHello()) {
                    case 1:
                        look(name, size, price, count);
                        break;
                    case 2:
                        if (jishu == 0) {
                            System.out.println("对不起 您输入的错误用户名或者密码次数过多 请联系系统管理员！");
                            break;
                        }
                        updata(name, count);
                        break;
                    case 3:
                        System.out.println("谢谢您的使用 再见!");
                        return;
                    default:
                        System.out.println("您的输入有误 请重新输入！");
                }
            }
        }

        // 打印菜单方法
        public static int printHello() {
            System.out.println("-------------库存管理------------");
            System.out.println("1.查看库存清单");
            System.out.println("2.修改商品库存数量");
            System.out.println("3.退出");
            return new Scanner(System.in).nextInt();
        }

        // 打印清单方法
        public static void look(String name[], double size[], double price[],
                                int count[]) {
            int sum = 0, money = 0;
            System.out.println("-----------------商品清单-----------------");
            System.out.println("品名             尺寸/寸   价格/元           库存/台");
            for (int a = 0; a < count.length; a++) {
                System.out.println(name[a] + "    " + size[a] + "   " + price[a]
                        + "\t " + count[a] + "  ");
                sum += count[a];
                money += count[a] * price[a];
            }
            System.out.println("库存总量为:" + sum + "台");
            System.out.println("库存总价为:" + money + "元");
        }

        // 修改库存方法
        public static void updata(String name[], int count[]) {
            System.out.println("请输入管理员账号及密码:");
            String username = new Scanner(System.in).next();
            String password = new Scanner(System.in).next();
            if (password(username, password)) {
                for (int a = 0; a < count.length; a++) {
                    System.out.println("商品" + name[a] + "的库存修改为:");
                    count[a] = new Scanner(System.in).nextInt();
                    System.out.println("修改成功！");
                }
            } else {
                jishu--;
                if (jishu > 0) {
                    System.out.println("用户名或者密码输入错误请重新输入！您还有" + jishu + "次机会！");
                } else {
                    System.out.println("对不起 您输入的错误用户名或者密码次数过多 请联系系统管理员！");
                }
                return;
            }
        }

        // 管理员密码方法
        public static boolean password(String username, String password) {
            boolean flag = false;
            if (username.equals("admin") && password.equals("admin")) {
                flag = true;
            } else {
                flag = false;
            }
            return flag;
        }
    }
