package src;

public class TuZi
{
	//兔子的规律数列1，1，2，3，5，8，13，21，.....
  public static void main(String[] args) 
	{
	  int a = 1;
		System.out.println("第" +  a + "个月兔子数量"  + sun (a));

	}
	private static int sun(int a){
		if(a==1|| a ==2)
			return 1;
		else
			return sun(a-1) + sun(a-2);
	}
}
