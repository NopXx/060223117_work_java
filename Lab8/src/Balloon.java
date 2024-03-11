import java.awt.*;

public class Balloon {
    private int diameter = 10;
    private int x = 20, y = 50;
    Graphics g;

    public void display(Graphics g) {
        g.drawOval(x, y, diameter, diameter);
    }

    public void left() {
        x = x - 10;
    }

    public void right() {
        x = x + 10;
    }

    public void up() {
        y = y - 10;
    }

    public void down() {
        y = y + 10;
    }

    public void grow() {
        diameter = diameter + 5;
    }

    public void shrink() {
        diameter = diameter - 5;
    }

    public void left_up() {
        x = x - 10;
        y = y - 10;
    }
    public void left_down() {
        x = x - 10;
        y = y + 10;
    }
    public void right_up() {
        x = x + 10;
        y = y - 10;
    }
    public void right_down() {
        x = x + 10;
        y = y + 10;
    }
    
}
