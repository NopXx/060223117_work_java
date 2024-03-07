import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab11_01 extends JFrame implements ActionListener {

    // add enter year
    private JButton year;
    private JTextField yearField, interestField, amountField;
    private Invest myMoney;

    public Lab11_01() {
        super("Program Calculate Interest of Bank");
        Container c = getContentPane();
        c.setLayout(new FlowLayout());

        c.add(new JLabel("Enter amount : "));
        amountField = new JTextField(10);
        amountField.addActionListener(this);
        c.add(amountField);

        c.add(new JLabel("Enter interest rate : "));
        interestField = new JTextField(10);
        interestField.addActionListener(this);
        c.add(interestField);

        c.add(new JLabel("Enter Year : "));
        yearField = new JTextField(10);
        yearField.addActionListener(this);
        c.add(yearField);

        year = new JButton("Anoter Year");
        year.addActionListener(this);
        c.add(year);

        myMoney = new Invest();
    }

    public void paint(Graphics g) {
        super.paint(g);
        myMoney.displayInterest(g);
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == amountField) {
            String s = amountField.getText();
            if (s.equals("") == false) {
                float amount = Float.parseFloat(s);
                myMoney.setAmount(amount);
            }
        } else if (event.getSource() == interestField) {
            String s = interestField.getText();
            if (s.equals("") == false) {
                float rate = Float.parseFloat(s);
                myMoney.setRate(rate);
            }
        } else {
            String s = yearField.getText();
            if (s.equals("") == false) {
                int year = Integer.parseInt(s);
                myMoney.setYear(year);
            } else {
                myMoney.setYear(1);
            }
            myMoney.anotherYear();
        }
        
        repaint();
    }

    public static void main(String[] args) {
        Lab11_01 test = new Lab11_01();
        test.setSize(320, 300);
        test.setLocationRelativeTo(null);
        test.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        test.setVisible(true);
    }
}
