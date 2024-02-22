import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class lab7_3 implements ActionListener {
    JLabel numberLabel;
    JTextField numberField;
    JButton btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn0, btnClear, btnDot, btnDel, btnEqual, btnAdd,
            btnMultiply, btnDivide, btnBackspace, btnMod, btnPow, btnRoot;
    JFrame window;
    int dotCount = 0;
    boolean operator = false;
    char c_operator = ' ';
    NewNumber number = new NewNumber(0);

    public lab7_3() {
        // obtain content pane and set its layout to FlowLayout
        window = new JFrame("Programm Show Text");
        Container container = window.getContentPane();
        container.setLayout(new FlowLayout());
        // create numberLabel and attach it to content pane
        numberLabel = new JLabel("");
        container.add(numberLabel);
        numberField = new JTextField(20);
        numberField.setHorizontalAlignment(JTextField.RIGHT);
        numberField.setEditable(false);
        // numberField.setEditable( false );
        container.add(numberField);

        numberLabel = new JLabel("--------------------------------------------");
        container.add(numberLabel);
        numberLabel = new JLabel("                   ");
        container.add(numberLabel);

        btnClear = new JButton("Clear");
        btnClear.addActionListener(this);
        container.add(btnClear);
        
        btnBackspace = new JButton("Backspace");
        btnBackspace.addActionListener(this);
        container.add(btnBackspace);


        btnMod = new JButton("  mod   ");
        btnMod.addActionListener(this);
        container.add(btnMod);

        btnPow = new JButton("  x^y   ");
        btnPow.addActionListener(this);
        container.add(btnPow);

        btnRoot = new JButton("  root   ");
        btnRoot.addActionListener(this);
        container.add(btnRoot);

        btn7 = new JButton("  7  ");
        btn7.addActionListener(this);
        container.add(btn7);

        btn8 = new JButton("  8  ");
        btn8.addActionListener(this);
        container.add(btn8);

        btn9 = new JButton("  9  ");
        btn9.addActionListener(this);
        container.add(btn9);

        btnMultiply = new JButton("  x  ");
        btnMultiply.addActionListener(this);
        container.add(btnMultiply);

        btn4 = new JButton("  4  ");
        btn4.addActionListener(this);
        container.add(btn4);

        btn5 = new JButton("  5  ");
        btn5.addActionListener(this);
        container.add(btn5);

        btn6 = new JButton("  6  ");
        btn6.addActionListener(this);
        container.add(btn6);

        btnDivide = new JButton("  /   ");
        btnDivide.addActionListener(this);
        container.add(btnDivide);

        btn1 = new JButton("  1  ");
        btn1.addActionListener(this);
        container.add(btn1);

        btn2 = new JButton("  2  ");
        btn2.addActionListener(this);
        container.add(btn2);

        btn3 = new JButton("  3  ");
        btn3.addActionListener(this);
        container.add(btn3);

        btnDel = new JButton("  -   ");
        btnDel.addActionListener(this);
        container.add(btnDel);

        btnDot = new JButton("  .   ");
        btnDot.addActionListener(this);
        container.add(btnDot);

        btn0 = new JButton("  0  ");
        btn0.addActionListener(this);
        container.add(btn0);

        btnEqual = new JButton("  =  ");
        btnEqual.addActionListener(this);
        container.add(btnEqual);

        btnAdd = new JButton("  +  ");
        btnAdd.addActionListener(this);
        container.add(btnAdd);

        window.setSize(255, 300);
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
            operator = false;
        } else if (event.getSource() == btnBackspace) {
            if (str.length() > 0) {
                if (str.charAt(str.length() - 1) == '.')
                    dotCount = 0;
                if (str.charAt(str.length() - 1) != '.'
                        || !((str.charAt(str.length() - 1) >= '0') && (str.charAt(str.length() - 1) <= '9')))
                    operator = false;
                str = str.substring(0, str.length() - 1);
                numberField.setText(str);
            }
        } else if (event.getSource() == btnMultiply) {
            if (!operator && str.length() > 0) {
                if (str.charAt(str.length() - 1) == '.'
                || ((str.charAt(str.length() - 1) >= '0') && (str.charAt(str.length() - 1) <= '9'))) {
                    // operator = true;
                    str += "*";
                    numberField.setText(str);
                } else {
                    str = str.substring(0, str.length() - 1);
                    // numberField.setText(str);
                    str += "*";
                    numberField.setText(str);
                    // operator = true;
                }
                c_operator = '*';
            } 
        } else if (event.getSource() == btnDel) {
            if (!operator && str.length() > 0) {
                if (str.charAt(str.length() - 1) == '.'
                || ((str.charAt(str.length() - 1) >= '0') && (str.charAt(str.length() - 1) <= '9'))) {
                    // operator = true;
                    str += "-";
                    numberField.setText(str);
                } else {
                    str = str.substring(0, str.length() - 1);
                    // numberField.setText(str);
                    str += "-";
                    numberField.setText(str);
                    // operator = true;
                }
                c_operator = '-';
                // operator = true;
            }
        } else if (event.getSource() == btnAdd) {
            if (!operator && str.length() > 0) {
                if (str.charAt(str.length() - 1) == '.'
                || ((str.charAt(str.length() - 1) >= '0') && (str.charAt(str.length() - 1) <= '9'))) {
                    // operator = true;
                    str += "+";
                    numberField.setText(str);
                } else {
                    str = str.substring(0, str.length() - 1);
                    // numberField.setText(str);
                    str += "+";
                    numberField.setText(str);
                    // operator = true;
                }
                c_operator = '+';
            }
        } else if (event.getSource() == btnDivide) {
            if (!operator && str.length() > 0) {
                if (str.charAt(str.length() - 1) == '.'
                || ((str.charAt(str.length() - 1) >= '0') && (str.charAt(str.length() - 1) <= '9'))) {
                    // operator = true;
                    str += "/";
                    numberField.setText(str);
                } else {
                    str = str.substring(0, str.length() - 1);
                    // numberField.setText(str);
                    str += "/";
                    numberField.setText(str);
                    // operator = true;
                }
                c_operator = '/';
            }
        } else if (event.getSource() == btnEqual) {
            if (c_operator != ' ') {
            String arr[] = new String[2];
            String delimiter = c_operator == '+' ? "\\+" : c_operator == '*' ? "\\*" : String.valueOf(c_operator);
            arr = str.split(delimiter);
            for (int i = 0; i < arr.length; i++) 
                System.out.println(" " + arr[i]);
            if (c_operator == '+') {
                number.setValue(Integer.parseInt(arr[0]));
                number.add(Integer.parseInt(arr[1]));
                numberField.setText(number.toString());
            } else if (c_operator == '-') {
                number.setValue(Integer.parseInt(arr[0]));
                number.subtract(Integer.parseInt(arr[1]));
                numberField.setText(number.toString());
            } else if (c_operator == '*' ){
                number.setValue(Integer.parseInt(arr[0]));
                number.multiply(Integer.parseInt(arr[1]));
                numberField.setText(number.toString());
            } else if (c_operator == '/') {
                number.setValue(Integer.parseInt(arr[0]));
                number.divide(Integer.parseInt(arr[1]));
                numberField.setText(number.toString());
            }
        }
            c_operator = ' ';
        }
            
    }

    public static void main(String[] args) {
        lab7_3 gui = new lab7_3();
    }
}
