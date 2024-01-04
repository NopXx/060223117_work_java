import javax.swing.JOptionPane;

public class lab5_4 {
    public static void main(String[] args) {
        int num;

        num = Integer.parseInt(JOptionPane.showInputDialog("Enter last number :" ));

        int sum = Sumation(num);
        String output = " Sum of 1 to " + num + " is " + sum;
        JOptionPane.showMessageDialog(null, output, "Sumation", 1);
        System.exit(0);
    }

    public static int Sumation(int n) {
        if (n > 1) {
            return (n + Sumation(n - 1));
        } else return 1;
    }
}
