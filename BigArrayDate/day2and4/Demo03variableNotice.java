package src;

public class Demo03variableNotice
{
	public static void main(String[] args) 
	{
		//ʹ�ñ�����ʱ����һЩע�����
		//1.������������������ô����֮������Ʋ������ظ���
		//2.����float��long������˵����ĸ��׺F��L��Ҫ����
		//3.���ʹ��byte��short���͵ı�������ô�Ҳ�����ݷ�Χ���ܳ���������͵ķ�Χ��
		//4.����һ��Ҫ�ȸ�ֵ������ʹ�á�û�и�ֵ�ı���������ֱ��ʹ�á�
		//5.������ʹ�ò��ܳ���������ķ�Χ
		//�������򡿣��Ӷ��������һ�п�ʼ��һֱ��ֱ�����������Ž���Ϊֹ��
		//6.����ͨ��һ������������������������һ��������Ƽ���ôд��
		int num1 = 10;//������һ���µı�������num1

		//int num1 = 20;  �ִ�����һ���µı���������Ҳ��num1������
		int num2 = 20;
		int num3;
		num3 = 30;
		int num4;//������һ������������û�н��и�ֵ
		//System.out.println(num4);ֱ��ʹ�ô�ӡ������Ǵ����
		//System.out.println(num5);//�ڴ����������֮ǰ������ʹ�����������ӡ

		int num5 = 500;
		System.out.println(num5);//500
		{
			int num6 = 60;
			System.out.println(num6);
		}
		//System.out.println(num6);//�Ѿ������˴����ŵķ�Χ�������������򣬱���������ʹ����
		//ͬʱ����������ȫ����int���͵ı���
		int a,b,c;
			 a = 10;
			 b = 20;
			 c = 30;
			System.out.println(a);
			System.out.println(b);
			System.out.println(c);
//ͬʱ��������int����������ͬʱ���Ը�ֵ
			int x = 100; int y = 200; int z = 300;
			System.out.println(x);
			System.out.println(y);
			System.out.println(z);
	}
}
 