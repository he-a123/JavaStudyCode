package day05;

public class Hardware extends Maintainer{
    @Override
    public void Work() {
        System.out.println("员工号为："+getID()+"的"+getName()+"员工，正在开发淘宝手机客户端。");

    }

}
