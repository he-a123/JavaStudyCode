package src;

public class Demo03DateTypechar
{
	/*
	���ֺ��ַ��Ķ��չ�ϵ�������������
ASC11�����America Standard code for information interchange,������Ϣ������׼�롣
Unicode���������룻Ҳ�����ֺͷ��ŵĶ��չ�ϵ����ͷ0---127���ֺ�ASC11��ȫһ�������Ǵ�128��ʼ���������ַ��� 
Emoije
48-��0��
65-��A��
97-��a��*/
	public static void main(String[] args) 
	{
		char zifu1 = '1';
		System.out.println(zifu1 + 0);//49
		char zifu2 = 'A';
		char zifu3 = 'c';
		//�����int���ͣ��ұ���char���ͣ�char----��int���Ǵ�С���󣬷������Զ�����ת��
		int num = zifu3;
			System.out.println(num);//99

			char zifu4 = '��';
			System.out.println(zifu4 +0);//20013

	}
}