import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lab7_3 implements ActionListener {
    JLabel numberLabel;
    JTextField numberField;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnClear, btnDot, btnDel;
    JFrame window;
    int dotCount = 0;

    public lab7_3() {
        // obtain content pane and set its layout to FlowLayout
        window = new JFrame("Programm Show Text");
        Container container = window.getContentPane();
        container.setLayout(new FlowLayout());
        // create numberLabel and attach it to content pane
        numberLabel = new JLabel("Show Number : ");
        container.add(numberLabel);
        numberField = new JTextField(10);
        numberField.setHorizontalAlignment(JTextField.RIGHT);
        // numberField.setEditable( false );
        container.add(numberField);

        numberLabel = new JLabel("--------------------------------------------");
        container.add(numberLabel);
        numberLabel = new JLabel("                                 ");
        container.add(numberLabel);
        btnDel = new JButton("  Del  ");
        btnDel.addActionListener(this);
        container.add(btnDel);

        btn1 = new JButton("  1  ");
        btn1.addActionListener(this);
        container.add(btn1);
        btn2 = new JButton("  2  ");
        btn2.addActionListener(this);
        container.add(btn2);
        btn3 = new JButton("  3  ");
        btn3.addActionListener(this);
        container.add(btn3);
        btn4 = new JButton("  4  ");
        btn4.addActionListener(this);
        container.add(btn4);
        btn5 = new JButton("  5  ");
        btn5.addActionListener(this);
        container.add(btn5);

        btn6 = new JButton("  6  ");
        btn6.addActionListener(this);
        container.add(btn6);

        btn7 = new JButton("  7  ");
        btn7.addActionListener(this);
        container.add(btn7);

        btn8 = new JButton("  8  ");
        btn8.addActionListener(this);
        container.add(btn8);

        btn9 = new JButton("  9  ");
        btn9.addActionListener(this);
        container.add(btn9);

        btnDot = new JButton("  .   ");
        btnDot.addActionListener(this);
        container.add(btnDot);

        btn0 = new JButton("  0  ");
        btn0.addActionListener(this);
        container.add(btn0);
        btnClear = new JButton("  c  ");
        btnClear.addActionListener(this);
        container.add(btnClear);


        

        window.setSize(230, 250);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        String str = numberField.getText();
        // int dotCount = 0;
        if (event.getSource() == btn1) {
            str += "1";
            numberField.setText(str);
        } else if (event.getSource() == btn0) {
            str += "0";
            numberField.setText(str);
        } else if (event.getSource() == btn2) {
            str += "2";
            numberField.setText(str);
        } else if (event.getSource() == btn3) {
            str += "3";
            numberField.setText(str);
        } else if (event.getSource() == btn4) {
            str += "4";
            numberField.setText(str);
        } else if (event.getSource() == btn5) {
            str += "5";
            numberField.setText(str);
        } else if (event.getSource() == btn6) {
            str += "6";
            numberField.setText(str);
        } else if (event.getSource() == btn7) {
            str += "7";
            numberField.setText(str);
        } else if (event.getSource() == btn8) {
            str += "8";
            numberField.setText(str);
        } else if (event.getSource() == btn9) {
            str += "9";
            numberField.setText(str);
        } else if (event.getSource() == btnDot) {
            if (dotCount == 0) {
                str += ".";
                numberField.setText(str);
                dotCount++;
            }
        } else if (event.getSource() == btnClear) {
            str = "";
            numberField.setText(str);
            dotCount = 0;
        } else if (event.getSource() == btnDel) {
            if (str.length() > 0) {
                if (str.charAt(str.length() - 1) == '.') dotCount = 0;
                str = str.substring(0, str.length() - 1);
                numberField.setText(str);
            }
        }
    }

    public static void main(String[] args) {
        lab7_3 gui = new lab7_3();
    }
}
