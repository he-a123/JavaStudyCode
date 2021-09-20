package day27.demo4;
/*
       输入的线程，对资源Resource中的成员变量赋值
       一次       张三  男
       第二次      李四   女
 */
public class InputDemo implements Runnable {
    private Resource r ;
    public InputDemo(Resource r){
        this.r=r;
    }
    public void run() {
        int i = 0;
    while (true){
        synchronized (r){
            if(r.flag ){
                try{r.wait();}catch (Exception ex){}}
        if (i%2==0){
        r.name= "张三";
        r.sex = "男";}else {
            r.name="李四";
            r.sex= "女";
        }
        r.flag= true;

            r.notify();

        }
        i++;
    }
    }
}
