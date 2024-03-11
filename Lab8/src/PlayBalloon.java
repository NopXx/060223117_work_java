import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PlayBalloon extends JFrame implements
        ActionListener {
    private Button grow, shrink, left, right, up, down, left_up, left_down, right_up, right_down;
    private Balloon myBalloon;
    Timer swTimer;
    int x, y;
    int dx = 15, dy = 15;
    int ovalSize = 35;

    public PlayBalloon() {
        super("Display Balloon in JFrame");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        grow = new Button("Grow");
        grow.addActionListener(this);
        c.add(grow);
        shrink = new Button("Shrink");
        shrink.addActionListener(this);
        c.add(shrink);
        left = new Button("Left");
        left.addActionListener(this);
        c.add(left);
        right = new Button("Right");
        right.addActionListener(this);
        c.add(right);
        up = new Button("Up");
        up.addActionListener(this);
        c.add(up);
        down = new Button("Down");
        down.addActionListener(this);
        c.add(down);

        left_up = new Button("Left Up");
        left_up.addActionListener(this);
        c.add(left_up);

        left_down = new Button("Left Down");
        left_down.addActionListener(this);
        c.add(left_down);

        right_up = new Button("Right Up");
        right_up.addActionListener(this);
        c.add(right_up);

        right_down = new Button("Right Down");
        right_down.addActionListener(this);
        c.add(right_down);


        myBalloon = new Balloon();
        swTimer = new Timer(500, this);
        swTimer.start();
        x = 25;
        y = 25;
        setSize(400, 400);
        setForeground(Color.BLUE);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == grow)
            myBalloon.grow();
        else if (event.getSource() == shrink)
            myBalloon.shrink();
        else if (event.getSource() == left)
            myBalloon.left();
        else if (event.getSource() == right)
            myBalloon.right();
        else if (event.getSource() == up)
            myBalloon.up();
        else if (event.getSource() == down)
            myBalloon.down();
        else if (event.getSource() == left_up)
            myBalloon.left_up();
        else if (event.getSource() == left_down)
            myBalloon.left_down();
        else if (event.getSource() == right_up)
            myBalloon.right_up();
        else if (event.getSource() == right_down)
            myBalloon.right_down();

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

    public void paint(Graphics g) {
        super.paint(g);
        myBalloon.display(g);
        int Red = (int) (Math.random() * 256);
        int Green = (int) (Math.random() * 256);
        int Blue = (int) (Math.random() * 256);
        g.setColor(new Color(Red, Green, Blue));
        g.drawOval(x, y, 35, 35);
    }

    public static void main(String[] args) {
        PlayBalloon test = new PlayBalloon();
        test.setSize(400, 300);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}
