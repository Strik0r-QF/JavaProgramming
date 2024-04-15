package InterfaceLearning.hspInterface;

public interface AInterface {
    // 写属性
    public int n1 = 10;
    // 写方法
    // 在接口中, 抽象方法可以省略 abstract 关键字
    public abstract void hi();

    // 在 jdk 8 后, 可以有默认实现方法, 需要使用 default 关键字修饰
    public default void ok() {
        System.out.println("ok...");
    }
    // 在 jdk 8 后, 可以有静态方法, 需要使用 static 关键字修饰
    public static void cry() {
        System.out.println("cry...");
    }
}
