package cn.edu.nwpu.software.strik0r.abstract_class;

public class Rectangle extends GeometricObject {
    private double length1;
    private double length2;
    @Override
    public double getArea() {
        return length1*length2;
    }

    @Override
    public double getParameter() {
        return 2*(length1+length2);
    }
}
