import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

/**
 * lab7_2
 */
public class lab7_2 implements ActionListener {
    JLabel salaryLabel, taxLabel, resultLabel;
    JTextField salaryField, taxField, resultField;
    JButton btnCalculate, btnExit;
    JFrame window;

    public lab7_2() {
        // obtain content pane and set its layout to FlowLayout
        window = new JFrame("Programm Calculate Tax");
        Container container = window.getContentPane();
        container.setLayout(new FlowLayout());
        // create numberLabel and attach it to content pane
        salaryLabel = new JLabel("Enter salary employee : ");
        container.add(salaryLabel);

        salaryField = new JTextField(10);
        container.add(salaryField);

        taxLabel = new JLabel(" Result Tax of salary : ");
        container.add(taxLabel);

        taxField = new JTextField(10);
        taxField.setEditable(false);
        container.add(taxField);

        resultLabel = new JLabel(" Result Net Salary : ");
        container.add(resultLabel);

        resultField = new JTextField(10);
        resultField.setEditable(false);
        container.add(resultField);

        btnCalculate = new JButton(" Calculate ");
        btnCalculate.addActionListener(this);
        container.add(btnCalculate);

        btnExit = new JButton(" Exit ");
        btnExit.addActionListener(this);
        container.add(btnExit);

        window.setSize(300, 150);
        window.setLocationRelativeTo(null);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
    }

    public void actionPerformed(ActionEvent event) {
        double salary = salaryField.getText().isEmpty() ? 0.0 : Double.parseDouble(salaryField.getText());
        if (event.getSource() == btnCalculate) {
            double tax, netSalary;
            tax = this.getTax(salary);
            netSalary = salary - tax;
            taxField.setText(Double.toString(tax));
            resultField.setText(Double.toString(netSalary));
        } else if (event.getSource() == btnExit) {
            System.exit(0);
        }
    }

    public double getTax(double salary) {
        double tax, taxRate;
            if (salary < 20000)
                taxRate = 0.02;
            else if (salary < 50000)
                taxRate = 0.05;
            else if (salary < 100000)
                taxRate = 0.07;
            else if (salary < 500000)
                taxRate = 0.10;
            else
                taxRate = 0.15;
            tax = salary * taxRate;
        return tax;
    }

    public static void main(String[] args) {
        lab7_2 gui = new lab7_2();
    }
}