package Abstract;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    // 这里实现 eat 方法其实没有什么意义, 存在父类方法的不确定性问题
    // 可以考虑将该方法设计为抽象 (abstract) 方法
    // 所谓抽象方法, 就是没有实现的方法;
    // 所谓没有实现, 就是没有方法体;
    // 当一个类中存在抽象方法时, 需要将该类声明为 abstract 类
    // 一般来说, 抽象类会被继承, 其抽象方法将由子类具体实现.

    // public void eat() {
    //     System.out.println("这是一个动物, 但是不知道吃什么...");
    // }

    public abstract void eat();
}
