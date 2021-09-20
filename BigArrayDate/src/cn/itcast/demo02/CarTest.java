package cn.itcast.demo02;

public class CarTest {
    private String name;
    private int age;

    public CarTest(String name) {
        this.name = name;
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

    public CarTest(String name, int age) {
        this.name = name;
        this.age = age;


    }
}