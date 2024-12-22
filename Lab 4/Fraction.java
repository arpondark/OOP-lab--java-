class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public void add(Fraction other) {
        this.numerator = this.numerator * other.denominator + other.numerator * this.denominator;
        this.denominator = this.denominator * other.denominator;
        simplify();
    }

    public void subtract(Fraction other) {
        this.numerator = this.numerator * other.denominator - other.numerator * this.denominator;
        this.denominator = this.denominator * other.denominator;
        simplify();
    }

    public void multiply(Fraction other) {
        this.numerator *= other.numerator;
        this.denominator *= other.denominator;
        simplify();
    }

    public void divide(Fraction other) {
        this.numerator *= other.denominator;
        this.denominator *= other.numerator;
        simplify();
    }

    private void simplify() {
        int gcd = gcd(this.numerator, this.denominator);
        this.numerator /= gcd;
        this.denominator /= gcd;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }

    @Override
    public String toString() {
        return numerator + " / " + denominator;
    }
}

public class Main {
    public static void main(String[] args) {
        Fraction f1 = new Fraction(1, 4);
        Fraction f2 = new Fraction(3, 5);

        System.out.println("Fraction 1: " + f1);
        System.out.println("Fraction 2: " + f2);

        f1.add(f2);
        System.out.println("After addition: " + f1);

        f1.subtract(f2);
        System.out.println("After subtraction: " + f1);

        f1.multiply(f2);
        System.out.println("After multiplication: " + f1);

        f1.divide(f2);
        System.out.println("After division: " + f1);
    }
}
