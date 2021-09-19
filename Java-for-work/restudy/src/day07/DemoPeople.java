package day07;

public class DemoPeople {
	private String name;
	private int age;

	public DemoPeople(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}
 class Student extends DemoPeople{
	Student(String name,int age){
		super(name,age);
	}
	public void study(){
		System.out.println(this.getName()+"在学习");
	}
}
class Worker extends DemoPeople{
	Worker(String name,int age){
		super(name,age);
	}
	public void work(){
		System.out.println(this.getName()+"在工作");
	}
}
class Demo2{
	public static void main(String[] args) {
		Student student = new Student("张三",15);
		student.study();
		Worker worker = new Worker("王麻子",26);
		worker.work();
	}
}
