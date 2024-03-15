import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;
import java.sql.*;
import java.awt.*;
import java.util.*;

public class loginFrom extends JFrame implements ActionListener {
    JLabel userJLabel, passwordJLabel;
    JTextField userJTextField, passwordJTextField;
    JButton loginJButton, clearButton;
    database db = new database();
    private JPanel contentPane;
    staff staffData = new staff();
    public loginFrom() {
        // super("Login");
        if (staffData.getSUser() != "" || staffData.getSUser() != null) {
            System.out.println("staff null");
            // dispose();
            // mainFrom main = new mainFrom();
            // main.setVisible(true);
            // JOptionPane.showMessageDialog(null, "Please Login");
        }
        setBounds(450, 190, 1014, 597);
        setResizable(false);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Login");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Times New Roman", Font.PLAIN, 46));
        lblNewLabel.setBounds(423, 13, 273, 93);
        contentPane.add(lblNewLabel);

        userJTextField = new JTextField();
        userJTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        userJTextField.setBounds(420, 170, 281, 30);
        contentPane.add(userJTextField);
        userJTextField.setColumns(10);

        passwordJTextField = new JPasswordField(20);
        passwordJTextField.setFont(new Font("Tahoma", Font.PLAIN, 20));
        passwordJTextField.setBounds(420, 286, 281, 30);
        contentPane.add(passwordJTextField);

        userJLabel = new JLabel("Username:");
        userJLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        userJLabel.setBounds(300, 170, 193, 30);
        contentPane.add(userJLabel);

        passwordJLabel = new JLabel("Password:");
        passwordJLabel.setFont(new Font("Tahoma", Font.PLAIN, 20));
        passwordJLabel.setBounds(300, 286, 193, 30);
        contentPane.add(passwordJLabel);

        loginJButton = new JButton("Login");
        loginJButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        loginJButton.setBounds(350, 392, 162, 30);
        contentPane.add(loginJButton);

        clearButton = new JButton("Clear");
        clearButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
        clearButton.setBounds(550, 392, 162, 30);
        contentPane.add(clearButton);

        loginJButton.addActionListener(this);
        clearButton.addActionListener(this);

    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == loginJButton) {
            String username = userJTextField.getText();
            String password = passwordJTextField.getText();
            if (!userJTextField.getText().isEmpty() && !passwordJTextField.getText().isEmpty()) {
                try {
                    // connect database
                    Connection conn = db.getConnection();
                    Statement stmt = conn.createStatement();
                    String sql = "SELECT * FROM staff where s_user = '" + username + "' and s_pw = '" + password + "';";
                    System.out.println(sql);
                    // query sql
                    ResultSet rs = stmt.executeQuery(sql);
                    if (rs.next()) {
                        
                        // set data to class staff
                        staffData.setSId(Integer.parseInt(rs.getString("s_id")));
                        staffData.setSUser(rs.getString("s_user"));
                        staffData.setSPw(rs.getString("s_pw"));
                        staffData.setSFname(rs.getString("s_fname"));
                        staffData.setSLname(rs.getString("s_lname"));
                        staffData.setSTel(rs.getString("s_tel"));
                        staffData.setRole(rs.getString("position"));
                        System.out.println(staffData.toString());
                        dispose();
                        mainFrom main = new mainFrom(staffData);
                        main.setVisible(true);
                        JOptionPane.showMessageDialog(null, "Successful Login");

                    } else {
                        JOptionPane.showMessageDialog(null, "Invalid Username or Password");
                    }

                } catch (SQLException error) {
                    System.out.println(error);
                }

            } else {
                JOptionPane.showMessageDialog(null, "Enter Username and Password");
            }
        } else if (e.getSource() == clearButton) {
            userJTextField.setText("");
            passwordJTextField.setText("");
        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    loginFrom frame = new loginFrom();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
