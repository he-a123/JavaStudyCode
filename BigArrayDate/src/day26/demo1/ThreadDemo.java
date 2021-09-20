package day26.demo1;
/*
    每个线程，都有自己的名字
    运行方法main线程，名字就是“main”
    其他新建线程按先后顺序依次编号排名，默认“Thread—0”，“Thread—1”...

    JVM开启主线程，运行方法main，主线程也是线程，是线程必然就是Thread类对象
    Thread类中的静态方法
        static Thread currentThread()返回正在执行的线程对象

 */
public class ThreadDemo  {
    public static void main(String[] args) {
        NameThread nt = new NameThread();
       nt.setName("007");
        nt.start();
        Thread t = Thread.currentThread();
        System.out.println(t.getName());
       // System.out.println(Thread.currentThread().getName());
    }
}
