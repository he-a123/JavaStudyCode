package src;/*
do -whileѭ���ı�׼��ʽ

do{
ѭ����
}while�������жϾ䣩��

��չ��ʽ

��ʼ�����
do{
ѭ����
�������
}while�������жϾ䣩
*/


public class  Demo11While
{
	public static void main(String[] args) 
	{
		for (int i = 1;i <= 10 ;i ++ )
		{
			System.out.println("�Ҵ���");
		}
		System.out.println("==============");

		int i = 1;//��ʼ�����
		do
		{
			System.out.println("ԭ������");//3.ѭ����
			i++;//4.�������
		}
		while (i<=10);//2.�����ж�
		System.out.println("==============");
	}
}
