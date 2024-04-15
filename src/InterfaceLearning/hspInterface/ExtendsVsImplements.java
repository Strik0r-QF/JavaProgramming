package InterfaceLearning.hspInterface;

public class ExtendsVsImplements {
    public static void main(String[] args) {
        LittleMonkey wuKong = new LittleMonkey("悟空");
        wuKong.climbing();
        wuKong.swimming();
    }
}

class Monkey {
    private String name;
    public Monkey(String name) {
        this.name = name;
    }
    public String getName() {
        return this.name;
    }
    public void climbing() {
        System.out.println(name+"会爬树....");
    }
}

class LittleMonkey extends Monkey implements Fishable {
    public LittleMonkey(String name) {
        super(name);
    }

    @Override
    public void swimming() {
        System.out.println(this.getName()+"学会了游泳....");
    }
}

interface Fishable {
    void swimming();
}

/**
 * 当子类继承了父类, 就自动拥有了父类的功能
 * 如果子类需要扩展功能, 可以通过实现接口的方式扩展
 * 实现接口是对 Java 单继承机制的补充
 *
 * 继承的主要价值在于: 解决代码的复用性和可维护性
 * 接口的价值在于: 设计好各种规范, 让其他类去实现这些方法, 使代码更加灵活
 *
 * 接口比继承更加灵活
 * 继承 is-a
 * 接口 like-a
 *
 * 接口在一定程度上实现代码解耦 (接口规范性+动态绑定) */