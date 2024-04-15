package cn.edu.nwpu.sws.strik0r.abstract_class;

public class Circle extends GeometricObject {
    private double radius;
    @Override
    public double getArea() {
        return Math.PI*radius*radius;
    }

    @Override
    public double getParameter() {
        return 2*Math.PI*radius;
    }
}
