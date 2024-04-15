package InterfaceLearning.hspInterface;

public class InterfaceExcercise01 {
    public static void main(String[] args) {
        B b = new B();
        System.out.println(b.a);
        System.out.println(IEA.a);
        System.out.println(B.a);
    }
}

interface IEA {
    int a = 23; // 等价于 public static final int a = 23;
}

class B implements IEA {}

