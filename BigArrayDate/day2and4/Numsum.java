package src;

import java.util.Scanner;
public class Numsum{
public static void main(String[] args) 
	{//(1)键盘录入两个数据,求两个数据之和(整数和小数)
	 System.out.println("请输入想要求和的两个数字： ");
	Scanner sc =  new  Scanner(System.in);
	//Scanner sc1 =  new Scanner(System.in);
		{
	int a = sc.nextInt();
	int b = sc.nextInt();
	int num = Addnumber(a,b);
	System.out.println("输入的两个数的和是：" +num);
		}
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	double num1 = Addnumber1(a,b);
	System.out.println("输入的两个小数的和是：" +num1);
	}
	public static int Addnumber(int a, int b){
	return a + b;
}
	public static double Addnumber1(double a, double b){
	return a + b;
}
}