package day2and4;

import java.util.Random;
import java.util.Scanner;
public class  ArrayDemo1
{//(5)��ӡnn�˷��� 
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Random ran = new Random();
		System.out.println("������˷������ֵ��");
		int n = sc.nextInt();
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		for (int i = n;i >= 1 ;i-- ){
		for ( int j = n ;j >= i ; j--){
		System.out.print( j + "x " + i + "=" +( i * j )+"\t");
		}
		System.out.println(" \r\n ");
		}
		System.out.println("--------------------------------------------------------------------------------------------------------------");
		int m = ran.nextInt(11);
		System.out.println("�������ֵΪ��" + m);
		arrCaculate(m);
	}
	public static void arrCaculate(int m){
		for (int i = 1;i <= m ;i++ ){
		for ( int j = 1 ;j <= i ; j++){
		System.out.print( j + "x " + i + "=" +( i * j )+"\t");
		}
		System.out.println("\r\n");
		}
		
	}
}
