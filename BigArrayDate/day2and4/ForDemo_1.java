package src;

public class ForDemo_1
{
	public static void main(String[] args) 
	{
	/*	long sum = 0;
		for(long i = 1; i <=100000000000L; i ++){
			sum+=i;
		}
		System.out.println(sum);*/
		long sum = 0;
		long i = 1;
		long j = 1;
		
		while(i<=100){
			j = i +1;
			j ++;
			 i++;
			 sum = j + i;
		System.out.print(" " + i + " + "  +  j +"  = " +  sum + " ");
		}
		System.out.println("\r\n");
	}
}
