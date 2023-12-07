import javax.swing.JOptionPane;

public class lab3_6 {
    final double PI = 3.1416;
    String message;
    double area;

    public lab3_6(double radius) {
        message = "Circle";
        area = PI * radius * radius;
    }
    public lab3_6(double width, double height) {
        message = "Rectangle";
        area = width * height;
    }
    public static void main(String[] args) {
        lab3_6 circle = new lab3_6(10.0);
        JOptionPane.showMessageDialog(null, "Calculate Area " + circle.message + " = " + circle.area, "Result", 1);

        lab3_6 rectangle = new lab3_6(12.0, 20.0);
        JOptionPane.showMessageDialog(null, "Calculate Area " + rectangle.message + " = " + rectangle.area, "Result", 1);

    }
}
