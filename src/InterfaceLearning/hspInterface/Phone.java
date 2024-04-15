package InterfaceLearning.hspInterface;

// 类 Phone 实现接口 UsbInterface, 意味着它必需实现 UsbInterface 接口声明的方法
public class Phone implements UsbInterface { // 实现接口
    @Override
    public void start() {
        System.out.println("手机开始工作.");
    }

    @Override
    public void stop() {
        System.out.println("手机停止工作.");
    }
}
