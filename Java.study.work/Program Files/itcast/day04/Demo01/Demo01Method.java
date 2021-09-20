package cn.itcast.day04.Demo01;
/*
定义格式
public static void 方法名称（）{
        方法体
}
调用格式
方法名称（）；
注意事项

1.方法定义的先后顺序无所谓
2.方法定义必须是先后挨着的，不能在一个方法的内部定义另一个方法。
3.方法定义之后，自己不会执行；如果希望执行，一定要进行方法的调用

 */
public class Demo01Method {

    public static void main(String[] args) {
        printMethod();
    }

    public static void printMethod() {

        for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= i; j++) {
                for (int x = 1; x <= j; x++) {
                    System.out.print("*");
                }

                System.out.println();
            }
        }
    }
}
       /* for (int i = 1; i <= 20; i++) {
            for (int j = 1; j <= 20; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}*/
