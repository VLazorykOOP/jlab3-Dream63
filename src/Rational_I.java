public class Rational_I implements Pair_I {

    private double numerator;
    private double denominator;

    public Rational_I(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Rational_I() {
        this.numerator = 0;
        this.denominator = 0;
    }

    @Override
    public Rational_I Addition(double num, double den) {
        Rational_I numba = new Rational_I();
        if(denominator != den) {
            numba.numerator = this.numerator * den + num * this.denominator;
            numba.denominator = this.denominator * den; 
        }
        else {
            numba.numerator = this.numerator + num;
            numba.denominator = this.denominator;
        }

        return numba;
    }

    @Override
    public Rational_I Deduction(double num, double den) {
        Rational_I numba = new Rational_I();
        if(denominator != den) {
            numba.numerator = this.numerator * den - num * this.denominator;
            numba.denominator = this.denominator * den; 
        }
        else {
            numba.numerator = this.numerator - num;
            numba.denominator = this.denominator;
        }

        return numba;
    }

    @Override
    public Rational_I Multiplication(double num, double den) {
        Rational_I numba = new Rational_I();
        numba.numerator = this.numerator * num;
        numba.denominator = this.denominator * den;
        return numba;
    }
    
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public boolean equals(Rational_I obj) {
        return obj.numerator / obj.denominator == this.numerator / this.denominator;
    }
}
