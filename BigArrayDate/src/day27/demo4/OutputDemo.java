package day27.demo4;

/**
 * 输出线程，对资源对象Resources中成员变量，输出值
 */
public class OutputDemo implements Runnable {
   private Resource r;
    public OutputDemo(Resource r){
        this.r=r;
    }
    public void run() {
    while (true){
        synchronized (r){
            if(!r.flag){
               try {
                   r.wait();
               }catch (Exception ex){}
            }
        System.out.println(r.name+"...."+r.sex);
            r.flag= false;
            r.notify();
    }
    }
    }
}
