import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class test1 {
    public static void main(String[] args) {
        int num1, num2;
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter start number : "));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter end number : "));
        int row = 0;
        String result = "";
        for (int i = num1; i <= num2; i++) {
            if ((i % 3 == 0) && (i % 5 == 0)) {
                result += i + "\t";
                row++;
                if (row % 5 == 0) {
                    result += "\n";
                }
            }
        }
        System.out.println(result);
        JOptionPane.showMessageDialog(null, new JTextArea(result));
    }
}
