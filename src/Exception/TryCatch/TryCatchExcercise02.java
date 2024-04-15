package Exception.TryCatch;

import java.util.Scanner;

public class TryCatchExcercise02 {
    // 如果用户输入的不是一个整数就提示他反复输入, 直到输入的数为整数为止
    public static void main(String[] args) {
        // 1. 创建 Scanner 对象
        // 2. 使用无限循环接受输入
        // 3. 将输入的值转成 int
        // 4. 如果在转换时抛出异常则说明输入的内容不是一个可以转成 int 的内容
        // 5. 如果没有抛出异常, 则 break 该循环
        Scanner scannner = new Scanner(System.in);
        int num = 0;
        String inputStr = "";

        while (true) {
            System.out.println("请输入一个整数: ");
            inputStr = scannner.next();

            try {
                num = Integer.parseInt(inputStr);
                break;
            } catch (NumberFormatException e) {
                System.out.println("你输入的不是一个整数.");
            }
        }

        System.out.println("你输入的整数是: "+num);
    }
}
