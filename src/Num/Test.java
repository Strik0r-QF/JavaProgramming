package Num;

public class Test {
    public static void main(String[] args) {
        System.out.println(Math.pow(-1.0, 1.0/3.0));
        System.out.println(supExp(10));
        System.out.println(sup(10));
        System.out.println(infExp(10));
        System.out.println(inf(10));
    }

    private static int Ones(int n) {
        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum = sum * 10 + 1;
        }
        return sum;
    }

    private static double infExp(int n) {
        return (double) (3 * Ones(n)) / (Math.pow(10, n) - 1);
    }

    private static double supExp(int n) {
        return (double) (3 * Ones(n)) / (Math.pow(10, n) + 1);
    }


    private static double sup(int n) {
        return Math.pow(-1.0, supExp(n));
    }

    private static double inf(int n) {
        return Math.pow(-1.0, infExp(n));
    }
}