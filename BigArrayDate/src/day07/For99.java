package day07;

public class For99 {
    public static void main(String[] args) {
        for (int i = 9; i >= 1; i--) {
            for (int j = 9; j >= i; j--) {
                System.out.print(j + " x" + i + " = " + j*i  +"\t");
            }
            System.out.println();
        }
    }
}
