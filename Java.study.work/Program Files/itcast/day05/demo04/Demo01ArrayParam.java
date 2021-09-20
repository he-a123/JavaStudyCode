package cn.itcast.day05.demo04;

public class Demo01ArrayParam {
    public static void main(String[] args) {
        int[] array = {13,31,21,54,63,98,75};

        System.out.println(array);

        printArray(array);
        System.out.println("---------AA---------");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
        System.out.println("----------------------");
        }
  public static void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }



    }
}
