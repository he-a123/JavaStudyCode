package src;

class Demo02varible{
	
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
		//����һ������
		//��ʽ����������   ������
		
		int num1;
		//������д���һ������
		//��ʽ���������� =  ����ֵ��
		num1 = 10;
		System.out.println(num1);//10

		//�ı�������б��������֣�����µ�����

		num1 = 20;
		System.out.println(num1);//20

		//ʹ��һ����λ�ĸ�ʽ���������
		//��ʽ�� �������� �������� = ����ֵ
		int num2 = 25;
		System.out.println(num2);

		num2 = 35;
		System.out.println(num2);
	System.out.println("=============");
	
	byte num3 = 30; //ע���Ҳ���ֵ��Χ���ܳ��������������ȡֵ��Χ
	System.out.println(num3);//30
	//byte num4 = 400;  �Ҳ೬����byte��ȡֵ��Χ������

		short num5 = 50;
		System.out.println(num5);

		long num6 = 3000000L;
		System.out.println(num6);

		float num7 = 2.5F;
		System.out.println(num7);
		double num8 = 1.2;
		System.out.println(num8);
		
		char zifu1 =  'A';
		System.out.println(zifu1);
			zifu1 = '��' ;
		System.out.println(zifu1);

		boolean var1 = true;
		System.out.println(var1);
		
		var1 = false;
		System.out.println(var1);

		// ��һ���������������ݣ���ֵ������һ������
		//�Ҳ��������var1�Ѿ����ڣ�����װ����false����ֵ
		//���Ҳ������falseֵ�����󽻸�var2�������д洢
		boolean var2 = var1;
		System.out.println(var2);

	}
}