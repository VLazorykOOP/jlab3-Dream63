

public class Complex extends Pair {

    private double real;
    private double imaginary;

    public Complex(double real, double imag) {
        this.real = real;
        this.imaginary = imag;
    }
    public Complex() {
        this.real = 0;
        this.imaginary = 0;
    }

    @Override
    Complex Addition(double real, double imag) {
        Complex numba = new Complex();
        numba.real = this.real + real;
        numba.imaginary = this.imaginary + imag;
        return numba;
    }

    @Override
    Complex Deduction(double real, double imag) {
        Complex numba = new Complex();
        numba.real = this.real - real;
        numba.imaginary = this.imaginary - imag;
        return numba;
    }

    @Override
    Complex Multiplication(double real, double imag) {
        Complex numba = new Complex();
        numba.real = this.real * real - imaginary * imaginary;
        numba.imaginary = this.imaginary * real + imag * this.real;
        return numba;
    }

    @Override
    public String toString() {
        return real + " + " + imaginary + "i";
    }
    
    public boolean equals(Complex obj) {
        return obj.real == this.real && obj.imaginary == this.imaginary;
    }
}
