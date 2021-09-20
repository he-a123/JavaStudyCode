package src;

class ShiftDemo
	{
	public static void main(String[] args) 
		{
		//×óÒÆ--x2^n
		System.out. println(3<<2);
		System.out. println(3<<3);
		System.out. println(3<<4);
		System.out. println(3<<5);
		//ÓÒÒÆ£¨ÓÐ·ûºÅÒÆ¶¯£©
		System.out. println(3>>1);
		System.out. println(3>>2);
		System.out. println(3>>3);


		System.out. println(-3>>1);
		
		//ÎÞ·ûºÅÒÆ¶¯int 4*8=32
		System.out. println(((byte)((byte)-3)>>>1));
		System.out. println(-3/2);

		//ÈýÔªÔËËã·û

		System.out. println(2 > 3 ? "aaaaa": "bbbbb");
		int a =300 ,b = 200;
		System.out. println(a < b ? b:a);
	
		//getMax

		int temp;
		if(a < b){
			temp = b;
		System.out. println(temp);
		}
		else{
			temp = a;
		System.out. println(temp);
		}
		int x = 1;
		switch(x){
			case 1:
				System.out. println("1");
				break;
				case 2:
				System.out. println("2");
				case 3:
				System.out. println("3");
				case 4:
				System.out. println("4");
				case 5:
				System.out. println("5");
		}
		
		
		
			
		}
	}



