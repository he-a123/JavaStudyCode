package day2and4
		;

import java.util.Scanner;
public class  Squir
{//(6)计算长方形和圆形的面积
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("请输入长和宽：");
		int w = sc.nextInt();
		int h = sc.nextInt();
		squir(w , h);
		System.out.println("该矩形的面积为：" + squir(w , h));
		}
		System.out.println("请输入圆的半径：");
		double r =  sc.nextDouble();
		double Π = 3.1415926;
		squir( r , Π);
		System.out.println("圆的面积为：" + squir(r , Π));
}
		public static int squir(int w , int h){
			return w * h;
	}
	public static double squir(double r , double Π){
		return Π * r * r;
	}
}
