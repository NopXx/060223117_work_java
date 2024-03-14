import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab12_1 extends JFrame implements MouseListener {
    int x, y, size;
    Color bgcolor, fgcolor;
    boolean isDraw = true;

    public Lab12_1() {
        super("");
        x = 140;
        y = 100;
        size = 50;
        fgcolor = Color.BLUE;
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        super.paint(g);
        if (isDraw == true) {
            g.setColor(fgcolor);
            g.fillRect(x, y, size, size);
            g.setColor(Color.BLACK);
            g.drawRect(x, y, size, size);
        }
    }

    public void mousePressed(MouseEvent event) {
        Graphics g = getGraphics();
        g.drawString("(" + event.getX() + ", " + event.getY() + ")", event.getX(), event.getY());
    }

    public void mouseReleased(MouseEvent event) {
        repaint();
    }

    public void mouseClicked(MouseEvent event) {
        boolean flag = isInside(x, y, size, event.getX(), event.getY());
        if (isDraw == true) {
            if (flag == true)
                isDraw = !isDraw;
        } else {
            x = event.getX();
            y = event.getY();
            isDraw = !isDraw;
        }
    }
    public void mouseEntered(MouseEvent event) {
        repaint();
    }
    public void mouseExited(MouseEvent event) {
        repaint();
    }
    boolean isInside(int x1, int y1, int size, int posx, int posy) {
        int x2 = x1 + size;
        int y2 = y1 + size;
        if (posx >= x1 && posx <= x2)
            if (posy >= y1 && posy <= y2) return true;
        return false;
    }

    public static void main(String[] args) {
        Lab12_1 test = new Lab12_1();
        test.setSize(640, 480);
        test.setLocationRelativeTo(null);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }

}
