package day19_Hash.demo;
/*
如果没有重写父类，每次运行结果都是不同整数
如果子类重写父类方法，哈希值就会变成自定义的
 哈希值是 存储到 HashSet集合存储的依据*/
public class Person {
   public int hashCode(){
       return 1;
   }
}
