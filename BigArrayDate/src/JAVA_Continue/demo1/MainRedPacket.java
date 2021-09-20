
package JAVA_Continue.demo1;

import java.util.ArrayList;

public class MainRedPacket {
    public static void main(String[] args) {
        Manger manger = new Manger(100,"群主");
        Member one = new Member(100,"成员A");
        Member two= new Member(100,"成员B");
        Member three = new Member(100,"成员C");
        manger.show();
        one.show();
        two.show();
        three.show();
        System.out.println("---------------");
        ArrayList<Integer> redList =  manger.send(20,3);
        //三个普通成员收红包
        one.receive(redList);
        two.receive(redList);
        three.receive(redList);


        one.show();
        two.show();
        three.show();
        manger.show();

    }
}
