package day07;

import java.util.ArrayList;

public class People {
	private String name;
	private int age;

	public People(String name, int age) {
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

	public void speak(){
		System.out.println("name="+this.name+",age="+this.age);

	}
	public boolean equalsAge(People p){
		/*if(p.getAge()==this.age){
			return ;
		}*/
		return this.age == p.getAge();
	}
}
class Demo{
	public static void main(String[] args) {
		People people = new People("张三",16);
		People people1 = new People("张4",17);
		People people2 = new People("张5",18);
		People people3 = new People("张6",17);
		People people4 = new People("张7",16);
		System.out.println(people.equalsAge(people1));
		ArrayList<People> list = new ArrayList<>();
		list.add(people);
		list.add(people4);
		list.add(people3);
		list.add(people2);
		list.add(people1);
		for (int i = 0; i < list.size(); i++) {
			for (int j = list.size()-1; j >=0; j--) {
				if(i==j){
					continue;
				}
				if (list.get(i).equalsAge(list.get(j))) {
					System.out.println(list.get(i).getName()+"与"+
							list.get(j).getName()+"同龄,年龄为："+list.get(i).getAge());
				break;
				}
			}
		}
	}
}
