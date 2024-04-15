package InterfaceLearning.hspInterface;

public class InterfaceDetail02 {
}

interface IB {
    void f();
}
interface IC {
    void g();
}

// 接口不能继承其他的类, 但是可以继承多个别的接口
interface ID extends IB,IC {}

// 接口的修饰符只能是 public 或者默认, 与类的修饰符一样

class CC implements IB,IC {
    @Override
    public void f() {

    }

    @Override
    public void g() {

    }
}