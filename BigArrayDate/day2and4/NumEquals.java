package src;

import java.util.Scanner;
public class NumEquals
{
	//����¼����������,�ж����������Ƿ����(������С��
public static void main(String[] args) 
	{
		System.out.println("��������Ҫ�Ƚϵ�������");
	Scanner sc = new Scanner(System.in);
	{
	int a = sc.nextInt();
	int b = sc.nextInt();
	equals(a , b);
	System.out.println("��һ�αȽϽ��Ϊ��" + equals(a , b));
	}
	{
	System.out.println("��������Ҫ�Ƚϵ�С����");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	equals(a , b);
	System.out.println("�ڶ��αȽϽ��Ϊ��" + equals(a , b));
	}
	}
	public static boolean equals(int a, int b){
	return a == b;
}
	public static boolean equals(double a , double b){
		return a == b ;
	}
}