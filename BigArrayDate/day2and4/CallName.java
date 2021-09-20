package src;

import java.util.Random;
public class  CallName{
	public static void main(String[] args) {
		String[] names = {"大树 ","卡萨丁 ","卡莎 ","螳螂 ","盲僧 ","狮子狗 ","光辉 ","诺手 ","奥恩 ","牛头 ","露露 ","猫咪 ","德玛 ","艾希 ","女枪 ","小炮 ","船长 ","赵信 ","辛德拉 ","兰博 ","提莫 ","千珏 ","奥拉夫"};
		for(int i = 0 ; i < names.length; i++){
			System.out.print(names[i]);
			}
			System.out.println();
			System.out.println("----------------------------------------------------------------------------------");
			Random ran =  new Random();
			int index = ran.nextInt (names.length);

		System.out.println("被点名的同学是：" + names[index]);
	}
}
