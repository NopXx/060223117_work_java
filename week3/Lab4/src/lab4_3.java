import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class lab4_3 {
    public static void main(String[] args) {
        int total = 0, counter = 0, score;
        double average;
        score = Integer.parseInt(JOptionPane.showInputDialog("Enter Integer Score or -1 to Quit : "));

        while (score != -1) {
            total += score;
            counter++;
            score = Integer.parseInt(JOptionPane.showInputDialog("Enter Integer Score or -1 to Quit : "));

        }

        DecimalFormat twoDigits = new DecimalFormat("0.00");
        if (counter != 0) {
            average = (double) total / counter;
            JOptionPane.showMessageDialog(null, "Class average is " + twoDigits.format(average), "Result", 1);
        } else JOptionPane.showMessageDialog(null, "No score were entered", "Result", 1);

    }
}
