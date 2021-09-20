package day25_IO.demo1;

import java.io.Serializable;

public class Person implements Serializable {
    public String name ;
    public /* transient 阻止成员变量序列化*/int age;
    //类自己定义了序列号，编译器不会再去计算序列号
    private static final long serialVersionUID = 12345345L;//固定语句，
    // 只有后边序列号可改
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

    /**
     * Constructs a new object.
     */
    public Person() {

    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
