package day27.demo4;

/**
 * 开启输入线程和输出线程，实现赋值和打印值
 */
public class ThreadDemo {
    public static void main(String[] args) {
        Resource r = new Resource();
        InputDemo id = new InputDemo(r);
        OutputDemo od = new OutputDemo(r);
        Thread tid = new Thread(id);
        Thread tod = new Thread(od);
        tid.start();tod.start();
    }
}
