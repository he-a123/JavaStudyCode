package src;/*
与（并且）&&		全都是true，才是true；否则就是false
或（或者）||				只要有至少一个是true，就是true，全都是false，才是false
非（取反）！			本来是true，变成false，本来是false，变成true
与‘&&’，或‘||’具有短路效果；如果根据左边可以判断得到最终结果，那么右边代码将不再执行，从而节省一定的性能

注意事项
 1。逻辑运算符只能用于boolean值
 2.与、或需要左右各有一个Boolean值，但是取反只要有唯一的一个Boolean值即可
 3.与、或两种运算符，如果有多少个条件，可以连续写
 两个条件：条件A&&条件B
*/


public class  Demo09logic
{
	public static void main(String[] args) 
	{
		System.out.println(true&&false);//false

		System.out.println(3<4&&10>5);//true
		System.out.println(true||false);//true
		System.out.println(true||true);//true
		System.out.println(false||false);//false
		System.out.println("===========");
		System.out.println(true);//
		System.out.println(!true);

		System.out.println("===========");
		int a = 10;
		//false && ...
		System.out.println(3<4 &&a++< 100);//false
		System.out.println(a);//10
		System.out.println("===========");
		

		int b =20;
		//
		System.out.println(3<4||++b<100);



	}
}
