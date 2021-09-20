package day05;

public class ArrDemo0 {

    public static void main(String[] args)
    {
        arr1();
    }
    public static void arr1(){
        int num = 0 ;
        for (int i = 1 ; i <=100 ; i++ )
        {
            if (i  / 10 ==9 || i %10==9)
            {
                continue;
            }
            if (num % 5 == 0)
            {
                System.out.println();
            }
            num ++;
            System.out.print(i + " ");
        }


    }
}
