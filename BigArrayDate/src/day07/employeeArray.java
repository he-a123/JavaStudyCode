package day07;

import java.util.ArrayList;

public class employeeArray {
    public static void main(String[] args) {
        ArrayList<Employee> array = new ArrayList<Employee>();
        addArrayList(array);
        printArrayList(array);

    }
    public static void addArrayList(ArrayList<Employee>array){
       Employee e1 = new Employee();
       Employee e2 = new Employee();
       Employee e3 = new Employee();
       e1.name = "亚瑟";
       e1.number = 89654263;
       e1.salary = 8000.0;
        e2.name = "王昭";
        e2.number = 99654263;
        e2.salary = 9000.0;
        e3.name = "李白";
        e3.number = 79654263;
        e3.salary = 7000.0;
        array.add(e1);
        array.add(e2);
        array.add(e3);
    }
    public static void printArrayList(ArrayList<Employee>array){
        System.out.println("姓名       工号           工资");
        for (int i = 0; i < array.size(); i++) {
            System.out.println(array.get(i).name +"      "+
                    array.get(i).number+"       "+ array.get(i).salary);
        }
    }
}
