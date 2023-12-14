import javax.swing.JOptionPane;

public class lab4_1 {
    public static void main(String[] args) {
        int score;
        // ประกาศตัวแปร score ชนิด int
        score = Integer.parseInt(JOptionPane.showInputDialog("Program Calculate grade\nEnter student score :"));
        // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น int จากคำสั่ง Integer.parseInt แล้วเก็บไว้ในตัวแปร score
        if ((score >= 0) && (score <= 100)) {
        // ถ้า score มีค่ามากกว่าหรือเท่ากับ 0 และ score มีค่าน้อยกว่าหรือเท่ากับ 100 จะเข้ามาทำงาน
            String grade;
            // ประกาศตัวแปร grade ชนิด String
            if (score >= 80) grade = "A";
            // ถ้า score มีค่ามากกว่าหรือเท่ากับ 80 ตัวแปร grade จะมีค่าเท่ากับ A
            else if (score >= 75) grade = "B+";
            // ถ้า score มีค่ามากกว่าหรือเท่ากับ 75 ตัวแปร grade จะมีค่าเท่ากับ B+
            else if (score >= 70) grade = "B";
            // ถ้า score มีค่ามากกว่าหรือเท่ากับ 70 ตัวแปร grade จะมีค่าเท่ากับ B
            else if (score >= 65) grade = "C+";
            // ถ้า score มีค่ามากกว่าหรือเท่ากับ 65 ตัวแปร grade จะมีค่าเท่ากับ C+
            else if (score >= 60) grade = "C";
            // ถ้า score มีค่ามากกว่าหรือเท่ากับ 60 ตัวแปร grade จะมีค่าเท่ากับ C
            else if (score >= 55) grade = "D+";
            // ถ้า score มีค่ามากกว่าหรือเท่ากับ 55 ตัวแปร grade จะมีค่าเท่ากับ D+
            else if (score >= 50) grade = "D";
            // ถ้า score มีค่ามากกว่าหรือเท่ากับ 50 ตัวแปร grade จะมีค่าเท่ากับ D
            else grade = "F";
            // ถ้าไม่เข้าเงื่อนไขไหนเลย grade จะมีค่าเท่ากับ F

             JOptionPane.showMessageDialog(null, "Program Calculate grade\n" + "Enter student score :" + score + " \nStudent grade is " + grade);
            // แสดงผล Student grade is ข้อมูลในตัวแปร grade โดยใช้คำสั่ง JOptionPane.showMessageDialog
        } else {
            JOptionPane.showMessageDialog(null, "Program Calculate grade\nEnter student score :" + score + " \nInvalid student score");
            // แสดงผล Invalid student score โดยใช้คำสั่ง JOptionPane.showMessageDialog
        }
    
    }
}
