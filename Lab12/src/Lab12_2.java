import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Lab12_2 extends JFrame implements KeyListener,
        MouseListener {
    private int x, y, size, xCenter, yCenter;
    private int width, height;
    private char typeShape = 'R';

    public Lab12_2() {
        width = 320;
        height = 240;
        xCenter = 160;
        yCenter = 120;
        size = 30;
        x = (width / 2) - (size / 2);
        y = (height / 2) - (size / 2);
        addKeyListener(this);
        addMouseListener(this);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLUE);
        if (typeShape == 'R') {
            g.fillRect(x, y, size, size);
            g.setColor(Color.DARK_GRAY);
            g.drawRect(x, y, size, size);
        } else {
            g.fillOval(x, y, size, size);
            g.setColor(Color.DARK_GRAY);
            g.drawOval(x, y, size, size);
        }
        g.setColor(Color.BLACK);
        g.drawLine(1, yCenter, 319, yCenter);
        g.drawLine(xCenter, 30, xCenter, 239);
    }

    public void mousePressed(MouseEvent event) {
        Graphics g = getGraphics();
        g.drawString("" + getSize(xCenter, event.getX()),
                event.getX(), event.getY());
    }

    public void mouseReleased(MouseEvent event) {
        repaint();
    }

    public void mouseClicked(MouseEvent event) {
        this.size = getSize(xCenter, event.getX());
        this.x = (width / 2) - (size / 2);
        this.y = (height / 2) - (size / 2);
        System.out.println(x + " , " + y);
    }

    public void mouseEntered(MouseEvent event) {
    }

    public void mouseExited(MouseEvent event) {
    }

    public void keyPressed(KeyEvent event) {
        if (event.getKeyChar() == 'c')
            typeShape = 'C';
        if (event.getKeyChar() == 'r')
            typeShape = 'R';
    }

    public void keyReleased(KeyEvent event) {
        repaint();
    }

    public void keyTyped(KeyEvent event) {
    }

    private int getSize(int xCenter, int x) {
        int size = Math.abs(xCenter - x) * 2;
        return size;
    }

    public static void main(String[] args) {
        Lab12_2 window = new Lab12_2();
        window.setSize(320, 240);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
