public class NewNumber {
    private double number;

    public NewNumber(double n) {
        setValue(n);
    }

    public void setValue(double n) {
        number = n;
    }

    public double getValue() {
        return (number);
    }

    public String toString() {
        return (Double.toString(getValue()));
    }

    public void add(double n) {
        setValue(getValue() + n);
    }

    public void subtract(double n) {
        setValue(getValue() - n);
    }

    public void multiply(double n) {
        setValue(getValue() * n);
    }

    public void divide(double n) {
        setValue(getValue() / n);
    }

    public void PowNumber(double n) {
        setValue((double) Math.pow(getValue(), n));
    }

    public void modulus(double n) {
        setValue(getValue() % n);
    }

    public void root(double n) {
        setValue(Math.sqrt(n));
    }
}
