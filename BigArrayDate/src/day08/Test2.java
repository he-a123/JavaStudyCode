package day08;

public class Test2 {
    /*
    1.2	输出所有的水仙花数，所谓水仙花数是指一个数3位数，其每位数字立方和等于其本身，如153 = 1*1*1 + 3*3*3 + 5*5*5
题目分析：
通过观察发现，本题目要实现打印符合要求的数字（即水仙花数）。
1.	明确什么样的数就是水仙花数。水仙花数是指一个3位数（100-999之间），其每位数字立方之和等于该3位数本身。如153 = 1*1*1 + 3*3*3 + 5*5*5，
即 3位数本身 = 百位数立方 + 十位数立方 + 个位数立方;
2.	获取水仙花范围内的所有3位数（100-999之间的每个3位数）
3.	判断该3位数是否满足水仙花数，满足，打印该3位数
解题步骤：
1.	使用for循环，得到100-999之间的每个3位数
2.	获取3位数中百位数字、十位数字、个位数字
3.	使用if条件语句，判断该3位数是否满足水仙花数，满足，使用输出语句，打印该3位数

     */
    public static void main(String[] args) {
        for (int i = 100; i <= 999; i++) {
            if((i/100)*(i/100)*(i/100) + (i%100/10)*(i%100/10)*(i%100/10)
                    + (i%10)*(i%10)*(i%10)==i){
                System.out.println("水仙花数为：" + i);
            }

        }
    }
}