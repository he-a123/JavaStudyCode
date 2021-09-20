package day26.demo;

/**
 *创建和启动一个线程
 *  创建Thread子类对象
 *      子类对象调用方法start（）
 *      让线程程序执行，jvm调用线程中的run
 */
public class ThreadDemo {
    public static void main(String[] args) {
    SubThread st = new SubThread();
    st.start();
        for (int i = 0; i < 50; i++) {
            System.out.println("main ....."+ i);
        }
    }
}
