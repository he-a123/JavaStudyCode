package src;

//��Ŀ�� ʹ����Ԫ������ͱ�׼d��If-Else���ֱ�ʵ�֣�ȡ�������ֵ��е����ֵ
public class  Demo06Max
{
	public static void main(String[] args) 
	{
		int a = 20;
		int b = 30;
		//����ʹ����Ԫ�����
		//int max = a > b ? a : b ;
		//ʹ��if���ʵ��
		int max;
		if (a > b)
		{
			max = a;
		}
		else {
			max = b;
		}
		System.out.println("���ֵ��" + max);
	}
}
