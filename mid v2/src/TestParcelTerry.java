import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TestParcelTerry {

    public static void main(String[] args) {
        ParcelTerry p = new ParcelTerry();
        JLabel label;
        JButton submitBtn;
        JTextField textField_type, textField_weight;
        JTextArea textArea;
        textArea = new JTextArea(2, 25);

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

        submitBtn = new JButton("Submit");
        // submitBtn.setEnabled(false);
        c.add(submitBtn);

        submitBtn.addActionListener(new ActionListener() {
            

            
            public void actionPerformed(ActionEvent e) {
                if (textField_type.getText().isEmpty() || textField_weight.getText().isEmpty()) {
                    JOptionPane.showMessageDialog(null, "Please enter value", "", 0);
                } else {
                    // submitBtn.setEnabled(true);
                    p.Settypeservice(Integer.parseInt(textField_type.getText()));
                    p.Setweight(Integer.parseInt(textField_weight.getText()));
                    textArea.setText(String.valueOf(p.ParcelCalator(p.Gettypeservice(0), p.Getweight())));
                    c.add(textArea);
                }

            }
        });

        frame.add(c);
        frame.setSize(340, 400);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
