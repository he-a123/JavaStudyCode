package src;

/*
����byte/short/char����������˵������Ҳำֵ����ֵû�г�����Χ����ô�����������Զ�������Ϊ���ǲ���һ����byte��(short)(char).

1.���û�г������ķ�Χ������������ǿת
2.����Ҳ೬������෶Χ����ô������������
*/
public class Demo12Notice{
		public static void main(String[] args){
			//�Ҳ�ȷʵ��һ��int���֣���û�г�����෶Χ��������ȷ��
			//int->byte,�����Զ�����ת��
			
			byte num1 = 30;//�Ҳ�û�г������ķ�Χ
			System.out.println(num1);//30

			//byte num2= 128;//�Ҳ೬�������ķ�Χ

			//int----->char,û�г�����������Χ
			//�����������Զ�����һ�������ģ�char��
			char zifu = /*(char)*/65;
			System.out.println(zifu);//A


		}
}