package day2and4
		;

import java.util.Scanner;
public class  Squir
{//(6)���㳤���κ�Բ�ε����
	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		{
			System.out.println("�����볤�Ϳ�");
		int w = sc.nextInt();
		int h = sc.nextInt();
		squir(w , h);
		System.out.println("�þ��ε����Ϊ��" + squir(w , h));
		}
		System.out.println("������Բ�İ뾶��");
		double r =  sc.nextDouble();
		double �� = 3.1415926;
		squir( r , ��);
		System.out.println("Բ�����Ϊ��" + squir(r , ��));
}
		public static int squir(int w , int h){
			return w * h;
	}
	public static double squir(double r , double ��){
		return �� * r * r;
	}
}
