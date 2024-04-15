package Singleton;

public class SingleTon02 {
}

// 在程序运行过程中只能养一只猫
class Cat {
    private String name;
    private static Cat cat;

    // 步骤
    // 1. 构造器私有化
    // 2. 定义一个静态属性
    // 3. 提供 public static 方法, 返回 cat 对象

    private Cat(String name) {
        this.name = name;
    }

    public static Cat getInstance() {
        if (cat == null) { // 如果没有创建 cat 对象
            cat = new Cat("小可爱");
        }
        return cat;
    }
}
