package src;

import java.util.Scanner;
public class NumEquals
{
	//键盘录入两个数据,判断两个数据是否相等(整数和小数
public static void main(String[] args) 
	{
		System.out.println("请输入想要比较的整数：");
	Scanner sc = new Scanner(System.in);
	{
	int a = sc.nextInt();
	int b = sc.nextInt();
	equals(a , b);
	System.out.println("第一次比较结果为：" + equals(a , b));
	}
	{
	System.out.println("请输入想要比较的小数：");
	double a = sc.nextDouble();
	double b = sc.nextDouble();
	equals(a , b);
	System.out.println("第二次比较结果为：" + equals(a , b));
	}
	}
	public static boolean equals(int a, int b){
	return a == b;
}
	public static boolean equals(double a , double b){
		return a == b ;
	}
}
