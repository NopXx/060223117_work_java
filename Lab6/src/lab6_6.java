import javax.swing.*;
import javax.swing.border.EmptyBorder;

import java.awt.*;

// import javafx.scene.text.Font;

public class lab6_6 {
    public static void main(String[] args) {
        JFrame window = new JFrame(" Student Score ");
        
        JPanel panel = new JPanel();
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 
        JScrollPane scrollPane = new JScrollPane(panel);
        panel.setBorder(new EmptyBorder(10, 10, 10, 10));
        // panel.add(pane);
        // class 0 - 10
        // homework 0 - 15
        // assignment 0 - 10
        // subtest 0 -5
        // mid 0 - 30
        // end 0 - 30
        java.awt.Font newfont = new Font("Tamaho", Font.BOLD, 16);
        int student = 5;
        student = Integer.parseInt(JOptionPane.showInputDialog("Enter student number : "));
        int data[][] = new int[student][8];
        JTextArea textArea[][] = new JTextArea[student][8];
        JLabel label[][] = new JLabel[student][8];
        // create GUI
        Container c = window.getContentPane();
        

        for (int r = 0; r < label.length; r++) {
            System.out.println("r = " + r);
            for (int cu = 0; cu < label[r].length; cu++) {
                switch (cu) {
                    case 0:
                        label[r][cu] = new JLabel("Class Score ");
                        textArea[r][cu] = new JTextArea(1, 20);
                        textArea[r][cu].setEditable(false);
                        textArea[r][cu].setFont(newfont);
                        break;
                    case 1:
                        label[r][cu] = new JLabel("Homework Score ");
                        textArea[r][cu] = new JTextArea(1, 20);
                        textArea[r][cu].setEditable(false);
                        textArea[r][cu].setFont(newfont);
                        break;
                    case 2:
                        label[r][cu] = new JLabel("Assignment Score ");
                        textArea[r][cu] = new JTextArea(1, 20);
                        textArea[r][cu].setEditable(false);
                        textArea[r][cu].setFont(newfont);
                        break;
                    case 3:
                        label[r][cu] = new JLabel("Subtest Score ");
                        textArea[r][cu] = new JTextArea(1, 20);
                        textArea[r][cu].setEditable(false);
                        textArea[r][cu].setFont(newfont);
                        break;
                    case 4:
                        label[r][cu] = new JLabel("Midterm Score ");
                        textArea[r][cu] = new JTextArea(1, 20);
                        textArea[r][cu].setEditable(false);
                        textArea[r][cu].setFont(newfont);
                        break;
                    case 5:
                        label[r][cu] = new JLabel("Final Score");
                        textArea[r][cu] = new JTextArea(1, 20);
                        textArea[r][cu].setEditable(false);
                        textArea[r][cu].setFont(newfont);
                        break;
                    case 6:
                        label[r][cu] = new JLabel("Total Score");
                        textArea[r][cu] = new JTextArea(1, 22);
                        textArea[r][cu].setEditable(false);
                        textArea[r][cu].setFont(newfont);
                        break;
                    case 7:
                        label[r][cu] = new JLabel("Grade");
                        textArea[r][cu] = new JTextArea(1, 20);
                        textArea[r][cu].setEditable(false);
                        textArea[r][cu].setFont(newfont);
                        break;
                    default:
                        break;
                }

                label[r][cu].setFont(newfont);
                // label[r].setHorizontalAlignment(SwingConstants.LEFT);
                panel.add(label[r][cu]);
                panel.add(textArea[r][cu]);
            }
        }

        c.add(scrollPane);
        // c.add(panel);
        window.setSize(450, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        // window.show();

        getData(data);
        displayData(data, textArea);
        // System.exit(0);
    }

    public static void getData(int data[][]) {
        int totalScore = 0;

        for (int r = 0; r < data.length; r++) {
            for (int c = 0; c < data[r].length; c++) {
                int tempScore = 0;
                if (c == 0) {
                    tempScore = rnd(0, 10);
                    data[r][c] = tempScore;
                    totalScore += tempScore;

                } else if (c == 1) {
                    tempScore = rnd(0, 15);
                    data[r][c] = tempScore;
                    totalScore += tempScore;

                } else if (c == 2) {
                    tempScore = rnd(0, 10);
                    data[r][c] = tempScore;
                    totalScore += tempScore;

                } else if (c == 3) {
                    tempScore = rnd(0, 5);
                    data[r][c] = tempScore;
                    totalScore += tempScore;

                } else if (c == 4) {
                    tempScore = rnd(0, 30);
                    data[r][c] = tempScore;
                    totalScore += tempScore;
                } else if (c == 5) {
                    tempScore = rnd(0, 30);
                    data[r][c] = tempScore;
                    totalScore += tempScore;
                } else if (c == 6) {
                    data[r][c] = totalScore;
                }
            }
            totalScore = 0;
        }
    }

    public static void displayData(int data[][], JTextArea text[][]) {
        // boolean done = true;
        // String numStr;
        for (int r = 0; r < data.length; r++) {

            for (int c = 0; c < data[r].length; c++) {
                if (c == 7)
                    text[r][c].setText(calGrade(data[r][c-1]) + "");
                else
                    text[r][c].setText(data[r][c] + "");
                // System.out.println(data[r][c]);
            }
        }
    }

    public static int rnd(int st, int ed) {
        int offset = ed - st + 1;
        return (st + (int) (Math.random() * offset));
    }

    public static String calGrade(int score) {
        if ((score >= 0) && (score <= 100)) {
            // ถ้า score มีค่ามากกว่าหรือเท่ากับ 0 และ score มีค่าน้อยกว่าหรือเท่ากับ 100 จะเข้ามาทำงาน
            // ประกาศตัวแปร grade ชนิด String
            if (score >= 80) return "A";
            // ถ้า score มีค่ามากกว่าหรือเท่ากับ 80 ตัวแปร grade จะมีค่าเท่ากับ A
            else if (score >= 75) return "B+";
            // ถ้า score มีค่ามากกว่าหรือเท่ากับ 75 ตัวแปร grade จะมีค่าเท่ากับ B+
            else if (score >= 70) return "B";
            // ถ้า score มีค่ามากกว่าหรือเท่ากับ 70 ตัวแปร grade จะมีค่าเท่ากับ B
            else if (score >= 65) return "C+";
            // ถ้า score มีค่ามากกว่าหรือเท่ากับ 65 ตัวแปร grade จะมีค่าเท่ากับ C+
            else if (score >= 60) return "C";
            // ถ้า score มีค่ามากกว่าหรือเท่ากับ 60 ตัวแปร grade จะมีค่าเท่ากับ C
            else if (score >= 55) return "D+";
            // ถ้า score มีค่ามากกว่าหรือเท่ากับ 55 ตัวแปร grade จะมีค่าเท่ากับ D+
            else if (score >= 50) return "D";
            // ถ้า score มีค่ามากกว่าหรือเท่ากับ 50 ตัวแปร grade จะมีค่าเท่ากับ D
            else return "F";
    }
    return "error";
}
}
