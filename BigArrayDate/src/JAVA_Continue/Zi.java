package JAVA_Continue;

public class Zi extends Extends_Demo {
    @Override//表示重载关系
    /**
     * 方法覆盖重写的注意事项
     *
     * 1.必须保证父子类之间方法的名称相同，参数列表也相同
     * @voreride：写在方法前面，用来检测是不是有效的正确覆盖重写
     * 这个注解就算不写，只要满足要求，也是正确的方法覆盖重写
     *
     * 2.子类方法返回值必须小于等于父类方法的返回值范围
     * 小扩展提示：Java.lang.Object 类是所有类的公共最高父类
     *
     * 3.子类方法的权限必须大于等于父类的方法权限修饰符
     * 小扩展提示：
     * public>protected>(default)>private
     * 备注：（default）不是关键字default，而是什么都不写，留空就代表default权限
     * 
     */
    public Object Fu(){
        return null;
    }
}
