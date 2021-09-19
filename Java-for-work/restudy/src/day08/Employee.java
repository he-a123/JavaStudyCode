package day08;

public class Employee {
	private String name;
	private String number;
	Employee(){
		super();
	}

	public Employee(String name, String number) {
		this.name = name;
		this.number = number;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}
}
class Developer extends Employee{
	Developer(){
		super();
	}
	Developer(String name,String number){
		super(name,number);
	}
}
class Maintainer extends Employee{
	Maintainer(){super();}
	Maintainer(String name, String number){
		super(name,number);
	}
}
class JavaEE extends Developer{
	JavaEE(){
		super();
	}
	JavaEE (String name ,String number){
		super(name,number);
	}
	public void work(){
		System.out.println("JavaEE工程师：员工号为"+
				this.getNumber()+"的"+this.getName()+
				"员工，正在开发淘宝网站。");
	}
}
class Android extends Developer{
	Android(){super();}
	Android(String name,String number){
		super(name,number);
	}
	public void work(){
		System.out.println("Android工程师：员工号为"
				+this.getNumber()+"的"+this.getName()+
				"员工，正在开发淘宝手机客户端。");

	}
}
class Network extends Maintainer {
	Network(){super();}
	Network(String name,String number){
		super(name,number);
	}
	public void work(){
		System.out.println("网络维护工程师：员工号为"
				+this.getNumber()+"的"+this.getName()+
				"员工，正在检查网络是否畅通。");

	}

}
class Hardware extends Maintainer {
	Hardware(){super();}
	Hardware(String name,String number){
		super(name,number);
	}
	public void work(){
		System.out.println("硬件维护工程师：员工号为"+
				this.getNumber()+"的"+this.getName()+
				"员工，正在修复打印机。");

	}

}
class Demo{
	public static void main(String[] args) {
		JavaEE javaEE = new JavaEE("李刚","987564");
		Android android = new Android("李四","987164");
		Network network = new Network("狗蛋","6352015");
		Hardware hardware = new Hardware("盖伦","63102015");
	javaEE.work();
	android.work();
	network.work();
	hardware.work();

	}
}