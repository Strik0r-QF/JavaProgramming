package InterfaceLearning.hspInterface;

public class InterfaceDetails01 {
    public static void main(String[] args) {
        // new IA(); 错误, 接口不能被实例化
    }
}


interface IA {
    // 接口中的所有方法都是 public 方法, 接口中的抽象方法可以不用 abstract 修饰
    public abstract void f();
    void g();
}

class CA implements IA {
    // 一个普通类实现接口, 可以用 generate 代码功能来生成代码以减少无效工作
    @Override
    public void f() {

    }

    @Override
    public void g() {

    }
}

abstract class CB implements IA {
    // 抽象类实现接口时可以不实现接口的抽象方法
}
