package InterfaceLearning.hspInterface;

public class Computer {
    // 编写一个方法, 计算机工作
    // 解读:
    // 1. UsbInterface usbInterface 形式参数是接口类型 UsbInterface
    // 2. 接受实现了接口 UsbInterface 的类的实例
    public void work(UsbInterface usbInterface) {
        // 通过接口来调用方法
        usbInterface.start();
        usbInterface.stop();
    }
}
