package src;

public class  Demo01DateType
{
	/*���������Ͳ�һ��ʱ�����ᷢ����������ת��
	�Զ�����ת������ʽ��
		1.�ص㣺���벻��Ҫ�������⴦�����Զ����ɡ�
		2.�������ݷ�Χ��С����
	ǿ������ת������ʽ��
	*/
	public static void main(String[] args) 
	{
		System.out.println(1024);//�����һ��������Ĭ��int����
		System.out.println(3.14);//�����һ����������Ĭ�Ͼ���double����
		//�����long���ͣ��ұ���Ĭ�ϵ�int����
		//һ���ȺŴ�����ֵ���ұ���Ĭ�ϵ�int���ͣ����Ҳ�һ��
		//int-------��long�����������ݷ�Χ��С�����Ҫ��
		//��һ�д��뷢�����Զ�����ת����
		long num1 = 1001;
		System.out.println(num1);
	//�����double���ͣ��ұ���float���ͣ����Ҳ�һ��
	//float------��double ���ϴ�С����Ĺ���
	//Ҳ�������Զ�ת��
		double num2 =  2.5F;
		System.out.println(num2);
		//�����float���ͣ��ұ���long���ͣ����Ҳ�һ��
		//long-----��float����Χ��float����һЩ�����ϴ�С����Ĺ���
		//Ҳ�������Զ�����ת��
		float num3 = 30L;
			System.out.println(num3);//30.0
		

	}
}