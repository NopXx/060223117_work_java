import javax.swing.JOptionPane;
import java.text.DecimalFormat;

public class lab4_4 {
    public static void main(String[] args) {
        int total = 0, counter = 0, score;
        double average;

        do {
        score = Integer.parseInt(JOptionPane.showInputDialog("Enter Integer Score or -1 to Quit : "));
        if (score != -1) {
            total += score;
            counter++;
        }
    } while (score != -1);

        DecimalFormat twoDigits = new DecimalFormat("0.00");
        if (counter != 0) {
            average = (double) total / counter;
            JOptionPane.showMessageDialog(null, "Class average is " + twoDigits.format(average), "Result", 1);
        } else JOptionPane.showMessageDialog(null, "No score were entered", "Result", 1);
    }
}
