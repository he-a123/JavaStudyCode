package day18_Iterator;

public class for99 {
    public static void main(String[] args) {
        //For99();
        For99_1();
    }
    public static void For99(){
        System.out.println("99乘法表");
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j <= i; j++) {

            System.out.print(i+"x"+ j + "="+ i*j+"\t ");
            }
            System.out.println("");
        }

    }
    public static void For99_1(){
        int i = 1;
        int j = 1;
        for (int y = 0; y < 9; y++) {
            if (i<10){
            System.out.print(i+"x"+ j + "="+ i*j+"\t ");
        }else if(j<i){
            System.out.print(i+"x"+ j + "="+ i*j+"\t ");

        }
            j++;
                i++ ;
                System.out.println();
    }

}
 }

