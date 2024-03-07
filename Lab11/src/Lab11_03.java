import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab11_03 extends JFrame implements ActionListener {
    Timer swTimer;
    int x, y; 
    int dx = 15, dy = 15; 
    int ovalSize = 35;

    public Lab11_03() {
        super("Program Using Timer");
        swTimer = new Timer(500, this);
        swTimer.start();
        x = 25;
        y = 25;
    }

    public void paint(Graphics g) {
        super.paint(g);
        int Red = (int) (Math.random() * 256);
        int Green = (int) (Math.random() * 256);
        int Blue = (int) (Math.random() * 256);
        g.setColor(new Color(Red, Green, Blue));
        g.drawOval(x, y, 35, 35);
    }

    public void actionPerformed(ActionEvent event) {
        x += dx;
        y += dy;
        
        if (x < 0 || x + ovalSize > getWidth()) {
            dx = -dx;
            x += dx;
        }
        if (y < 0 || y + ovalSize > getHeight()) {
            dy = -dy;
            y += dy;
        }
        repaint();
        
    }

    public static void main(String[] args) {
        Lab11_03 test = new Lab11_03();
        test.setSize(480, 300);
        test.setLocationRelativeTo(null);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }

}
