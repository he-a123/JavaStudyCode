package src;/*
do -while循环的标准格式

do{
循环体
}while（条件判断句）；

扩展格式

初始化语句
do{
循环体
步进语句
}while（条件判断句）
*/


public class  Demo11While
{
	public static void main(String[] args) 
	{
		for (int i = 1;i <= 10 ;i ++ )
		{
			System.out.println("我错了");
		}
		System.out.println("==============");

		int i = 1;//初始化语句
		do
		{
			System.out.println("原谅你了");//3.循环体
			i++;//4.步进语句
		}
		while (i<=10);//2.条件判断
		System.out.println("==============");
	}
}
