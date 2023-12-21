import java.text.DecimalFormat;
import java.text.NumberFormat;

import javax.swing.JOptionPane;

public class test3 {
    public static void main(String[] args) {
        int number;

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter positive number : "));

        // if ((number <= 1 || number % 2 == 0 || number % 3 == 0 || number % 5 == 0 ||
        // number % 7 == 0)
        // && (number != 2 && number != 3 && number != 5 && number != 7)) {
        // JOptionPane.showMessageDialog(null, "number "+ number +" is not prime
        // number");
        // } else {
        // JOptionPane.showMessageDialog(null, "number "+ number +" is prime number");
        // }
        boolean isPrime = true;
        long start = System.currentTimeMillis();
        if (number <= 1) {
            isPrime = false;
        } else {
            for (int i = 2; i * i < number; i++) {
                System.out.println("for : " + i + " | i * i : " + i * i);
                if (number % i == 0) {
                    isPrime = false;
                    break;
                }
            }
        }
        long end = System.currentTimeMillis();
        if (isPrime) {
            JOptionPane.showMessageDialog(null, "number " + number + " is prime number");
        } else {
            JOptionPane.showMessageDialog(null, "number " + number + " is not prime number");
        }
        NumberFormat formatter = new DecimalFormat("#0.00000");
        System.out.print("Execution time is " + formatter.format((end - start) / 1000d) + " seconds");
    }
}
