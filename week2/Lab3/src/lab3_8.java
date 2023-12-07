import javax.swing.JOptionPane;

public class lab3_8 {
    public static void main(String[] args) {
        float hours, rate, salary;

        hours = Float.parseFloat(JOptionPane.showInputDialog("Enter your hours work: "));
        rate = Float.parseFloat(JOptionPane.showInputDialog("Enter your hourly rate: "));

        salary = (hours <= 40) ? (hours * rate) : (rate * (1.5f * hours - 20));
        JOptionPane.showMessageDialog(null, "Employee get salary : " + salary, "Result", 1);
    }
}
