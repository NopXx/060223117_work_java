import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class test2 {
    public static void main(String[] args) {
        long number;
        String numberStr, message = "";
        number = Long.parseLong(JOptionPane.showInputDialog("Enter positive number : "));

        numberStr = Long.toString(number);
        int odd = 0, even = 0, zero = 0;

        for (int i = 0; i < numberStr.length(); i++) {
            if (numberStr.charAt(i) == '0') {
                zero++;
            } else if (Integer.parseInt(String.valueOf(numberStr.charAt(i))) % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        message += "Enter positive number : " + number + "\n\n";
        message += "Odd : " + odd + "\n";
        message += "Even : " + even + "\n";
        message += "Zero : " + zero + "\n";

        JOptionPane.showMessageDialog(null, new JTextArea(message));


    }
}
