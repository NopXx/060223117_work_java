import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class test3 {
    public static String printChar(int number) {
    // ประกาศ method printChar มีการส่งค่ากลับเป็น String และมีการรับพารามิเตอร์ 1 ตัวชนิด int
        String txt = "";
        // ประกาศตัวแปร txt ชนิด String
        for (int i = 0; i < number; i++) {
        // ใช้ loop for โดยประกาศตัวแปร i เท่ากับ 0 ถ้า i น้อยกว่า number ให้เพิ่มค่า i ครั้งละ 1
            txt += "*";
            // เพิ่มค่า * ใว้ในตัวแปร txt
        }
        return txt;
        // ส่งค่าในตัวแปร txt กลับ
    }

    public static void main(String[] args) {
        int number;
        // ประกาศตัวแปร number ชนิด int
        String output = "";
        // ประกาศตัวแปร output ชนิด String

        number = Integer.parseInt(JOptionPane.showInputDialog("Enter number: "));
        // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น int จากคำสั่ง Integer.parseInt แล้วเก็บไว้ในตัวแปร number
        while (number > 0) {
        // ใช้ลูป while ถ้า number มากกว่า 0 ให้เข้ามาทำงาน
            output += number + " : " + printChar(number) + "\n";
            // เพิ่มค่า number : เรียกใช้ method printChar และส่งพารามิเตอร์ number เพื่อให้ได้ค่ากลับมา \n ใว้ในตัวแปร output
            number = Integer.parseInt(JOptionPane.showInputDialog("Enter number: "));
            // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น int จากคำสั่ง Integer.parseInt แล้วเก็บไว้ในตัวแปร number
        }
        JOptionPane.showMessageDialog(null, new JTextArea(output), "Histogram", 1);
        // แสดงผลผ่าน JOptionPane.showMessageDialog แสดงด้วย JTextArea(output)
    }
}
