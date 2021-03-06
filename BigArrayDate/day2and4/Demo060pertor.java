//package src;

/*
自增运算符： ++
自减运算符： --

基本含义：让一个变量涨一个数字1，或者让一个变量降一个数字1
使用格式：在变量名称之前，或者写在变量名称之后。例如：++num，也可以num++
使用方式：
		1.单独使用：不和其他任何操作混合，自己独立成为一个步骤。
		2混合使用：和其他操作混合，例如与赋值混合，或者与打印操作混合，等
		使用区别：
				1：再单独使用的时候，前++和后++没有任何区别。也就是：++num 和num++；是完全一样的。
				2.在混合的时候，有【重大区别】
						A：如果是前++，那么变量立刻马上+1，然后拿着结果进行使用。【先加后用】
						B：如果是后++，那么先使用变量本来的数值，然后再让变量+1【先用后加】*/
/*public class  Demo060pertor
{
	public static void main(String[] args) 
	{
		int num1 = 10;
		System.out.println(num1);//10
		++num1;//单独使用前加加
		System.out.println(num1);
		num1++;//单独使用后++
		System.out.println(num1);//12
		System.out.println("======================");
		//与打印操作混合的时候
		int num2 = 20;
		//  混合使用，先++，变量立刻马上变成21，然后打印结果21
		System.out.println(++num2);//21
		System.out.println(num2++);//21
		System.out.println("===========");
		int num3 = 30;
		//混合使用，后++，首先使用变量本来的30，再让变量加1，变成31
		System.out.println(num3++);//30
		System.out.println(++num3);//31
		System.out.println("===============");
			int num4 = 40;
			//和赋值混合
			int result1 = --num4;//混合前，前--，变量立刻马上-1变39，然后结果39交给result变量
			System.out.println(result1);
			System.out.println(num4);
			System.out.println("==============");


			int x = 10;
			int y = 20;
			int result2 = ++x + y--;
			System.out.println(result3);
			System.out.println(x);
			System.out.println(y);
			System.out.println("============");
			int num5 = 50;
			//混合使用，后--，首先把本来的数字交给result2，然后自己再-1变49
			int result3 = num5--;
			System.out.println(result3);
			System.out.println(num5);

	}
}*/
