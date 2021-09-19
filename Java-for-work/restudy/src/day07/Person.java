package day07;

import java.util.ArrayList;

public class Person {
	private String name;
	private int age;

	public Person() {
	}

	public Person(String name, int age) {
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

	@Override
	public String toString() {
		return "同学" + name +
				"的年龄为：" + age ;
	}
}
class test{
	public static void main(String[] args) {
		Person person= new Person("张三",18);
		Person person1= new Person("李四",28);
		Person person2= new Person("王麻子",18);
		Person person3= new Person("张麻子",18);
		System.out.println(person.toString());
		System.out.println(person1.toString());
		System.out.println(person2.toString());
		System.out.println(person3.toString());
		ArrayList<Person> list = new ArrayList<>();
		list.add(person);
		list.add(person1);
		list.add(person2);
		list.add(person3);
		for (int i = 0; i < list.size(); i++) {
			for (int j = 0; j < list.size(); j++) {
			if(j==i){
				continue;
			}
			if(list.get(i).getAge()==list.get(j).getAge()){
				System.out.println("同学"+list.get(i).getName()+
						"与同学"+list.get(j).getName()+"属于同龄人！");

			}
			}

		}



	}
}
