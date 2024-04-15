package ExamPreparing;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, result;
        a = sc.nextInt();
        b = sc.nextInt();
        sc.close();
        if (a>b && b>=3) {
            result = a+b;
        } else if (a<b || b>=4) {
            result = a*b;
        } else {
            result = a-b;
        }
        System.out.println(result);
    }
}
