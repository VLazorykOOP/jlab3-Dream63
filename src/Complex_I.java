

public class Complex_I implements Pair_I {

    private double real;
    private double imaginary;

    public Complex_I(double real, double imag) {
        this.real = real;
        this.imaginary = imag;
    }
    public Complex_I() {
        this.real = 0;
        this.imaginary = 0;
    }

    @Override
    public Complex_I Addition(double real, double imag) {
        Complex_I numba = new Complex_I();
        numba.real = this.real + real;
        numba.imaginary = this.imaginary + imag;
        return numba;
    }

    @Override
    public Complex_I Deduction(double real, double imag) {
        Complex_I numba = new Complex_I();
        numba.real = this.real - real;
        numba.imaginary = this.imaginary - imag;
        return numba;
    }

    @Override
    public Complex_I Multiplication(double real, double imag) {
        Complex_I numba = new Complex_I();
        numba.real = this.real * real - imaginary * imaginary;
        numba.imaginary = this.imaginary * real + imag * this.real;
        return numba;
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
    
    public boolean equals(Complex_I obj) {
        return obj.real == this.real && obj.imaginary == this.imaginary;
    }
}
