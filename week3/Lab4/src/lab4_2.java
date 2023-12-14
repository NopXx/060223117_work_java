import javax.swing.JOptionPane;

public class lab4_2 {
    public static void main(String[] args) {
        int num1, num2;
        double result = 0;
        char operator;
        boolean done = true;
        String message = "";
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first value :"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second value :"));
        operator = JOptionPane.showInputDialog("Enter operator(+, -, *, /, %) : ").charAt(0);

        switch (operator) {
            case '+':
                result = num1 + num2;
                message = "Result : "+ num1 + " + " + num2 + " = ";
                break;
            case '-':
                result = num1 - num2;
                message = "Result : "+ num1 + " - " + num2 + " = ";
                break;
            case '*':
                result = num1 * num2;
                message = "Result : " + num1 + " * " + num2 + " = ";
                break;
            case '/':
                result = (double)num1 / num2;
                message = "Result : " + num1 + " / " + num2 + " = ";
                break;
            case '%':
                result = num1 % num2;
                message = "Result : " + num1 + " % " + num2 + " = ";
                break;
            default:
                done = false;
        }
        if (done) {
            JOptionPane.showMessageDialog(null, message + result);
        } else {
            JOptionPane.showMessageDialog(null, "Invalid operator");
        }
    }
}
