import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.text.DecimalFormat;

public class lab4_5 {
    public static void main(String[] args) {
        double amount, interest, perincipal, rate;
        perincipal = Double.parseDouble(JOptionPane.showInputDialog("Enter principal : "));
        rate = Double.parseDouble(JOptionPane.showInputDialog("Enter interest rate : "));
        rate = rate / 100;
        DecimalFormat twoDigits = new DecimalFormat("0.00");
        DecimalFormat threeDigits = new DecimalFormat("0.000");

        String message = "Year\tAmount on deposit\n";
        JOptionPane.showMessageDialog(null, new JTextArea(message), "Result", 1);
        message = "";
        amount = perincipal;
        for (int year = 1; year <= 10; year++) {
            interest = amount * rate;
            amount += interest;
            message += year + "\t\t" + threeDigits.format(interest) + "\t\t" + twoDigits.format(amount) + "\n";
        }

        JOptionPane.showMessageDialog(null, new JTextArea(message), "Result", 1);


    }
}
