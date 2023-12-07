import javax.swing.JOptionPane;

public class test1 {
    public static void main(String[] args) {
        float c, f;
        c = Float.parseFloat(JOptionPane.showInputDialog("Enter Celsius: "));
        f = (9f / 5f) * c + 32;
        JOptionPane.showMessageDialog(null, "The temperature in Fahrenheit is: " + f, "Result", 1);
    }
    
}
