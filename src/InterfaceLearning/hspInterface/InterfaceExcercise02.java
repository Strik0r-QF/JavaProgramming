package InterfaceLearning.hspInterface;

public class InterfaceExcercise02 {
}

interface I2A {
    int x = 0; // 等价于 public static final int x = 0;
}

class I2B {
    int x = 1;
}

class I2C extends I2B implements I2A {
    public void pX(){
        // System.out.println(x); 错误, 不明确指的是哪一个 x
        System.out.println(I2A.x+" "+super.x);
        // 访问接口的 x 就用 I2A.x
        // 访问父类的 x 就用 super.x
    }

    public static void main(String[] args) {
        new I2C().pX();
    }
}
