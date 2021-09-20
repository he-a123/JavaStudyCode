package day05;

public class ArrDemo1 {
    public static void main(String[] args) {
        arrNum();
    }

    public static void arrNum() {
        int a , b, num = 0 ;
        for ( a = 2; a < 100; a++) {
            for(b = 1; b < a; b++) {
                if (a % b == 0) {
                    continue;
                }
            }//每五个打印一行
            if(a ==b){
               if(num % 5 == 0){
                   System.out.println();
             }

                num ++;
            System.out.print(a + " ");
        }
}
    }
}
