package day27.demo2.demo;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 *  使用JDK1.5 的接口Lock，替换同步代码块，实现线程的安全性
 *  Lock接口方法：
 *      lock() 获取锁
 *      unlock() 释放锁
 *      实现类ReentrantLock
 */
public class TicketsDemo implements Runnable{
    private int tickets = 100;
    private Lock lock = new ReentrantLock();
    public void run(){
        while (true){
            lock.lock();
                if(tickets > 0){
                try {System.out.println(Thread.
                        currentThread().getName()
                        +"卖出第"+tickets-- +"张票");
                    Thread.sleep(10);
                } catch (Exception e) { }finally {
                lock.unlock();
            }
                }
        }
    }
}
