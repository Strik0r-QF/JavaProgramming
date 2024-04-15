package cn.edu.nwpu.software.strik0r.abstract_class.complex;

import org.jetbrains.annotations.NotNull;

public class Complex implements Comparable<Complex>, Cloneable {
    private double realis = 0;
    private double imaginary = 0;

    public Complex(double realis, double imaginary) {
        this.realis = realis;
        this.imaginary = imaginary;
    }

    public Complex() {
        this(0, 0);
    }

    public Complex(double realis) {
        this.realis = realis;
    }

    public double Re() {
        return realis;
    }

    public double Im() {
        return imaginary;
    }

    public Complex add(@NotNull Complex w) {
        double real = realis+w.Re();
        double imaginary = this.imaginary + w.Im();
        return new Complex(real, imaginary);
    }

    public Complex subtract(@NotNull Complex w) {
        Complex inverse = new Complex(-w.Re(), -w.Im());
        return this.add(inverse);
    }

    public Complex multiply(@NotNull Complex w) {
        double real = realis*w.Re() - imaginary*w.Im();
        double imaginary = this.imaginary*w.Re() + this.realis*w.Im();
        return new Complex(real, imaginary);
    }

    public Complex scalarMultiply(double k) {
        return new Complex(realis*k, imaginary*k);
    }

    public Complex divide(@NotNull Complex w) {
        double coefficient = 1/(w.Re()*w.Re() + w.Im()*w.Im());
        return (this.multiply(w.conjugate())).scalarMultiply(coefficient);
    }

    public double modular() {
        return Math.sqrt(realis*realis + imaginary*imaginary);
    }

    public Complex conjugate() {
        return new Complex(realis, -imaginary);
    }

    @Override
    public int compareTo(@NotNull Complex o) {
        return Double.compare(this.modular(), o.modular());
    }

    @Override
    public String toString() {
        return imaginary==0? realis+"" : realis+"+"+imaginary+"i";
    }
}
