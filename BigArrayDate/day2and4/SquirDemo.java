package src;

import java.util.Scanner;
public class SquirDemo
{//(4)��ӡm��n�е����ξ���
public static void main(String[] args) 
	{
	System.out.println("��������Ҫ��ӡ*����ĳ��Ϳ���");
		Scanner sc = new Scanner(System.in);	
		int m = sc.nextInt();
		int n = sc.nextInt();
		
		System.out.println("--------------------------------------");
		squir(m , n);
	}
	public static void squir(int m, int n){
	for (int i = 0;i < n; i++ ){
		for (int j = 0;j < m; j++ ){
	System.out.print(" * ");
	}
	System.out.println();
	}
	System.out.println("--------------------------------------");
	}
}