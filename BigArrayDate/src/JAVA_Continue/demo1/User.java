package JAVA_Continue.demo1;

public class User {
    private int money;
    private String name;
public void show(){
    System.out.println("我叫："+name+"，我还有："+money+"块");
}
    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /**
     * Constructs a new object.
     */
    public User() {
        super();
    }

    public User(int money, String name) {
        this.money = money;
        this.name = name;
    }
}
