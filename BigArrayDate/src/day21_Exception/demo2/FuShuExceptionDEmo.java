package day21_Exception.demo2;

/**
 * 自定义异常
 * 继承Exception，或者继承RuntimeException
 * 构造方法中，super将异常信息，传递给父类
 */
public class FuShuExceptionDEmo extends RuntimeException {
    public FuShuExceptionDEmo(String s){
        super(s);
    }
    public FuShuExceptionDEmo(){}
}