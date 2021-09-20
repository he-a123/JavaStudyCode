package day27.demo;

/**
 * 通过线程休眠，出现安全问题
 * 解决安全问题，java程序提供了同步技术
 * 公式：
 *  synchronized（任意对象）{
 *      线程要操作的共享数据
 *  }
 *  同步代码块
 */
public class TicketsDemo implements Runnable{
    private int tickets = 100;
    private Object obj = new Object();
    public void run(){
        while (true){
            synchronized (obj){
                if(tickets > 0){
                try {
                    Thread.sleep(10);
                } catch (Exception e) { }
                System.out.println(Thread.currentThread().getName()+"卖出第"+tickets-- +"张票");
            }
                }
        }
    }
}
