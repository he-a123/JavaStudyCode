package src;/*
��ֵ�������Ϊ��
������ֵ�����������һ���Ⱥš�=���������Ҳ��������������
int a = 30��
���ϸ�ֵ�������
+=		a+=3		�൱��		a= a+3
-=			b-=4		�൱��		b=b-4
*=		c*=5		�൱��		c=c*5
/=			d/=6				�൱��	d=d/6
%=		e%=7		�൱��		e=e%7

ע������
1.ֻ�б�������ʹ�ø�ֵ��������������ܸ�ֵ
2.���ϸ�ֵ���������������һ��ǿ������ת��
*/


public class  Demo070preater
{
	public static void main(String[] args) {
		int a = 10;
		a+=5;
	System.out.println(a);
	int x = 10;
	x %= 3;
	System.out.println(x);

	byte num = 30;
	//num = num +5
	//num = byte +int
	//num = int + int
	//num = int
	//num = (byte)int
		num +=5;
		System.out.println(num);
		
	}
}
