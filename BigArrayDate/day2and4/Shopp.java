package src;/*
	实现商品库存清单案例
		步骤：
		1.实现表头，是固定数据，直接写出输出语句，soup
		2.表格中间，商品数据，采用变量形式定义变量，找对数据
		输出所有变量
		3.表格尾部，一部分数据固定
			另一部分商品数据进行数学计算，运算符
*/

public class  Shopp
{
	public static void main(String[] args) 
	{//表头输出固定数据
		System.out.println("-----------------------------商场库存清单-----------------------------");
		System.out.println("");
		System.out.println("   "+"品牌型号             尺寸               价格        库存数"  + "\t");
		System.out.println("");
		//定义表格中的数据变量
		String macBrand = "MacBookAir";
		double macSize = 13.3;
		double macPrice = 6988.88;
		int macCount = 5;
		System.out.println("   "+macBrand+"           "+macSize+"              "+macPrice +"        "+macCount+"\t");
		System.out.println("");
		String thinkBrand = "ThinkPadT450";
		double thinkSize = 14.0;
		double thinkPrice = 5999.99;
		int thinkCount = 10;
		System.out.println("   "+thinkBrand +"         "+ thinkSize+"              "+thinkPrice+"        "+thinkCount+"\t");
			System.out.println("");
		String asusBrand = "ASUS-FL5800";
		double asusSize = 15.6;
		double asusPrice = 4999.5;
		int asusCount = 18;
		System.out.println("   "+asusBrand+"          "+asusSize +"              "+asusPrice+"         "+asusCount+"\t");
		System.out.println("");
		int totalCount = macCount + thinkCount +asusCount;
		System.out.println("   总库存数 ： " + totalCount);
		System.out.println("");
		double totalPrice = macPrice*macCount + thinkPrice*thinkCount  + asusPrice*asusCount;
		System.out.println("   库存商品总金额 ：" + totalPrice);
		System.out.println("");
		System.out.println("---------------------------------------------------------------------");

	}
}
