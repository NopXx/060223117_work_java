import javax.swing.*;
import java.awt.*;

public class RectangleJFrame extends JFrame  {
    int x, y, size;
    Rectangle r[];

    public RectangleJFrame() {
        
        String input;
        input = JOptionPane.showInputDialog("Enter number of point : ");
        size = Integer.parseInt(input);
        input = JOptionPane.showInputDialog(
                "Enter value x of left point : ");
        x = Integer.parseInt(input);
        input = JOptionPane.showInputDialog("Enter value y of left point  : ");
        y = Integer.parseInt(input);

        r = new Rectangle[size];
        for (int n = 0; n < r.length; n++) {
            int w = 10 + (int) (Math.random() * 280);
            int h = 10 + (int) (Math.random() * 180);
            r[n] = new Rectangle(x, y, w, h);
        }
    }

    public void paint(Graphics g) {
        super.paint(g); // call paint method inherited
        // set color
        int width = 0;
        for (int n = 0; n < r.length; n++) {
            int r_color = 0 + (int) (Math.random() * 255);
            int g_color = 0 + (int) (Math.random() * 255);
            int b_color = 0 + (int) (Math.random() * 255);
            g.setColor(new Color(r_color, g_color, b_color));

            g.drawRect(r[n].getX(), r[n].getY()+ width, r[n].getWidth(), r[n].getHeight());
            // g.setColor(Color.BLUE);
            g.drawString("Point Left : " + r[n].getX() + ", " + r[n].getY(),
                    r[n].getX(), r[n].getY() + width);
            g.drawString("Width : " + r[n].getWidth(), r[n].getX(),
                    r[n].getY() + 15 + width);
            g.drawString("Height : " + r[n].getHeight(), r[n].getX(),
                    r[n].getY() + 30 + width);
            g.drawString("Area : " + r[n].getArea(), r[n].getX(), r[n].getY() + 45 + width);
            width += 150;
        }
    } // end method paint

    public static void main(String[] args) {
        RectangleJFrame frame = new RectangleJFrame();
        frame.setTitle("Program Inheritance Rectangle");
        frame.setSize(640, 880);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
