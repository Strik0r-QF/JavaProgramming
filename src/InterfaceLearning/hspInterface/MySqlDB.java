package InterfaceLearning.hspInterface;

public class MySqlDB implements DBInterface { // A 程序员
    @Override
    public void connect() {
        System.out.println("连接成功.");
    }

    @Override
    public void close() {
        System.out.println("关闭成功.");
    }
}
