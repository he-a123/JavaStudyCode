package src;

import java.util.Random;

public class Demo02Random {
    public static void main(String[] args) {

        Random r = new Random();
        for (int f = 0; f < 10; f++) {
        for (int i = 1; i < 6; i++) {
            int num = r.nextInt(34);
			
            System.out.print(num+"\t");
        }System.out.println("--------------------------");
        for (int j = 1; j < 3; j++) {
            int num1 = r.nextInt(17);
			
           System.out.println(num1);
		   
        }
        }
    }
}
