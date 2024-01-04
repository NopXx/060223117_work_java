import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class lab5_5 {
    public static void main(String[] args) {
        String menu, choiceStr;
        boolean done = true;
        int choice;
        DecimalFormat fourDigit = new DecimalFormat("0.0000");
        menu = "Main Menu\n 1. Circle \n 2. Rectangle\n 3. Exit";
        do {
            choiceStr = JOptionPane.showInputDialog(menu);
            choice = Integer.parseInt(choiceStr);
            if (choice >= 1 && choice <= 3) {
                if (choice == 1) {
                    double radius;
                    radius = Double.parseDouble(JOptionPane.showInputDialog("Enter radius : "));
                    JOptionPane.showMessageDialog(null,"Area circle is " + fourDigit.format(area(radius)), "Result", JOptionPane.INFORMATION_MESSAGE);
                } else if (choice == 2) {
                    double width, height;

                    width = Double.parseDouble(JOptionPane.showInputDialog("Enter width : "));
                    height = Double.parseDouble(JOptionPane.showInputDialog("Enter height : "));

                    JOptionPane.showMessageDialog(null,
                            "Area rectangle is " + fourDigit.format(area(width, height)), "Result", JOptionPane.INFORMATION_MESSAGE);
                } else if (choice == 3)
                    done = false;
            }
        } while (done);
        System.exit(0);
    }

    private static Object area(double w, double h) {
        return w * h;
    }

    private static Object area(double r) {
        return Math.PI * r * r;
    }
}
