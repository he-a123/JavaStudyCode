package src;

/*
break�ؼ��ֵ��÷��г��������֣�

1.��������switch��䵱�У�һ��ִ�У�����switch������̽���
2.����������ѭ����䵱�У�һ��ִ�У�����ѭ��������̽��������ѭ��

����ѭ����ѡ����һ��С���飺
���Ǵ���ȷ����������forѭ�����������whileѭ��
*/
public class  Demo14Break
{
	public static void main(String[] args) 
	{
		for (int i = 1;i <= 10 ; i++ )
		{
			//���ϣ���ӵ��Ĵο�ʼ������ȫ����Ҫ�ˣ���Ҫ���ѭ��
			if (i == 4)
			{
				break;
			}
			System.out.println("�Բ�" + i);
		}
		
	}
}