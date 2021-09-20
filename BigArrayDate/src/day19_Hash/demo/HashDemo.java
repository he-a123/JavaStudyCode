package day19_Hash.demo;
/*
对象的哈希值，普通的十进制整数值
父类Object，方法public int hashCode（）计算结果为int整数
 */
public class HashDemo {
    public static void main(String[] args) {
        Person p = new Person();
        int i = p.hashCode();
        System.out.println(i);
        String s1 = new String("abc");
        String s2 = new String("abc");
        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
    }
}
