package src;

import java.util.Scanner;
public class Numsum{
public static void main(String[] args) 
	{//(1)����¼����������,����������֮��(������С��)
	 System.out.println("��������Ҫ��͵��������֣� ");
	Scanner sc =  new  Scanner(System.in);
	//Scanner sc1 =  new Scanner(System.in);
		{
	int a = sc.nextInt();
	int b = sc.nextInt();
	int num = Addnumber(a,b);
	System.out.println("������������ĺ��ǣ�" +num);
		}
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double num1 = Addnumber1(a,b);
	System.out.println("���������С���ĺ��ǣ�" +num1);
	}
	public static int Addnumber(int a, int b){
	return a + b;
}
	public static double Addnumber1(double a, double b){
	return a + b;
}
}