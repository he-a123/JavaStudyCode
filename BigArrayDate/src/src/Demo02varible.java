package src;

class Demo02varible{
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//创建一个变量
		//格式；数据类型   变量名
		
		int num1;
		//向变量中存入一个数据
		//格式：变量名称 =  数据值；
		num1 = 10;
		System.out.println(num1);//10

		//改变变量当中本来的数字，变成新的数字

		num1 = 20;
		System.out.println(num1);//20

		//使用一步到位的格式来定义变量
		//格式： 数据类型 变量名称 = 数据值
		int num2 = 25;
		System.out.println(num2);

		num2 = 35;
		System.out.println(num2);
	System.out.println("=============");
	
	byte num3 = 30; //注意右侧数值范围不能超过左侧数据类型取值范围
	System.out.println(num3);//30
	//byte num4 = 400;  右侧超出了byte的取值范围，错误！

		short num5 = 50;
		System.out.println(num5);

		long num6 = 3000000L;
		System.out.println(num6);

		float num7 = 2.5F;
		System.out.println(num7);
		double num8 = 1.2;
		System.out.println(num8);
		
		char zifu1 =  'A';
		System.out.println(zifu1);
			zifu1 = '中' ;
		System.out.println(zifu1);

		boolean var1 = true;
		System.out.println(var1);
		
		var1 = false;
		System.out.println(var1);

		// 将一个变量的数据内容，赋值交给另一个变量
		//右侧变量名称var1已经存在，里面装的是false布尔值
		//将右侧里面的false值，向左交给var2变量进行存储
		boolean var2 = var1;
		System.out.println(var2);

	}
}
