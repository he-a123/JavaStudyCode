package day10.cn.itcast.Demo01;

import java.util.Random;

public class HomeWorkDemo {
    private int a;
    private int b;

   public HomeWorkDemo() {

    }
    public void caculater(){
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + "x" + i + "="+ i*j + "\t");
            }
            System.out.println();
        }

    }
  public boolean compareAB() {
      int c = a;
      int d = b;
      return a > b;
  }
     /* if  (c == d){
          System.out.println( a +"这两个数相等" + b);
      }else {
          System.out.println(a +"这两个数不相等" + b);
      }
      return false;*/



    public void setA(int a) {
        this.a = a;
    }

    public int getA() {
        return a;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getB() {
        return b;
    }

    public HomeWorkDemo( int a, int b) {

        this.a = a;
        this.b = b;
    }


    public  void addNumber() {
        //int a = 10;
        //int b = 11;
        Random ran = new Random();

        for (int i = 0; i < 2; i++) {
            int c = a = ran.nextInt(10);
            int d = b = ran.nextInt(10);

            System.out.print(a + "  ");
            System.out.println(b);
            System.out.println(a  + "+" + b + " =" + (a + b) + "  ");
        }


    }

}
