package day08;

public class HomeWork2 {
    /*分析以下需求，并用代码实现：
            (1) 计算15+25+35+....+1005的和*/

    public static void main(String[] args) {
        int num = 0;

        int count = 0;
        print();
        for (int i = 15; i < 1006; i++) {
            if(i % 5 ==0 && i % 10 != 0){
                num += i;
                System.out.print(" " + i);
                count ++;
                if (count % 5 == 0){

                    System.out.println();
                }
              }

            }
        System.out.println();
        System.out.println(num);
        }

        public static void print(){

            int count = 0;
        int sum = 0;
        for (int a = 15; a <= 10005 ; a +=10){
            sum +=a;
            System.out.print("  "+ a);

        count ++;
            if (count % 5 == 0){
             System.out.println();
            }
        }
        System.out.println();
            System.out.println(sum);
    }

}