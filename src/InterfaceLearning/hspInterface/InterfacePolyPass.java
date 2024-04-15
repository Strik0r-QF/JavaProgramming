package InterfaceLearning.hspInterface;

public class InterfacePolyPass {
    public static void main(String[] args) {
        IG ig = new Teacher();
        // 接口类型的变量可以指向实现了该接口的类的对象的实例

        IH ih = new Teacher();
        // 如果 IG 继承了 IH, 而 Teacher 类实现了接口 IG, 则相当于 Teacher 类实现了接口 IH.
        // 称为接口的多态传递现象
    }
}

interface IH {}
interface IG extends IH {}

class Teacher implements IG {}