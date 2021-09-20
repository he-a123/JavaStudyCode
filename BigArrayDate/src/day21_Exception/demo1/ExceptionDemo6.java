package day21_Exception.demo1;

/**
 * Throwable 类中的方法
 *      String getMessage()  对异常信息的详细描述
 *      String toString()     对异常信息的简短描述
 *      void printStackTrace()  将异常信息追踪到标准的错误流
 *      异常信息最全，JVM默认调用方法也是这个方法
 */
public class ExceptionDemo6 {
    public static void main(String[] args) {
        try {
            function();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            System.out.println(ex.toString());
            ex.printStackTrace();
        }
    }
    public static void function()throws Exception{
       throw new Exception("异常了！");
       /* int[] arr = null;
        arr[1] = 1;*/
    }
}
