package src;

public class  ChengFaBiao
{
	/*public static void main(String[] args) 
	{
		for(int i = 1; i <= 9 ; i ++){
			for(int j = 1 ; j <=i ; j ++){
				System.out.print( j + "x"  + i  +  "="  + ( i *j ) + "\t");
			}
		System.out.print("\r\n");
			}

	}
}*/
public static void main(String[]args){
	for(int a = 9;a >=1; a --){
		for (int b = 9;b >=(10- a) ; b-- ){
			System.out.print(a + "x" + b + "=" + (a*b) + "\t" );
		}
		System.out.print("\r\n");
		}
	}
}