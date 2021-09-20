package day21_Exception.demo1;

/**
 * Exception 异常
 * 将异常处理掉，程序的就可以继续运行
 * Error  错误
 * 必须修改程序
 * 异常中的关键字
 * throw ，在方法内部，抛出异常
 * throw 后面，必须写 new对象，必须是异常的对象，必须是Exception或者Exception的子类
 * 在方法中声明异常关键字
 *      throws 用于在方法声明上，标明此方法，可能出现异常
 *      请调用者处理
 *      throws 后面必须写异常类的类名
 *      当调用了一个抛出异常的方法，调用者就必须处理
 *      不处理，编译失败
 */
public class ThrowableDemo {
    public static void main(String[] args) throws Exception {
        int[]arr = {/*5,6,9,0,5,6,7,4,2,1,3,4,5*/};
        int i = getArray(arr);
        System.out.println(i);
    }
    public static int getArray(int[] arr)throws Exception{
        //对方法参数进行合法性判断，进行判断是不是null
        if(arr==null){
            //抛出异常的形式，告诉调用者
            //关键字throw
            throw new Exception("传递数组不存在");
        }
        //对数组进行判断，判断数组中是不是有元素
        if(arr.length==0){
            throw new Exception("数组中没有任何元素");
            //抛出异常形式，告诉调用者，数组中没有元素
        }
        int i =arr[arr.length-1];
        return i*2;

    }

}
