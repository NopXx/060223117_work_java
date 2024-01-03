import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class test2 {
    public static void main(String[] args) {
        long number, rawNumber;
        // ประกาศตัวแปร number, rawNumber ชนิด long
        String message = "";
        // ประกาศตัวแปร message ชนิด String

        rawNumber = Long.parseLong(JOptionPane.showInputDialog("Enter positive number : "));
        // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น long จากคำสั่ง Long.parseLong แล้วเก็บไว้ในตัวแปร rawNumber

        int odd = 0, even = 0, zero = 0;
        // ประกาศตัวแปร odd = 0, even = 0, zero = 0 ชนิด long

        number = rawNumber;
        // เก็บของ rawNumber ไว้ในตัวแปร number

        if (rawNumber == 0) {
        // ถ้า rawNumber เท่ากับ 0 ให้เข้าทำทำงานตามเงื่อนไข
            zero = 1;
            // เก็บข้อมูล 1 ไว้ในตัวแปร zero
        } else {
        // ถ้าไม่ใช่ 
            while (number != 0) {
            // ใช้ loop while ถ้า number ไม่เท่ากับ 0 ไว้เข้ามาทำงานตามเงื่อนไข
                Long digit = number % 10;
                // ประกาศตัวแปร digit ชนิด long และ เก็บค่า number mod 10 

                if (digit == 0) {
                // ถ้า digit เท่ากับ 0 ให้เข้าทำทำงานตามเงื่อนไข
                    zero++;
                    // เพิ่มข้อมูล zero + 1
                } else if (digit % 2 == 0) {
                // หรือ ถ้า digit mod 2 เท่ากับ 0 ให้เข้าทำทำงานตามเงื่อนไข
                    even++;
                    // เพิ่มข้อมูล even + 1
                } else {
                // ถ้าไม่ใช่
                    odd++;
                    // เพิ่มข้อมูล odd + 1
                }

                number /= 10;
                // เก็บค่า number / 10 ไว้ในตัวแปร number
            }
        }
        message += "Enter positive number : " + rawNumber + "\n\n";
        message += "Odd : " + odd + "\n";
        message += "Even : " + even + "\n";
        message += "Zero : " + zero + "\n";
        // เก็บข้อมูลไว้ในตัวแปร message

        JOptionPane.showMessageDialog(null, new JTextArea(message));
        // แสดงผล ข้อมูลในตัวแปร message โดยใช้คำสั่ง JOptionPane.showMessageDialog และ JTextArea
    }
}
