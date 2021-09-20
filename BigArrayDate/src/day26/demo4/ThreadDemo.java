package day26.demo4;

import org.w3c.dom.ls.LSOutput;

/**
 * 使用匿名内部类，实现多线程程序
 * 前提：继承后者接口实现
 * new 父类或者接口（）{重写抽象方法}
 *
 */
public class ThreadDemo {
    public static void main(String[] args) {
        //继承方式XXX extends Thread{public void run(){}}
       new Thread(){
           public void run(){
               System.out.println("1111");
           }
       } .start();
       //接口方式XXX implements Runnable{public void run(){}}
   Runnable r = new Runnable(){
        public void run(){
            System.out.println("&&&");
        }
    };
    new Thread(r).start();

    new Thread(new Runnable() {
        @Override
        public void run() {
            System.out.println("#####");
        }
    }).start();
    }
}
