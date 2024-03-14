import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class Lab12_5 extends JFrame implements KeyListener,
        ActionListener {
    private int width, height;
    private JButton startBtn, stopBtn;
    private int xMin, xMax, yMin, yMax, x1Min, x1Max, y1Min, y1Max;
    private int x, y, size, xSpeed, ySpeed, x1, y1, x1Speed, y1Speed, size1, count = 0;
    Timer swTimer;
    boolean isPosition = false;

    public Lab12_5() {
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        startBtn = new JButton("Play");
        startBtn.addActionListener(this);
        startBtn.addKeyListener(this);
        c.add(startBtn);
        stopBtn = new JButton("Stop");
        stopBtn.addActionListener(this);
        stopBtn.addKeyListener(this);
        c.add(stopBtn);
        width = 480;
        height = 320;
        xMin = 1;
        xMax = 478;
        yMin = 30;
        yMax = 319;
        xSpeed = 10;
        ySpeed = 10;
        x = 240;
        y = 160;

        x1Speed = 10;
        y1Speed = 10;
        x1 = 40;
        y1 = 160;
        x1Min = 1;
        x1Max = 478;
        y1Min = 30;
        y1Max = 319;

        size = 40;
        size1 = 40;
        swTimer = new Timer(200, this);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.BLACK);
        g.drawRect(20, 35, 470, 270);
        g.setColor(Color.BLUE);
        g.fillOval(x, y, size, size);
        g.setColor(Color.RED);
        g.fillOval(x1, y1, size1, size1);
    }

    public void keyPressed(KeyEvent event) {
        if (event.getKeyChar() == 'p')
            swTimer.start();
        else if (event.getKeyChar() == 's')
            swTimer.stop();
    }

    public void keyReleased(KeyEvent event) {
    }

    public void keyTyped(KeyEvent event) {
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == startBtn)
            swTimer.start();
        else if (e.getSource() == stopBtn)
            swTimer.stop();
        else {
            move();
            repaint();
        }
    }

    public void move() {
        if (Math.abs(x - x1) < size && Math.abs(y - y1) < size) {
            isPosition = true;
        }

        if (!isPosition) {
            count = 0;
            x = x + xSpeed;
            y = y + ySpeed;
            //
            x1 = x1 + x1Speed;
            y1 = y1 + y1Speed;
            //
        } else {
            if (count > 20) {
                x = x + xSpeed;
                y = y + ySpeed;
                //
                x1 = x1 + x1Speed;
                y1 = y1 + y1Speed;
                System.out.println("position --, count = " + count++);
            } else {

                x = x - xSpeed;
                y = y - ySpeed;
                //
                x1 = x1 + x1Speed;
                y1 = y1 + y1Speed;
            }
            System.out.println("position --, count = " + count++);
        }

        //
        if (x < xMin) {
            x = xMin;
            xSpeed = -xSpeed;
        } else if (x + size > xMax) {
            x = xMax - size;
            xSpeed = -xSpeed;
            isPosition = false;
        }
        if (y < yMin) {
            y = yMin;
            ySpeed = -ySpeed;
        } else if (y + size > yMax) {
            y = yMax - size;
            ySpeed = -ySpeed;
            isPosition = false;
        }
        //
        if (x1 < x1Min) {
            x1 = x1Min;
            x1Speed = -x1Speed;
        } else if (x1 + size1 > x1Max) {
            x1 = x1Max - size;
            x1Speed = -x1Speed;
            isPosition = false;
        }
        if (y1 < y1Min) {
            y1 = y1Min;
            y1Speed = -y1Speed;
        } else if (y1 + size1 > y1Max) {
            y1 = y1Max - size;
            y1Speed = -y1Speed;
            isPosition = false;
        }
    }

    public static void main(String[] args) {
        Lab12_5 window = new Lab12_5();
        window.setSize(550, 380);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}
