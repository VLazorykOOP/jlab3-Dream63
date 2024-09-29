public class Rational extends Pair {

    private double numerator;
    private double denominator;

    public Rational(double numerator, double denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }
    public Rational() {
        this.numerator = 0;
        this.denominator = 0;
    }

    @Override
    Rational Addition(double num, double den) {
        Rational numba = new Rational();
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
    Rational Deduction(double num, double den) {
        Rational numba = new Rational();
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
    Rational Multiplication(double num, double den) {
        Rational numba = new Rational();
        numba.numerator = this.numerator * num;
        numba.denominator = this.denominator * den;
        return numba;
    }
    
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    public boolean equals(Rational obj) {
        return obj.numerator / obj.denominator == this.numerator / this.denominator;
    }
}
