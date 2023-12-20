import javax.swing.JOptionPane;

public class lab_4_1_test {
    public static void main(String[] args) {
        int score = 0;
        // ประกาศตัวแปร score ชนิด int
        String result = "";
        // ประกาศตัวแปร result ชนิด String
        String[] grade;
        // ประกาศตัวแปร array grade ชนิด String

        lab4_1_not_if calGrade = new lab4_1_not_if();
        // ประกาศตัวแปรอ็อบเจ็กต์ของคลาส lab4_1_not_if ชื่อ calGrade 
        grade = calGrade.cal_grade();
        // เรียกใช้เมธอด cal_grade ที่อยู่ในอ็อบเจ็กต์ calGrade และผลลัพธ์ที่ได้จะถูกเก็บไว้ในตัวแปร grade

        score = Integer.parseInt(JOptionPane.showInputDialog("Program Calculate grade\nEnter student score :"));
         // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น int จากคำสั่ง Integer.parseInt แล้วเก็บไว้ในตัวแปร score

        score = score < 0 || score > 100 ? 101 : score;
        // เขียนแบบ Conditional (Ternary) Operator ถ้า score น้อยกว่า 0 หรือ มากกว่า 100, ค่าของ score จะถูกกำหนดเป็น 101 ถ้าไม่จะเป็นค่าเดิม

        result = grade[score];
        // เข้าถึงอาร์เรย์ grade โดยใช้ค่าของ score เป็นค่า index เพื่อดึงค่าจากอาร์เรย์และกำหนดให้กับตัวแปร result

        switch (result) {
        // ตรวจสอบค่าจากตัวแปร result 
            case "error":
             // ถ้าค่าเท่ากับ "error" ให้ทำตามเงื่อนไขนี้
                JOptionPane.showMessageDialog(null, "Program Calculate grade\nEnter student score : Error \nInvalid student score");
                // แสดงผล Invalid student score โดยใช้คำสั่ง JOptionPane.showMessageDialog
                break;
                // หยุดการทำงาน
            default:
            // ถ้าไม่เข้าเงื่อนไขไหนก็จะมาทำเงื่อนไขนี้
                JOptionPane.showMessageDialog(null, "Program Calculate grade\n" + "Enter student score : " + score + " \nStudent grade is " + result);
                // แสดงผล Program Calculate Enter student score : ค่าในตัวแปร score Student grade is ค่าในตัวแปร result โดยใช้คำสั่ง JOptionPane.showMessageDialog
                break;
                // หยุดการทำงาน
                
        }

    }
}
