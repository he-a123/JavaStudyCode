package day22_IO.demo4;

/**
 * 方法的递归调用
 *      方法自己调用自己
 *              适合于方法中运算的主体不变，但是运行的时候，
 *              参与运行的参数方法参数
 *              会变化
 *        注意：
 *        递归一定要有出口，必须可以让程序停下
 *        递归次数不能过多
 *        构造方法，禁止调用
 */
public class DiGuiDemo {
    public static void main(String[] args) {
        int sum = getSum(10);
        System.out.println(sum);
        //getJieChen(10);
        System.out.println(getJieChen(10));//最大进栈18023次
        System.out.println(getFBNQ(12));
    }
    /**
     * 方法递归，计算斐波那契额数列
     */
    public static int getFBNQ(int mouth){
        if(mouth==1)
            return 1;
        if(mouth==2)
            return 1;
        return getFBNQ(mouth-1)+getFBNQ(mouth-2);
    }


    /**
     * 计算阶乘5！
     * 5*4*3*2*1
     * @param n
     * @return
     */
    public static int getJieChen(int n){
        if(n==1)
            return 1;
        return n*getJieChen(n-1);
    }
    public static int getSum(int n) {
        //利用递归求出1~n的和
        if (n == 1)
            return 1;
            return n + getSum(n - 1);
        }

    }



