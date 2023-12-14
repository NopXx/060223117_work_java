import javax.swing.JOptionPane;

public class test3 {
    public static void main(String[] args) {
        String number, message = "";
        int n;
        do {
            number = JOptionPane.showInputDialog("Enter number: ");
            n = number.length();
        } while(n > 4 || n != 4 || n < 4);
        for (int i = 0; i < n; i++) {
            message += number.charAt(i) + "   ";
        }
        JOptionPane.showMessageDialog(null, message, "Result", 1);
    }  
}
