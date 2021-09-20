package day17_Currenttimemillis;

public class Currenttimemillis {
    public static void main(String[] args) {
        funcation();
    }
    public static void funcation(){
        long start = System.currentTimeMillis();
        for (int i = 0; i < 1000000; i++) {
            System.out.println(i);
        }
        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }
    
}
