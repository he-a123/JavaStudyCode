package day21_Exception.demo1;

/**
 * 多个catch写在一起
 * 细节：
 * catch小括号中，写的是异常类的类名
 * 有顺序概念
 *
 * 平级异常：抛出的异常类之间，没有继承关系，没有顺序
 *上下级关系的异常
 * NullPointerException extends RuntimeException extends Exception
 * 越高级的父类，写在下面
 */
public class ExceptionDemo2 {
    public static void main(String[] args) {
        try{

        }/*catch(*//*NoSuchFieldException *//**//*ex*//*){

        }*/catch( NullPointerException ex){

        }
    }
    public static void function(int a) throws NullPointerException,
            NoSuchFieldException {
        if(a==0){
            throw new NullPointerException();

        }if(a==1){
            throw new NoSuchFieldException();
        }
    }
}
