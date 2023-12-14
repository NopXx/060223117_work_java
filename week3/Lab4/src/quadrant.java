import javax.swing.JOptionPane;

public class quadrant {
    public static void main(String[] args) {
        float x, y;
        String message = "";
        x = Float.parseFloat(JOptionPane.showInputDialog("Enter value x :"));
        y = Float.parseFloat(JOptionPane.showInputDialog("Enter value y :"));
        if (x == 0 && y == 0) message = "The point where the number lines intersect is called the \"Origin\"";
        else if (x == 0) message = "the point lies on the \"X-axis\"";
        else if (y == 0) message = "the point lies on the \"Y-axis\"";
        else if (x > 0 && y > 0) message = "The point where the number lines intersect is called the \"Quadrant I\"";
        else if (x < 0 && y > 0)message = "The point where the number lines intersect is called the \"Quadrant II\"";
        else if (x < 0 && y < 0) message = "The point where the number lines intersect is called the \"Quadrant III\"";
        else if (x > 0 && y < 0) message = "The point where the number lines intersect is called the \"Quadrant IV\"";
        JOptionPane.showMessageDialog(null, "Enter value x : " + x + "\nEnter value y : " + y + "\n" + message);
    }
}
