package day27.demo1;

/**
 * 采用同步方法形式，解决线程的安全问题
 * 好处：代码简洁
 * 将线程共享数据，和同步，抽取到一个方法中
 * 在方法的声明上，加入同步关键字
 *
 * 问题：
 *      同步方法有没有锁，有，同步方法中的对象锁是本类对象引用this
 *      静态方法也有同步锁，但不是this ，锁是本类自己.class 属性
 *      静态方法，同步锁，是本类类名.class属性
 */
public class TicketsDemo implements Runnable{
    private static int tickets = 100;

    public void run(){
        while (true){
            payTicket();
        }
    }
    public static  void payTicket(){
        synchronized(TicketsDemo.class){
        if(tickets > 0) {
            try {
                Thread.sleep(10);
            } catch (Exception e) {
            }
            System.out.println(Thread.currentThread().getName() + "卖出第" + tickets-- + "张票");
        }
        }
        }
    }

