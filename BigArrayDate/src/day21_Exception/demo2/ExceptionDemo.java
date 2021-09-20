package day21_Exception.demo2;

/**
 * 传递成绩，计算平均成绩
 * 成绩没有负数，需要抛出异常，停止计算
 */
public class ExceptionDemo {
    public static void main(String[] args) {
       // try {
            int num = getAvg(100,-50,90,60,83);
            System.out.println(num); //}//catch (FuShuExceptionDEmo ex){
           // ex.printStackTrace();
       // }


    }
    public static int  getAvg(int...source){
        int sum = 0;
        for(int s : source){
            if(s < 0){
                throw new FuShuExceptionDEmo("成绩错误 "+ s);
            }
            sum=sum + s;
        }
        return sum/source.length;
    }
}
