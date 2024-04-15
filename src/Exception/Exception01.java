package Exception;

public class Exception01 {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;

        // num1 / num2 = 10 / 0
        // 执行到此处时程序会抛出异常 ArithmeticException
        // 当抛出异常后程序就崩溃了, 下面的代码不再执行
        // 这样的程序是不好的, 健壮性太差, 不应该出现一个不算致命的问题就导致系统崩溃
        // int res = num1 / num2;

        // 如果程序员认为一段代码可能出现异常, 则可以使用 try-catch 异常处理机制来解决:
        // 选中代码块、cmd+opt+T, 选中 try catch
        // 如果进行异常处理, 那么即使出现了异常, 程序也可以继续执行
        try {
            int res = num1 / num2;
        } catch (Exception e) {
//            throw new RuntimeException(e);
            System.out.println("异常原因: " + e.getMessage());
        }
        System.out.println("程序继续运行....");
    }
}
