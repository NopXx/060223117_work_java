import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Lab8_1 extends JFrame implements ActionListener {
    JLabel textLabel;
    JTextField textField;
    JButton newBtn, saveBtn, clearBtn, showBtn;
    Container container;
    private int number;

    public Lab8_1() {

        super("Program Save Show Clear Delete Number");

        container = getContentPane();
        container.setLayout(new FlowLayout());

        textLabel = new JLabel("Enter number :");
        textLabel.setFont(new Font("Courier New", Font.BOLD, 20));
        container.add(textLabel);

        textField = new JTextField(10);
        textField.setFont(new Font("Courier New", Font.BOLD, 24));
        container.add(textField);

        newBtn = new JButton(" New ");
        newBtn.setFont(new Font("Courier New", Font.BOLD, 20));
        newBtn.addActionListener(this);
        container.add(newBtn);

        saveBtn = new JButton(" Save ");
        saveBtn.setFont(new Font("Courier New", Font.BOLD, 20));
        saveBtn.addActionListener(this);
        container.add(saveBtn);

        clearBtn = new JButton(" Clear ");
        clearBtn.setFont(new Font("Courier New", Font.BOLD, 20));
        clearBtn.addActionListener(this);
        container.add(clearBtn);

        showBtn = new JButton(" Show ");
        showBtn.setFont(new Font("Courier New", Font.BOLD, 20));
        showBtn.addActionListener(this);
        container.add(showBtn);

        setSize(340, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        Lab8_1 obj = new Lab8_1();
        obj.setValue(obj.getNumber());
        obj.textField.setText(obj.toString());
    }

    public void setValue(int n) {
        number = n;
    }

    public int getNumber() {
        return (int) (Math.random() * 100);
    }

    public int getValue() {
        return (number);
    }

    public String toString() {
        return (Integer.toString(getValue()));
    }

    public void actionPerformed(ActionEvent event) {
        if (event.getSource() == saveBtn) {
            int value = Integer.parseInt(textField.getText());
            this.setValue(value);
            textField.setText("");
        } else if (event.getSource() == clearBtn) {
            this.setValue(0);
            textField.setText("");
        } else if (event.getSource() == showBtn) {
            textField.setText(this.toString());
        } else if (event.getSource() == newBtn) {
            textField.setText(String.valueOf(this.getNumber()));
        }
    }
}