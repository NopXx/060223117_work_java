import javax.swing.*;
import java.awt.*;

public class PointJFrame extends javax.swing.JFrame {
    int size;
    Point p[];

    public PointJFrame() {
        super("Program Inheritance Point");
        String input;
        input = JOptionPane.showInputDialog("Enter number of point : ");
        size = Integer.parseInt(input); // convert input to int
        p = new Point[size];
        for (int n = 0; n < p.length; n++) {
            int x = 5 + (int) (Math.random() * 640);
            int y = 5 + (int) (Math.random() * 480);
            p[n] = new Point(x, y);
        }
    }

    // draw shapes on applet's background
    public void paint(Graphics g) {
        super.paint(g); // call paint method inherited
        for (int n = 0; n < p.length; n++) {
            // set color
            int r = 0 + (int) (Math.random() * 255);
            int g_color = 0 + (int) (Math.random() * 255);
            int b = 0 + (int) (Math.random() * 255);
            System.out.println("Color: " + r + " " + g_color + " " + b);
            g.setColor(new Color(r, g_color, b));
            // plot point
            g.drawLine(p[n].getX(), p[n].getY(), p[n].getX(),
                    p[n].getY());
            g.fillOval(p[n].getX(), p[n].getY(), 3,3);
        } // end for
    } // end method paint

    public static void main(String[] args) {
        PointJFrame test = new PointJFrame();
        test.setSize(640, 480);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }

}
