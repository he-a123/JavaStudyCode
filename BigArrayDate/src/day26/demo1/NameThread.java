package day26.demo1;
/*
    获取线程名字，父类Thread方法
        String getName（）
 */
public class NameThread extends Thread{
    public NameThread(){
        super("config.properties");
    }
    public void run(){
        System.out.println(getName());

    }
}
