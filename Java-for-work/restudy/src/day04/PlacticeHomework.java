package day04;

public class PlacticeHomework {
    public static void main(String[] args) {
        //test1();
        test2();
    }

    private static void test2() {
       int sum = 0;
       int i =1;
       int j = 1;
       int sum1 = 1;
       int sum2 =0;
      while (i<20){
          while(j<=20-i){
              sum1= sum1*j;
              j++;
          }
          i++;
          sum2=1/sum1;
          sum+=sum2;
      }
        System.out.println(sum);
    }

    //打印菱形
    private static void test1() {
        //for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                if(j==1){
                System.out.println("      *");
            }else if(j==2){
                    System.out.println("    *   *   ");
                }else if(j==5){
                    System.out.println("  *       *  ");
                }else if(j==6){
                    System.out.println("*           *");
                }else if(j==7){
                    System.out.println("  *       *  ");
                }else if(j==8){
                    System.out.println("    *   *   ");
                }else if(j==9){
                    System.out.println("      *");

                }
            }
        }
    //}
}
