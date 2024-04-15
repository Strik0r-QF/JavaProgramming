package MultiThread;

// 通过继承 Thread 类创建线程
public class ThreadUsage {
    public static void main(String[] args) {
        // 创建一个 Cat 对象, 可以当作线程使用
        var cat = new Cat();

        // 启动线程
        cat.start();
    }
}

/**
 * 当一个类继承了 Thread 类, 该类就可以当作线程使用
 * 重写 run() 方法, 实现自己的业务逻辑
 * Thread 类实现了 Runnable 接口的 run() 方法 */

class Cat extends Thread {
    @Override
    public void run() { // 重写 run 方法
        var times = 0;
        while (true) {
            System.out.println("喵喵, 我是小喵咪 " + (++times));

            // 让该线程休眠一秒钟
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            if (times == 16) break; // 当 times == 80 是退出 while.
        }
    }
}