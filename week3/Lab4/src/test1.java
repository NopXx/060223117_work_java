import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class test1 {
    public static void main(String[] args) {
        int num1, num2, row = 0;
        // ประกาศตัวแปร num1, num2, row ชนิด int

        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter start number : "));
        // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น int จากคำสั่ง Integer.parseInt แล้วเก็บไว้ในตัวแปร num1
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter end number : "));
        // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น int จากคำสั่ง Integer.parseInt แล้วเก็บไว้ในตัวแปร num2

        String result = "";
        // ประกาศตัวแปร result ชนิด String

        for (int i = num1; i <= num2; i++) {
        // ใช้ loop for โดยประกาศตัวแปร i เท่ากับค่าในตัวแปร num1 ถ้า i น้อยกว่าหรือเท่ากับ num2 ให้เพิ่มค่า i ครั้งละ 1
            if ((i % 3 == 0) && (i % 5 == 0)) {
            // ถ้า i mod 3 แล้วเท่ากับ 0 และ i mod 5 เท่ากับ 0 ให้เข้าทำทำงานตามเงื่อนไข
                result += i + "\t";
                // เก็บข้อมูลไว้ในตัวแปร result
                row++;
                // เพิ่มข้อมูล row + 1
                if (row % 5 == 0) {
                // ถ้า row mod 5 เท่ากับ 0 ให้เข้าทำทำงานตามเงื่อนไข
                    result += "\n";
                    // เก็บข้อมูลไว้ในตัวแปร result
                }
            }
        }

        JOptionPane.showMessageDialog(null, new JTextArea(result));
        // แสดงผล ข้อมูลในตัวแปร result โดยใช้คำสั่ง JOptionPane.showMessageDialog และ JTextArea
    }
}
