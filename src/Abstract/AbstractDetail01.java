package Abstract;

public class AbstractDetail01 {
    public static void main(String[] args) {
        // new A(); 抽象类不能被实例化
    }
}

abstract class A {
    // 抽象类不一定要有 abstract 方法, 也可以有实现了的方法
    // 一旦方法被声明为 abstract, 则该类必须被声明为 abstract
    // abstract 只能修饰类和方法
    // 抽象类还是类, 可以有任意成员, 例如非抽象方法、构造器、静态属性等
    // 抽象方法不能有方法体
    // 一个类继承了抽象类, 则它必须实现抽象类的所有抽象方法, 除非它自己也声明为抽象类
}

abstract class D {
    int n1 = 10;
    static String name = "钱锋";

}