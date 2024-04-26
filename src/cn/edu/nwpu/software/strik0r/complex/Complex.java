package cn.edu.nwpu.software.strik0r.complex;

import org.jetbrains.annotations.NotNull;

public class Complex implements Comparable<Complex>, Cloneable {
    private double realisPart = 0;
    private double imaginaryPart = 0;

    public Complex(double realis, double imaginaryPart) {
        this.realisPart = realis;
        this.imaginaryPart = imaginaryPart;
    }

    public Complex() {
        this(0, 0);
    }

    public Complex(double realis) {
        this.realisPart = realis;
    }

    public double Re() {
        return realisPart;
    }

    public double Im() {
        return imaginaryPart;
    }

    public Complex add(@NotNull Complex w) {
        double real = realisPart+w.Re();
        double imaginary = this.imaginaryPart + w.Im();
        return new Complex(real, imaginary);
    }

    public Complex subtract(@NotNull Complex w) {
        Complex inverse = new Complex(-w.Re(), -w.Im());
        return this.add(inverse);
    }

    public Complex multiply(@NotNull Complex w) {
        double real = realisPart*w.Re() - imaginaryPart *w.Im();
        double imaginary = this.imaginaryPart *w.Re() + this.realisPart*w.Im();
        return new Complex(real, imaginary);
    }

    public Complex scalarMultiply(double k) {
        return new Complex(realisPart*k, imaginaryPart *k);
    }

    public Complex divide(@NotNull Complex w) {
        double coefficient = 1/(w.Re()*w.Re() + w.Im()*w.Im());
        return (this.multiply(w.conjugate())).scalarMultiply(coefficient);
    }

    public double modular() {
        return Math.sqrt(realisPart*realisPart + imaginaryPart * imaginaryPart);
    }

    public double argument() {
        return Math.atan2(imaginaryPart, realisPart);
    }

    public Complex conjugate() {
        return new Complex(realisPart, -imaginaryPart);
    }

    @Override
    public int compareTo(@NotNull Complex o) {
        return Double.compare(this.modular(), o.modular());
    }

    @Override
    public String toString() {
        return imaginaryPart ==0? realisPart+"" : realisPart+"+"+ imaginaryPart +"i";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
