package day21_Exception.demo1;

/**
 *  try{
 *  *      被检测的代码
 *  *      可能出现异常的代码
 *  *  }catch（异常变量名 变量）{
 *  *      异常的处理方式
 *  *      循环判断，调用方法，变量
 *  *  }finally{
 *  *     必须要执行代码
 *  *  }finally,无论程序是否出现异常，此程序必须执行
 *  此功能可用于释放资源
 *
 */
public class ExceptionDemo {
    public static void main(String[] args) {
        try{
            funcation(0);
             }catch (Exception ex){
            System.out.println(ex);
             }finally {
            System.out.println("代码必须执行");
        }
    }
    public static void funcation(int a)throws Exception{
        if (a==0)
            throw new Exception();
            System.out.println(a);

    }
}
