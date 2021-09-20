package src;

import java.util.Random;
import java.util.Scanner;
public class GessNumber{
public static void main(String[] args){ 
	System.out.println("猜数字游戏开始！");
	System.out.print("请输入1~10之间的整数：");
	Random ran = new Random();
	
	Scanner sc = new Scanner(System.in);
	while(true){
		int Num1 = ran.nextInt(10)+1;
		int Num2 = sc.nextInt();
		//System.out.println(Num1);
		if (Num2 > Num1){
			System.out.println("猜大了");

		}else if(Num2 <  Num1){
			System.out.println("猜小了");
		}else{
			System.out.println("猜中了");
			break;
		}
	}
	}
}
