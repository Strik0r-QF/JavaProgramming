package InterfaceLearning.hspInterface;

public class InterfacePolyParameter {
    public static void main(String[] args) {
        IF if01 = new Monster();
        if01 = new Car();

        // 接口的多态体现
        // 接口类型的变量 if01 可以指向实现了 IF 接口的类的对象的实例

        // 继承体现的多态
        // 父类类型的变量 a 可以指向子类的实例
    }
}

interface IF {}

class Monster implements IF {}
class Car implements IF {}