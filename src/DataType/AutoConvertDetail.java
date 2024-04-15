package DataType;

public class AutoConvertDetail {
    public static void main(String[] args) {
        int i1 = 10;
        double d1 = i1+1.1;
        float f1 = i1+1.1f; // 写 f1 = n1+1.1 是错误的, 因为 1.1 被编译器解读为 double 常量
        byte b1 = 114;
//        char c1 = b1; byte 不能自动转为 char
        short s1 = 1;
        int s2 = b1 + s1;
        byte b3 = 2;
        int b4 = b1 + b3; // byte b4 = b1+b3 是错的
    }
}
