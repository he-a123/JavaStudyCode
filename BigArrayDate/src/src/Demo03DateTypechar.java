package src;

public class Demo03DateTypechar
{
	/*
	数字和字符的对照关系表（编码表）；
ASC11码表；America Standard code for information interchange,美国信息交换标准码。
Unicode码表；万国码；也是数字和符号的对照关系，开头0---127部分和ASC11完全一样，但是从128开始包含更多字符。 
Emoije
48-’0‘
65-’A‘
97-’a‘*/
	public static void main(String[] args) 
	{
		char zifu1 = '1';
		System.out.println(zifu1 + 0);//49
		char zifu2 = 'A';
		char zifu3 = 'c';
		//左侧是int类型，右边是char类型，char----》int，是从小到大，发生了自动类型转换
		int num = zifu3;
			System.out.println(num);//99

			char zifu4 = '中';
			System.out.println(zifu4 +0);//20013

	}
}
