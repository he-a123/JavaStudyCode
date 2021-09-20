package src;

class SjxDemo
	{
	public static void main(String[]args){
		print99(2,2);
		print99(3,3);
		print99(10,10);
	System.out.println(add(1,1));
	out("*"+"*"+"*" +"*"+ "*"+ "*"+ "*" +"*");
}
	/*打印99乘法表，定义函数*/
	public static void print99(int x,int y){
		for(int i = 1;i <= x ; i ++){
			for(int j = 1;j <= y; j ++){
				System.out.print("*" + "*" + "*" + "*" + "*" + "\t");
		}
		System.out.println();
		}
		System.out.println();
  		}
	public static int add(int a,int b){
		return a + b;
	}
	public static void out(String str){
		System.out.println(str);
	}
	//变长参数
	public static int sum(int...args){
		int temp = 0;
		for(int i = 0;i < args.length;i ++){
			temp = temp + args[i] ;
	}
		return temp ;
      
	}
  }