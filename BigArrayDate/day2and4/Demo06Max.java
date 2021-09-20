package src;

//题目： 使用三元运算符和标准d的If-Else语句分别实现：取两个数字当中的最大值
public class  Demo06Max
{
	public static void main(String[] args) 
	{
		int a = 20;
		int b = 30;
		//首先使用三元运算符
		//int max = a > b ? a : b ;
		//使用if语句实现
		int max;
		if (a > b)
		{
			max = a;
		}
		else {
			max = b;
		}
		System.out.println("最大值：" + max);
	}
}
