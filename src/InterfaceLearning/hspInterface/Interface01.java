package InterfaceLearning.hspInterface;

public class Interface01 {
    public static void main(String[] args) {
        // 创建手机、相机对象
        Camera camera = new Camera();
        Phone phone = new Phone();

        // 创建计算机
        Computer computer = new Computer();

        // 把手机接入到计算机
        computer.work(phone);
        System.out.println("===========");

        // 把相机接入到计算机
        computer.work(camera);
    }
}
