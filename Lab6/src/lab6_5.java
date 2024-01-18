import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class lab6_5 {
    public static void main(String[] args) {
        JFrame window = new JFrame("Employee Data");
        JTextArea textArea1 = new JTextArea(10, 30);
        JTextArea textArea2 = new JTextArea(10, 10);
        String data[][] = new String[10][2];
        Container c = window.getContentPane();
        c.setLayout(new FlowLayout());
        textArea1.setEditable(false);
        textArea2.setEditable(false);
        c.add(textArea1);
        c.add(textArea2);
        window.setSize(500, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        // window.show();
        getData(data);
        displayData(textArea1, textArea2, data);
    }

    public static void getData(String data[][]) {
        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                if (c == 0)
                    data[r][c] = JOptionPane.showInputDialog(
                            "Enter name " + (r + 1) + " : ");
                else
                    data[r][c] = JOptionPane.showInputDialog(
                            "Enter salary " + (r + 1) + " : ");
            }
        }
    }

    public static void displayData(JTextArea text1, JTextArea text2,
            String d[][]) {
        for (int r = 0; r < d.length; r++) {
            for (int c = 0; c < d[r].length; c++) {
                if (c == 0)
                    text1.append(d[r][c] + "\n");
                else
                    text2.append(d[r][c] + "\n");
            }
        }
    }
}
