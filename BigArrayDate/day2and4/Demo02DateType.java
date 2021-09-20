package src;/*
强制类型转换
	1.特点：代码需要特殊格式处理，不能自动生成。
	2.格式：范围小的类型 范围小的变量名 = （范围小的类型） 原本范围大的是数据；
注意事项：
	1.强制类型转换一般不推荐使用，，因为可能发生精度损失，数据溢出。
	2.byte/short/char/这三种类型都可以发生数学运算，例如‘+’
	3.byte/short/char/这三种类型在运算的时候，都会被首先提升为int类型，然后再计算。
	4.bollean类型不能发生数据转换
	
	*/



public class  Demo02DateType
{
	public static void main(String[] args){
		//左边是int类型，右边是long类型，不一样。long---》int，不是从小到大，不能发生自动转换！
		//格式：范围小的类型 范围小的变量名 = （范围小的类型） 原本范围大的是数据；
		int num = (int)100L;
		System.out.println(num);
		//long强制转换成int类型
		int num2 = (int)6000000000L;
		System.out.println(num2);
	//double---->int,强制转换
		int num3 = (int)3.5;
		System.out.println(num3);//3，这并不是四舍五入，所有的小数位都会被舍弃掉
		char zifu1 = 'A';//这是一个字符型变量，里面是大写字母A
		System.out.println(zifu1 + 1);//98
		//计算机的底层会用一个数字（二进制)来代表字符A，就是65
		//一旦char类型进行了数学运算，那么字符会按照一定规则翻译成一个数字
			byte num4 = 40;//注意！右侧数值大小不能超过左侧的类型范围
			byte num5 = 50;
			//byte+byte-->int+int--->int
			int result1 =  num4 + num5;
			System.out.println(result1);//90
			short num6 = 60;
			//byte+byte-->int+int--->int
			short result2 = (short)(num4 +num6);
				//int 强制转换为short；注意必须保证逻辑上真实大小本来就没有超过short范围，否则会发生数据溢出
			System.out.println(result2);//100
	
	}
}
