package cn.edu.nwpu.software.strik0r.complex;

import java.util.Arrays;

public class ComplexTest {
    public static void main(String[] args) {
        // 创建一些复数对象
        Complex a = new Complex(3, 4); // 3 + 4i
        Complex b = new Complex(1, 2); // 1 + 2i

        // 测试加法
        System.out.println("Addition:");
        System.out.println(a + " + " + b + " = " + a.add(b)); // 预期输出：4.0 + 6.0i

        // 测试减法
        System.out.println("\nSubtraction:");
        System.out.println(a + " - " + b + " = " + a.subtract(b)); // 预期输出：2.0 + 2.0i

        // 测试乘法
        System.out.println("\nMultiplication:");
        System.out.println(a + " * " + b + " = " + a.multiply(b)); // 预期输出：-5.0 + 10.0i

        // 测试除法
        System.out.println("\nDivision:");
        System.out.println(a + " / " + b + " = " + a.divide(b)); // 预期输出：2.2 + 0.4i

        // 测试模长
        System.out.println("\nModulus:");
        System.out.println("Modulus of " + a + " = " + a.modular()); // 预期输出：5.0

        // 测试共轭
        System.out.println("\nConjugate:");
        System.out.println("Conjugate of " + a + " = " + a.conjugate()); // 预期输出：3.0 - 4.0i

        // 测试排序
        System.out.println("\nComparison:");
        Complex[] complexArray = {new Complex(2, 3), new Complex(1, 1), new Complex(3, 4)};
        Arrays.sort(complexArray);
        System.out.println("Sorted array:");
        for (Complex c : complexArray) {
            System.out.println(c);
        }
    }
}

