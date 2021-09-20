package day21_Exception.demo1;

/**
 * 继承后，在子类重写父类方法的时候，异常处理
 * 结论：
 *      父类方法，如果抛出异常，子类重写后可以不抛出异常
 *      也可以抛出异常，但是如果子类要抛出异常，抛出的异常不能大于父类的异常
 *      大于，是指继承关系
 *
 *      如果父类的方法，没有异常抛出，子类重写后，也不能抛出异常
 *      如果子类中调用了异常方法，别无选择，只能try..catch处理
 */
public class ExceptionDemo5 {
}
class fu{
    public void function()throws Exception{
/*try {

}catch (Exception ex){

}*/
    }
}
class zi extends fu{
    public void function()throws Exception/*RuntimeException*/{
        throw new Exception();
    }
    class Fu{
        public void function(){

        }
    }
    class Zi extends Fu{
        public void function(){
            try {
            method();
            }catch(Exception ex){

            }
        }
        public void method()throws Exception{

            throw new Exception();
        }
    }
}
