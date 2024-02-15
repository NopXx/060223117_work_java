
// File Name : Lab7_1.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lab7_1 extends JFrame implements ActionListener {
    JLabel numberLabel, resultLabel;
    JTextField numberField, numberBlank;
    JTextArea resultArea;
    JScrollPane scrollPane;

    public lab7_1() {
        // title bar in window
        super("Program display value n");
        // obtain content pane and set its layout to FlowLayout
        Container container = getContentPane();
        container.setLayout(new FlowLayout());

        // create numberLabel and attach it to content pane
        numberLabel = new JLabel("Enter integer and press Enter : ");
        container.add(numberLabel);
        // create numberField and attach it to content pane
        numberField = new JTextField(10);
        container.add(numberField);

        numberLabel = new JLabel("Enter integer number of blank : ");
        container.add(numberLabel);
        // create numberField and attach it to content pane
        numberBlank = new JTextField(10);
        container.add(numberBlank);
        numberBlank.addActionListener(this);
        // register this applet as numberField’s ActionListener
        numberField.addActionListener(this);
        resultArea = new JTextArea(10, 20);
        resultArea.setEditable(false);
        // container.add(resultArea);
        scrollPane = new JScrollPane(resultArea);
        container.add(scrollPane);

    }

    public void actionPerformed(ActionEvent event) {
        int number, blank;

        if (numberBlank.getText().isEmpty() || numberField.getText().isEmpty()) {
            JOptionPane.showMessageDialog(null, "Enter integer number and blank", "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            blank = Integer.parseInt(numberBlank.getText());
            number = Integer.parseInt(numberField.getText());
            String blankSpace = "";
            for (int i = 0; i < blank; i++)
                blankSpace += " ";
            // clear value in TextArea
            resultArea.setText("");
            // add data in textarea
            for (int n = 1; n <= number; n++) {
                resultArea.append(blankSpace + Integer.toString(n));
                if (n % 5 == 0)
                    resultArea.append("\n");
            }
        }
    }

    public static void main(String[] args) {
        lab7_1 window = new lab7_1();
        window.setSize(360, 300);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}