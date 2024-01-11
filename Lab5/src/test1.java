import javax.swing.JOptionPane;

public class test1 {
    public static void main(String[] args) {
        int number;
        // ประกาศตัวแปร number ชนิด int
        double totalScore; 
        // ประกาศตัวแปร totalScore ชนิด double

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter number of score : "));
        // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น int จากคำสั่ง Integer.parseInt แล้วเก็บไว้ในตัวแปร number

        totalScore = getScore(number);
        // เรียกใช้ method getScore และส่งพารามิเตอร์ number ไป ค่าที่ส่งกลับมาให้เก็บไว้ในตัวแปร totalScore

        JOptionPane.showMessageDialog(null, "Average Score is " + average(totalScore, number), "Result", 1);
        // แสดงผลผ่าน JOptionPane.showMessageDialog Average Score is เรียกใช้ method average และส่งพารามิเตอร์ totalScore, number เพื่อหาและแสดงคะแนนเฉลี่ย

    }

    public static double getScore(int n) {
    // ประกาศ method getScore มีการส่งค่ากลับเป็น double และมีการรับพารามิเตอร์ 1 ตัวชนิด int
        double totalScore = 0;
        // ประกาศตัวแปร totalScore ชนิด double

        for (int i = 1; i <= n; i++) {
        // ใช้ loop for โดยประกาศตัวแปร i เท่ากับ 1 ถ้า i น้อยกว่าหรือเท่ากับ n ให้เพิ่มค่า i ครั้งละ 1
            totalScore += Double.parseDouble(JOptionPane.showInputDialog("Enter Score " + i));
            // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น double จากคำสั่ง Double.parseDouble แล้วบวกตัวข้อมูลที่มีอยู่แล้วเก็บไว้ในตัวแปร totalScore
        }
        return totalScore;
        // ส่งค่าในตัวแปร totalScore กลับ
    }

    public static double average(double score, int n) {
    // ประกาศ method average มีการส่งค่ากลับเป็น double และมีการรับพารามิเตอร์ 2 ตัวชนิด int และ double
        return score / (double) n;
        // เอาค่าใน score หาร (double) n คือ แปลงค่าใน n เป็น double หารเสร็จแล้วส่งค่ากลับ

    }
}
