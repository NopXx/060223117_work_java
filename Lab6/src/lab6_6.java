import javax.swing.*;
import java.awt.*;

// import javafx.scene.text.Font;

public class lab6_6 {
    
    private static JPanel panel = new JPanel();
    private static java.awt.Font newfont = new Font("Tamaho", Font.BOLD, 16);


    public static void main(String[] args) {
        JFrame window = new JFrame(" Student Score ");
        JScrollPane scrollPane = new JScrollPane(panel);
        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS)); 

        // class 0 - 10
        // homework 0 - 15
        // assignment 0 - 10
        // subtest 0 -5
        // mid 0 - 30
        // end 0 - 30

        int student = 5;
        student = Integer.parseInt(JOptionPane.showInputDialog("Enter student number : "));
        int data[][] = new int[student][8];
        JTextArea textArea = new JTextArea();
        JLabel label = new JLabel();

        // create GUI
        Container c = window.getContentPane();

        getData(data);
        displayData(data, textArea, label);
        c.add(scrollPane);
        // c.add(panel);
        window.setSize(450, 500);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        window.setLocationRelativeTo(null);
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

    public static void displayData(int data[][], JTextArea textArea, JLabel label) {
        
        for (int r = 0; r < data.length; r++) {
            JLabel label0 = new JLabel("\n---------------------------------------------");
            panel.add(label0);
            JLabel label1 = new JLabel("\nStudent " + (r + 1));
            panel.add(label1);
            JLabel label2 = new JLabel("\n---------------------------------------------");
            panel.add(label2);

            for (int cu = 0; cu < data[r].length; cu++) {
                if (cu != 7) {
                    label = new JLabel(getLabelName(cu));
                    textArea = new JTextArea(1, 20);
                    textArea.setEditable(false);
                    textArea.setFont(newfont);
                    textArea.setText(data[r][cu] + "");
                } else {
                    label = new JLabel(getLabelName(cu));
                    textArea = new JTextArea(1, 20);
                    textArea.setEditable(false);
                    textArea.setFont(newfont);
                    textArea.setText(calGrade(data[r][cu - 1]) + "");
                }
                
                panel.add(label, BorderLayout.WEST);
                panel.add(textArea, BorderLayout.EAST);

            }
        }

    }

    private static String getLabelName(int index) {
        switch (index) {
            case 0:
                return "Class Score - 10";
            case 1:
                return "Homework Score - 15";
            case 2:
                return "Assignment Score - 10";
            case 3:
                return "Subtest Score - 5";
            case 4:
                return "Midterm Score - 30";
            case 5:
                return "Final Score - 30";
            case 6:
                return "Total Score - 100";
            case 7:
                return "Grade";
            default:
                return "";
        }
    }

    public static int rnd(int st, int ed) {
        int offset = ed - st + 1;
        return (st + (int) (Math.random() * offset));
    }

    public static String calGrade(int score) {
        if ((score >= 0) && (score <= 100)) {

            if (score >= 80)
                return "A";

            else if (score >= 75)
                return "B+";

            else if (score >= 70)
                return "B";

            else if (score >= 65)
                return "C+";

            else if (score >= 60)
                return "C";

            else if (score >= 55)
                return "D+";

            else if (score >= 50)
                return "D";

            else
                return "F";
        }
        return "error";
    }
}
