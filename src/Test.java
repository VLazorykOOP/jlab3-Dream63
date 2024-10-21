public class Test {
    public static void main(String[] args) {
        // #1
        PrintedWork[] works = new PrintedWork[4];

        works[0] = new PrintedWork("Shevchenko", 400);
        works[1] = new Book("Franko", 150, "Fantasy");
        works[2] = new Magazine();
        works[3] = new SchoolBook("Avramenko", 250, "Ukrainian Language");

        for (PrintedWork work : works) {
            System.out.println(work.Show()); 
        }

        // #2
        Complex[] complex = new Complex[2];
        complex[1] = new Complex(1, 2);
        complex[0] = new Complex(6, 3);

        Rational[] rationals = new Rational[2];
        rationals[1] = new Rational(4, 2);
        rationals[0] = new Rational(6, 3);

        System.out.println(
        "Complex \nAddition: " + complex[1].Addition(12, 5).toString() + 
        "\nDeduction: " + complex[1].Deduction(2, 5).toString() + 
        "\nMultiplication: " + complex[1].Multiplication(5, 5).toString() + 
        "\nEquals: " + complex[1].equals(complex[0]) + "\n-------------------------------");

        System.out.println(
            "Rational \nAddition: " + rationals[1].Addition(12, 5).toString() + 
            "\nDeduction: " + rationals[1].Deduction(2, 5).toString() + 
            "\nMultiplication: " + rationals[1].Multiplication(5, 5).toString() + 
            "\nEquals: " + rationals[1].equals(rationals[0]) + "\n-------------------------------");
    

        Complex_I[] complex_Is = new Complex_I[2]; 
        complex_Is[1] = new Complex_I(1, 2);
        complex_Is[0] = new Complex_I(6, 3);

        Rational_I[] rational_Is = new Rational_I[2];
        rational_Is[1] = new Rational_I(4, 2);
        rational_Is[0] = new Rational_I(6, 3);

        System.out.println(
        "Complex_I \nAddition: " + complex_Is[1].Addition(12, 5).toString() + 
        "\nDeduction: " + complex_Is[1].Deduction(2, 5).toString() + 
        "\nMultiplication: " + complex_Is[1].Multiplication(5, 5).toString() + 
        "\nEquals: " + complex_Is[1].equals(complex_Is[0]) + "\n-------------------------------");

        System.out.println(
            "Rational_I \nAddition: " + rational_Is[1].Addition(12, 5).toString() + 
            "\nDeduction: " + rational_Is[1].Deduction(2, 5).toString() + 
            "\nMultiplication: " + rational_Is[1].Multiplication(5, 5).toString() + 
            "\nEquals: " + rational_Is[1].equals(rational_Is[0]) + "\n-------------------------------");
    }
}
