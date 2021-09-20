package day07;

public class ArrayLoop {
    public static void main(String[] args) {
        int[] arr= {2,4,6,8,1,3,2};
            //int temp = 0;
            int min = 0;
            int max = 0;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < i+1; j++) {
            if (arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
                System.out.print(arr[i]);

            }
        }
    }
}
