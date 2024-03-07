import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab11_02 extends JFrame implements AdjustmentListener {
    private Graph myGraph;
    private JScrollBar aScrollbar, bScrollbar, cScrollbar,
            dScrollbar;

    public Lab11_02() {
        super("Program Display Graph");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());
        c.add(new JLabel(" a : "));
        aScrollbar = new JScrollBar(JScrollBar.HORIZONTAL, 50, 10,
                0, 100);
        c.add(aScrollbar);
        aScrollbar.addAdjustmentListener(this);
        c.add(new JLabel(" b : "));
        bScrollbar = new JScrollBar(JScrollBar.HORIZONTAL, 50, 10,
                0, 100);
        c.add(bScrollbar);
        bScrollbar.addAdjustmentListener(this);
        c.add(new JLabel(" c : "));
        cScrollbar = new JScrollBar(JScrollBar.HORIZONTAL, 50, 10,
                0, 100);
        c.add(cScrollbar);
        cScrollbar.addAdjustmentListener(this);
        c.add(new JLabel(" d : "));
        dScrollbar = new JScrollBar(JScrollBar.HORIZONTAL, 50, 10,
                0, 100);
        c.add(dScrollbar);
        dScrollbar.addAdjustmentListener(this);
        myGraph = new Graph();
    }

    public void paint(Graphics g) {
        super.paint(g);
        myGraph.draw(g);
    }

    public void adjustmentValueChanged(AdjustmentEvent event) {
        int aValue = aScrollbar.getValue();
        int bValue = bScrollbar.getValue();
        int cValue = cScrollbar.getValue();
        int dValue = dScrollbar.getValue();
        myGraph.setParameters(aValue, bValue, cValue, dValue);
        repaint();
    }

    public static void main(String[] args) {
        Lab11_02 test = new Lab11_02();
        test.setSize(300, 200);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}
