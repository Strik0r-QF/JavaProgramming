package InterfaceLearning.hspInterface;

public class Interface02 {
}

// 如果一个类 Implements 一个接口, 则需要将该接口的所有抽象方法都实现
class A implements AInterface {
    @Override
    public void hi() {
        System.out.println("hi....");
    }
}