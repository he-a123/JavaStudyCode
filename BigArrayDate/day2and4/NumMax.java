package src;

import java.util.Scanner;
public class  NumMax
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("请输入想要比较的三个数字：");
			int a = sc.nextInt();
			int b = sc.nextInt();
			int c = sc.nextInt();
			max(a,b,c);
			System.out.println("第一次的比较结果为：" + max(a,b,c));
		}
		System.out.println("请输入三个想要比较的小数：");
		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		max(a,b,c);
		System.out.println("第二次的比较结果为：" + max(a,b,c));
	}
	public static int max(int a, int b, int c){
		int max = a > b ? a : b;
		int max1 = max > c ? max : c;
		return max1; 
	}
	public static double max(double a, double b,double c){
		double max = a > b ? a : b ;
		double max1 = max > c ? max : c;
		
		return  max1;//a > b ? a : b > c ? a > c ? a : b : c; 
}
}
