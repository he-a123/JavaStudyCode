package src;/*
	ʵ����Ʒ����嵥����
		���裺
		1.ʵ�ֱ�ͷ���ǹ̶����ݣ�ֱ��д�������䣬soup
		2.����м䣬��Ʒ���ݣ����ñ�����ʽ����������Ҷ�����
		������б���
		3.���β����һ�������ݹ̶�
			��һ������Ʒ���ݽ�����ѧ���㣬�����
*/

public class  Shopp
{
	public static void main(String[] args) 
	{//��ͷ����̶�����
		System.out.println("-----------------------------�̳�����嵥-----------------------------");
		System.out.println("");
		System.out.println("   "+"Ʒ���ͺ�             �ߴ�               �۸�        �����"  + "\t");
		System.out.println("");
		//�������е����ݱ���
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
		System.out.println("   �ܿ���� �� " + totalCount);
		System.out.println("");
		double totalPrice = macPrice*macCount + thinkPrice*thinkCount  + asusPrice*asusCount;
		System.out.println("   �����Ʒ�ܽ�� ��" + totalPrice);
		System.out.println("");
		System.out.println("---------------------------------------------------------------------");

	}
}
