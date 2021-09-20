package src;/*
赋值运算符分为：
基本赋值运算符：就是一个等号‘=’，代表将右侧变量交给左侧变量
int a = 30；
复合赋值运算符：
+=		a+=3		相当于		a= a+3
-=			b-=4		相当于		b=b-4
*=		c*=5		相当于		c=c*5
/=			d/=6				相当于	d=d/6
%=		e%=7		相当于		e=e%7

注意事项
1.只有变量才能使用赋值运算符，常量不能赋值
2.复合赋值运算符其中隐含了一个强制类型转换
*/


public class  Demo070preater
{
	public static void main(String[] args) {
		int a = 10;
		a+=5;
	System.out.println(a);
	int x = 10;
	x %= 3;
	System.out.println(x);

	byte num = 30;
	//num = num +5
	//num = byte +int
	//num = int + int
	//num = int
	//num = (byte)int
		num +=5;
		System.out.println(num);
		
	}
}
