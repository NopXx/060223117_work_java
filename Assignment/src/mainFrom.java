import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.event.*;
import java.sql.*;
import java.awt.*;
import java.util.*;

public class mainFrom extends JFrame implements ActionListener {
    database db = new database();
    private JPanel contentPane;
    JButton logout;

    // staff dStaffData;
    public mainFrom() {
        dispose();
        loginFrom login = new loginFrom();
        login.setVisible(true);
        // JOptionPane.showMessageDialog(null, "Please Login");

    }

    public mainFrom(staff StaffData) {
        // check login
        staff staffData = StaffData;
        System.out.println(staffData.toString());
        if (staffData.getSUser() == "" || staffData.getSUser() == null) {
            dispose();
            loginFrom login = new loginFrom();
            login.setVisible(true);
            // JOptionPane.showMessageDialog(null, "Please Login");
        }
        setTitle("Accessory Management System");
        setBounds(450, 190, 1014, 597);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        contentPane = new JPanel();
        contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
        setContentPane(contentPane);
        contentPane.setLayout(null);

        JLabel lblNewLabel = new JLabel("Hello " + staffData.getRole() + " " + staffData.getSFname());
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 16));
        lblNewLabel.setBounds(700, 20, 273, 15);
        contentPane.add(lblNewLabel);

        logout = new JButton("Logout");
        logout.addActionListener(this);
        logout.setFont(new Font("Tahoma", Font.PLAIN, 16));
        logout.setBounds(890, 10, 100, 30);
        contentPane.add(logout);
    }

    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == logout) {
            System.out.println("click");
            int a = JOptionPane.showConfirmDialog(null, "Are you sure?");
            // JOptionPane.setRootFrame(null);
            if (a == JOptionPane.YES_OPTION) {
                dispose();
                loginFrom login = new loginFrom();
                login.setVisible(true);
            }

        }
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    mainFrom frame = new mainFrom();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
}
