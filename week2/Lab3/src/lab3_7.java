import javax.swing.JOptionPane;

public class lab3_7 {
    public static void main(String[] args) {
        String message;

        message = JOptionPane.showInputDialog("Enter your name: ");
        JOptionPane.showMessageDialog(null, "You entered : \"" + message + "\"", "Result", 1);
    }
}
