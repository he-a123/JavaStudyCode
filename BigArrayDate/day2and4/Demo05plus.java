package src;

public class  Demo05plus
{
	public static void main(String[] args) 
	{
		/*四则运算当中的加号“+”有常见的三种用法

		1. 对于数值来说，那就是加法。
		2.  对于字符串char类型来说，在计算之前，char会被提升成为int，然后在计算。
		3. 对于字符串String（首字母大写，不是关键字）来说，加号代表，加号代表字符串连接操作。
		任何数据类型和字符串进行连接的时候，结果都会变成字符串
		*/
		System.out.println("Hello World!");
		//字符串类型的变量基本使用
		//数据类型  变量名  = 数据值；
		String str1 = "hello";
		System.out.println(str1);//hello
		System.out.println("Hello" + " World!");
		String str2 = "java";
		//String + int -----> String
		System.out.println(str2 + 20);
		//优先级问题
		System.out.println(str2 + 20 + 30);//java2030
		System.out.println(str2 + (20+30));//java50

	}
}
