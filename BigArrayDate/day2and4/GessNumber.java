package src;

import java.util.Random;
import java.util.Scanner;
public class GessNumber{
public static void main(String[] args){ 
	System.out.println("��������Ϸ��ʼ��");
	System.out.print("������1~10֮���������");
	Random ran = new Random();
	
	Scanner sc = new Scanner(System.in);
	while(true){
		int Num1 = ran.nextInt(10)+1;
		int Num2 = sc.nextInt();
		//System.out.println(Num1);
		if (Num2 > Num1){
			System.out.println("�´���");

		}else if(Num2 <  Num1){
			System.out.println("��С��");
		}else{
			System.out.println("������");
			break;
		}
	}
	}
}
