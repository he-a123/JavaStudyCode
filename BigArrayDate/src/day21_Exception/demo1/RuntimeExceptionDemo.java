package day21_Exception.demo1;

/**
 * 异常分为编译异常和运行时期异常
 * 编译异常：调用了抛出异常的方法，不处理编译失败（try   throws）
 * 运行异常：抛出的异常是RuntimeException类，或者是他的子类
 * 运行异常的特点：
 * 方法内部抛出的异常是运行异常，new XXXException
 * 方法声明上，不需要throws语句,调用者不需要处理
 * 设计原因：
 * 运行异常，不能发生,但是发生了需要程序人员停止程序修改源代码
 *
 * 运行异常：一旦发生，不要处理，请你修改源代码，运行异常一但发生，后面的代码没有执行的意义
 *
 */
public class RuntimeExceptionDemo {
    public static void main(String[] args) {
       //double d = 0;
        double d = getArea(6); System.out.println(d);
        try{

        }catch (Exception ex){}

        try{
    funcrion();
            }catch(Exception ex){

        }
    }

    /**
     * 定义一个方法，计算一个圆形的面积
     * @throws Exception
     */
    public static double getArea(double r){
        if(r<=0){
            throw new RuntimeException("圆形不存在");
        }
        return r*r*Math.PI;
    }
    public static void funcrion()throws Exception{
        //对数组的5索引进行判断，如果5索引大于100，请将5索引上的数据/2，否则除以3
        int [] arr ={1,2,3};
        if(arr[5] > 100){
            arr[5] = arr[5]/2;
        }else {
            arr[5] = arr[5]/3;
        }
        //throw new Exception();
        //throw new RuntimeException();
    }
}
