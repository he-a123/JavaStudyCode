package src;

public class  Demo05plus
{
	public static void main(String[] args) 
	{
		/*�������㵱�еļӺš�+���г����������÷�

		1. ������ֵ��˵���Ǿ��Ǽӷ���
		2.  �����ַ���char������˵���ڼ���֮ǰ��char�ᱻ������Ϊint��Ȼ���ڼ��㡣
		3. �����ַ���String������ĸ��д�����ǹؼ��֣���˵���ӺŴ����ӺŴ����ַ������Ӳ�����
		�κ��������ͺ��ַ����������ӵ�ʱ�򣬽���������ַ���
		*/
		System.out.println("Hello World!");
		//�ַ������͵ı�������ʹ��
		//��������  ������  = ����ֵ��
		String str1 = "hello";
		System.out.println(str1);//hello
		System.out.println("Hello" + " World!");
		String str2 = "java";
		//String + int -----> String
		System.out.println(str2 + 20);
		//���ȼ�����
		System.out.println(str2 + 20 + 30);//java2030
		System.out.println(str2 + (20+30));//java50

	}
}
