package src;

/*
switch���ʹ�õ�ע�����

1.���case��ߵ���ֵ�������ظ���

2.switch ��ߵ�С���ŵ���ֻ���������������ͣ�
�����������ͣ�byte/short/char/int
�����������ͣ�String�ַ�����enumö��

3.switch ����ʽ���Ժ���ǰ��˳����Եߵ�������break��仹����ʡ��
��ƥ����һ��case�ʹ��ĸ�λ������ִ�У�ֱ��������break�����������Ϊֹ��
*/
public class  Demo08SwitchNotice
{
	public static void main(String[] args) 
	{
		int num = 1;
		switch (num)
		{
		case  1 :
		System.out.println("���");
		break;
		case  2 :
		System.out.println("�Һ�");
		break;
		case  3 :
		System.out.println("��Һ�");
		break;
		default :
			System.out.println("���ã���Ҳ��");
		break;
		}
		
	}
}
