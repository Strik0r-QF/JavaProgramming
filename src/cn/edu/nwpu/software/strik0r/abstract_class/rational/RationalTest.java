package cn.edu.nwpu.software.strik0r.abstract_class.rational;

public class RationalTest {
    public static void main(String[] args) {
        Rational r1 = new Rational(1,2);
        Rational r2 = new Rational(1,-2);

        System.out.println(r1.add(r2));
//        System.out.println(r1+"-"+r2+"="+r1.subtract(r2));
//        System.out.println(r1+"*"+r2+"="+r1.multiply(r2));
//        System.out.println(r1+"/"+r2+"="+r1.devide(r2));
//        System.out.println(r2+" is "+r2.doubleValue());
    }
}
