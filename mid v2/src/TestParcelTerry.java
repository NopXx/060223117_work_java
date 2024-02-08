import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestParcelTerry {
    
    public static void main(String[] args) {
        ParcelTerry p = new ParcelTerry();
        JLabel label;
        JButton checkBtn, submitBtn;
        JTextField textField_type, textField_weight;
        
        JFrame frame = new JFrame("Parcel Terry");
        Container c = new Container();

        c.setLayout(new FlowLayout());

        label = new JLabel("Enter Typeservice");
        c.add(label);
        label = new JLabel("1. basic 50 bth 2. advanced 75 bth 3. fast 100 bth");
        c.add(label);

        textField_type = new JTextField(25);
        c.add(textField_type);

        label = new JLabel("Enter Weight (g)");
        c.add(label);

        textField_weight = new JTextField(25);
        c.add(textField_weight);

        checkBtn = new JButton("Check Input");
        c.add(checkBtn);
        checkBtn.addActionListener(new ActionListener() {
            
            public void actionPerformed(ActionEvent e) {
                if (textField_type.getText().length() < 0 && textField_weight.getText().length() < 0) {
                    JOptionPane.showMessageDialog(null, "Please enter value", "" ,0);
                } else {
                    // submitBtn.setEnabled(true);
                }
            }
        });

        submitBtn = new JButton("Submit");
        // submitBtn.setEnabled(false);
        c.add(submitBtn);

        submitBtn.addActionListener(new ActionListener() {
            JTextArea textArea;
            public void actionPerformed(ActionEvent e) {
                p.Settypeservice(Integer.parseInt(textField_type.getText()));
                p.Setweight(Integer.parseInt(textField_weight.getText()));
                textArea.setText(String.valueOf(p.ParcelCalator(p.Gettypeservice(0), p.Getweight())));
                
            }
        });

        frame.add(c);
        frame.setSize(340, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
