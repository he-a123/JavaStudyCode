package src;

/*
�ڸ��������и�ֵ��ʱ������Ҳ���ʽ����ȫ���ǳ�����û���κα�������ô������javac��ֱ�ӽ����ɸ��������ʽ����õ������
short + result = 5+ 8;//�Ⱥ��ұ�ȫ���ǳ�����û���κα����������㡣����֮�󣬵õ��ġ�class�ֽ����ļ������൱��ֱ�Ӿ���
short result = 13;
�Ҳ�ĳ��������ֵ��û�г�����෶Χ��������ȷ��

���Ϊ���������ĳ����Ż�����
����ע�⣬һ�����ʽ���б������룬�ǾͲ��ܽ��������Ż���
*/
public class  Demo13Notice
{
	public static void main(String[] args) 
	{
		short num1 = 10;//��ȷд�����Ҳ�û�г������ķ�Χ
		short a = 5;
		short b = 8;
		//short + short -->int + int--
		//short result = a + b;//����д���������Ҫint����

		//�Ҳ಻�ñ������ǲ��ó��������Ҳ�������������û����Χ�����ᱨ��
		short result = 5 + 8;
		System.out.println(result);
		System.out.println("==============");
	}
}
