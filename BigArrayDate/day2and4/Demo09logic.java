package src;/*
�루���ң�&&		ȫ����true������true���������false
�򣨻��ߣ�||				ֻҪ������һ����true������true��ȫ����false������false
�ǣ�ȡ������			������true�����false��������false�����true
�롮&&������||�����ж�·Ч�������������߿����жϵõ����ս������ô�ұߴ��뽫����ִ�У��Ӷ���ʡһ��������

ע������
 1���߼������ֻ������booleanֵ
 2.�롢����Ҫ���Ҹ���һ��Booleanֵ������ȡ��ֻҪ��Ψһ��һ��Booleanֵ����
 3.�롢�����������������ж��ٸ���������������д
 ��������������A&&����B
*/


public class  Demo09logic
{
	public static void main(String[] args) 
	{
		System.out.println(true&&false);//false

		System.out.println(3<4&&10>5);//true
		System.out.println(true||false);//true
		System.out.println(true||true);//true
		System.out.println(false||false);//false
		System.out.println("===========");
		System.out.println(true);//
		System.out.println(!true);

		System.out.println("===========");
		int a = 10;
		//false && ...
		System.out.println(3<4 &&a++< 100);//false
		System.out.println(a);//10
		System.out.println("===========");
		

		int b =20;
		//
		System.out.println(3<4||++b<100);



	}
}
