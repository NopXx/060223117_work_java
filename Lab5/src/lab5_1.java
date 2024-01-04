import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import java.text.DecimalFormat;

public class lab5_1 {
    public static void main(String[] args) {
        double value;
        String messages = "";
        value = Double.parseDouble(JOptionPane.showInputDialog("Enter floating number : "));
        messages += "Ceiling of " + value + " is " + Math.ceil(value);
        messages += "\nFloor of " + value + " is " + Math.floor(value);
        messages += "\nSquare root of " + value + " is " + Math.sqrt(value);
        messages += "\nExponential of " + value + " is " + Math.exp(value);
        messages += "\nAbsolute value of " + value + " is " + Math.abs(value);
        messages += "\nNatural logarithm of " + value + " is " + Math.log(value);
        messages += "\nPower three of " + value + " is " + Math.pow(value, 3) + "\n";

        for (int n = 1; n <= 85; n++)
            messages += "=";
        messages += "\n Angle\t\tSin\t\tScos\t\ttan\n";
        for (int n = 1; n <= 85; n++)
            messages += "=";
        messages += "\n";
        DecimalFormat twoDigit = new DecimalFormat("0.00");
        DecimalFormat sixDigit = new DecimalFormat("0.000000");
        for (double angle = 0.0; angle <= 360; angle += 40.0) {
            double radians = angle / 180.0 * Math.PI;
            messages += twoDigit.format(angle) + "\t\t";
            messages += sixDigit.format(Math.sin(radians)) + "\t\t";
            messages += sixDigit.format(Math.cos(radians)) + "\t\t";
            messages += sixDigit.format(Math.tan(radians)) + "\n";
        }

        JOptionPane.showMessageDialog(null, new JTextArea(messages), "Result", 1);

        System.exit(0);
    }
}