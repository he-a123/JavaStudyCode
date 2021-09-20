package day08;

public class Test05 {
    public static void main(String[] args) {

        int[] arr = {1, 2, 5, 6, 3, 9, 4, 7, 10, 22, 66, 21, 20, 31, 59, 69};
        System.out.print("原数组为：" + "{");
        for (int i = 0; i < arr.length; i++) {
            System.out.print( arr[i] +" ");
       }
        System.out.println("}");
        reverse(arr);
        print(arr);
        }
    public static void reverse(int[]arr){
        for (int i = 0; i < arr.length-1; i++) {
            for(int j = arr.length-1; j > i ; j-- ){
         if(arr[i]> arr[j]){
            int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        }
    }
    public static void print(int[]arr){
        System.out.print("排序后的数组为：" +"[");
        for (int i = 0; i <arr.length; i++) {

            if (i == arr.length-1 ) {
                System.out.println(arr[i] + "]");
            }else{
                System.out.print(arr[i] + ",");
            }
        }
    }
   /*public static void reverse(int[] arr){
       //利用循环,实现数组遍历,遍历过程中,最远端换位
       //for的第一项,定义2个变量, 最后,两个变量++ --
       for( int min = 0 , max = arr.length-1 ; min < max  ; min++,max--){
           //对数组中的元素,进行位置交换
           //min索引和max索引的元素交换
           //定义变量,保存min索引
           int temp = arr[min];
           //max索引上的元素,赋值给min索引
           arr[min] =  arr[max];
           //临时变量,保存的数据,赋值到max索引上
           arr[max] = temp;
       }
   }

    /*
       定义方法,实现功能
       返回值: void
       方法参数: 数组
    */
   /* public static void print(int[] arr){
        //输出一半中括号,不要换行打印
        System.out.print("[");
        //数组进行遍历
        for(int i = 0 ; i < arr.length ; i++){
            //判断遍历到的元素,是不是数组的最后一个元素
            //如何判断 循环变量 到达 length-1
            if( i == arr.length-1 ){
                //输出数组的元素和]
                System.out.print(arr[i]+"]");
            }else{
                //不是数组的最后一个元素,输出数组元素和逗号
                System.out.print(arr[i]+",");
            }
        }
        System.out.println();
    }*/
}




