import javax.swing.JOptionPane;

public class test2 {
    public static void main(String[] args) {
        long number = Long.parseLong(JOptionPane.showInputDialog("Enter Number : "));
        JOptionPane.showMessageDialog(null, "Number digit of " + number + " is " + countDigit(number) + " digits", "Result", 1);
    }

    public static int countDigit(long value) {
        // int count = 0;
        if (value == 0) {
            return 0;
        } else {
            return 1 + countDigit(value / 10);
        }
    }
}
