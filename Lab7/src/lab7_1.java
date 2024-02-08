
// File Name : Lab7_1.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lab7_1 extends JFrame {
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
        // register this applet as numberField’s ActionListener
        numberField.addActionListener(
                // create inner class
                new ActionListener() {
                    public void actionPerformed(ActionEvent event) {
                        int number, blank;
                        
                        number = Integer.parseInt(numberField.getText());
                        blank = Integer.parseInt(numberBlank.getText());
                        String blank5 = "";
                        for (int i = 0; i < blank; i++) 
                            blank5 += " ";
                        // clear value in TextArea
                        resultArea.setText("");
                        // add data in textarea
                        for (int n = 1; n <= number; n++) {
                            resultArea.append(blank5 + Integer.toString(n));
                            if (n % 5 == 0)
                                resultArea.append("\n");
                        }
                        // clear value in numberField
                        // numberField.setText("");
                    } // end method actionPerformed
                });
        // create display
        resultArea = new JTextArea(10, 20);
        resultArea.setEditable(false);
        // container.add(resultArea);
        scrollPane = new JScrollPane(resultArea);
        container.add(scrollPane);

    }

    public static void main(String[] args) {
        lab7_1 window = new lab7_1();
        window.setSize(360, 300);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }
}