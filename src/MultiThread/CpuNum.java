package MultiThread;

public class CpuNum {
    public static void main(String[] args) {
        Runtime runtime = Runtime.getRuntime();
        // 获取当前电脑的 CPU 核心数量
        int cpuNum = runtime.availableProcessors();

        System.out.println("本设备的 CPU 核心数: "+cpuNum+".");
    }
}
