package DataType;

public class StringToBasic {
    public static void main(String[] args) {
        int n1 = Integer.parseInt("114514");
        double d1 = Double.parseDouble("114514.1919810");
        System.out.println(n1);
        System.out.println(d1);

        char c1 = "114514".charAt(0);

        String str = "123";
        int n3 = Integer.parseInt(str);
        System.out.println(n3);
        int n4 = Integer.parseInt("Hello");
    }
}
