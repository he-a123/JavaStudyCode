package day18_Iterator;

public class Person {
    private int age;
    private  String name ;



    public String toString() {
        return "ArrayList{" +
                "年龄=" + age +
                ", 姓名='" + name + '\'' +
                '}';
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public Person(){}
    public Person(String name, int age){
        super();
        this.age= age;
        this.name= name;
    }
}
