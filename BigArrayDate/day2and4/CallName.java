package src;

import java.util.Random;
public class  CallName{
	public static void main(String[] args) {
		String[] names = {"���� ","������ ","��ɯ ","��� ","äɮ ","ʨ�ӹ� ","��� ","ŵ�� ","�¶� ","ţͷ ","¶¶ ","è�� ","���� ","��ϣ ","Ůǹ ","С�� ","���� ","���� ","������ ","���� ","��Ī ","ǧ�� ","������"};
		for(int i = 0 ; i < names.length; i++){
			System.out.print(names[i]);
			}
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------");
			Random ran =  new Random();
			int index = ran.nextInt (names.length);

		System.out.println("��������ͬѧ�ǣ�" + names[index]);
	}
}
