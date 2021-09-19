package day06;

public class ExchangeClass {
	void Show(){
		System.out.println("政治");
	}
	void Fish(){
		System.out.println("钓鱼");
	}
}
class Exchange extends ExchangeClass{
	void Show(){
		super.Show();
		System.out.println("Java");
	}
	void Movies(){
		System.out.println("看电影");
	}
}

class Test{
	public static void main(String[] args) {
		ExchangeClass ExC = new Exchange();//多态
		ExC.Show();
		ExC.Fish();
		//当用到子类特有的功能时，就必须进行类型装换
		Exchange Ex = (Exchange) ExC;//向下转型
		Ex.Movies();
	}
}
