public class NewNumber {
    private int number;

    public NewNumber(int n) {
        setValue(n);
    }

    public void setValue(int n) {
        number = n;
    }

    public int getValue() {
        return (number);
    }

    public String toString() {
        return (Integer.toString(getValue()));
    }

    public void add(int n) {
        setValue(getValue() + n);
    }

    public void subtract(int n) {
        setValue(getValue() - n);
    }

    public void multiply(int n) {
        setValue(getValue() * n);
    }

    public void divide(int n) {
        setValue(getValue() / n);
    }

    public void PowNumber(int n) {
        setValue((int) Math.pow(getValue(), n));
    }

    public void modulus(int n) {
        setValue(getValue() % n);
    }

    public void root(int n) {
        
    }
}
