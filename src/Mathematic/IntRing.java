package Mathematic;

public class IntRing {

    /**
     * 求解最大公因数 (greatest common divisor) 的方法
     * @param m 一般情况下为非零整数
     * @param n 一般情况下为非零整数
     *
     * 如果 {@code m}、{@code n} 其中一个取 {@code 0}, 则按照以下规则返回:
     *          {@code gcd(m,0)=m}, 其中 {@code m} 为非零整数;
     *          {@code gcd(0,0)=0}.*/
    public static int gcd(int m, int n) {
        if (m==0 || n==0) {
            return (n>m) ? n: m;
        } else {
            int dividend = (n > m) ? n : m;
            int divisor = (n > m) ? m : n;

            int remainder = dividend % divisor;
            while (remainder != 0) {
                dividend = divisor;
                divisor = remainder;
                remainder = dividend % divisor;
            }

            return divisor;
        }
    }

    // 求解最小公倍数 (least common multiple)
    public static int lcm(int n, int m) {
        return n*m / gcd(n,m);
    }
}
