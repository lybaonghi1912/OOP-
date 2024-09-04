package lybaonghi_23685131;

public class Rational {
    private int numerator;
    private int denominator;

    // Constructor
    public Rational(int numerator, int denominator) {
        if (denominator == 0) {
            throw new IllegalArgumentException("Denominator cannot be zero.");
        }
        this.numerator = numerator;
        this.denominator = denominator;
        reduce();
    }

    // Phương thức tối giản phân số (reduce)
    private void reduce() {
        int gcd = gcd(numerator, denominator);
        numerator /= gcd;
        denominator /= gcd;

        // Đảm bảo mẫu số luôn dương
        if (denominator < 0) {
            numerator = -numerator;
            denominator = -denominator;
        }
    }

    // Phương thức tìm GCD (Ước chung lớn nhất)
    private int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }

    // Phương thức nghịch đảo phân số (reciprocal)
    public Rational reciprocal() {
        return new Rational(denominator, numerator);
    }

    // Phương thức cộng hai phân số (add)
    public Rational add(Rational other) {
        int newNumerator = this.numerator * other.denominator + other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    // Phương thức trừ hai phân số (subtract)
    public Rational subtract(Rational other) {
        int newNumerator = this.numerator * other.denominator - other.numerator * this.denominator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    // Phương thức nhân hai phân số (multiply)
    public Rational multiply(Rational other) {
        int newNumerator = this.numerator * other.numerator;
        int newDenominator = this.denominator * other.denominator;
        return new Rational(newNumerator, newDenominator);
    }

    // Phương thức chia hai phân số (divide)
    public Rational divide(Rational other) {
        return this.multiply(other.reciprocal());
    }

    // Phương thức so sánh hai phân số với sai số tolerance (equals)
    public boolean equals(Rational other, double tolerance) {
        double difference = Math.abs((double) this.numerator / this.denominator - (double) other.numerator / other.denominator);
        return difference < tolerance;
    }

    // Phương thức toString để in phân số
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }
}