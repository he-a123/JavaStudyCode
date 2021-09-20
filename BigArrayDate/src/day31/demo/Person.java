package day31.demo;

public class Person {
    public int age;
    public String name;
    private double sex;
    public Person(){}
/*static {
    System.out.println("静态代码块");

}*/
    public  void eat(){
        System.out.println("人在吃饭");
    }
    public void sleep(int age, String name,double sex){
        System.out.println("睡觉奥"+age +name + sex);
    }
    public Person(int age, String name, double sex) {
        this.age = age;
        this.name = name;
        this.sex = sex;
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

    public double getSex() {
        return sex;
    }

    public void setSex(double sex) {
        this.sex = sex;
    }


    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                '}';
    }
}
