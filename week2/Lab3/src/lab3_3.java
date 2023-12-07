import javax.swing.JOptionPane;

public class lab3_3 {
    public static void main(String[] args) {
        int a = 10, b = 6;
        double y;
        JOptionPane.showMessageDialog(null, "When a = " + a + ", b = " + b, "Result", 1);
        System.out.println("When a = " + a + ", b = " + b);
        // สมการที่ 1
        y = (a - b) * (a + b);
        JOptionPane.showMessageDialog(null, "y = (a - b) * (a + b) = " + y, "Result", 1);
        // สมการที่ 2
        y = 3 * ((a - b) * (a + b));
        JOptionPane.showMessageDialog(null, "y = 3 * ((a - b) * (a + b)) = " + y, "Result", 1);
        // สมการที่ 3
        y = 1 - (2 * a) / (3 * b);
        JOptionPane.showMessageDialog(null, "y = 1 - (2 * a) / (3 * b) = " + y, "Result", 1);
        System.out.println("y = 1 - (2 * a) / (3 * b) = " + y);
    }
}
