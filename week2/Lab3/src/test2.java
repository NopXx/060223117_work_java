import javax.swing.JOptionPane;

public class test2 {
    public static void main(String[] args) {
        float money, rate;
        String message_1;

        money = Float.parseFloat(JOptionPane.showInputDialog("Enter the amount of money: "));

        rate = Float.parseFloat(JOptionPane.showInputDialog("Enter the interest rate: "));
        for (int i = 1; i <= 5; i++) {
            money += money * rate / 100;
            message_1 += "Year " + i + " Money : " + money + "\n";

        }
        JOptionPane.showMessageDialog(null, ""+ message_1 +"", "Result", 1);

    }
}
