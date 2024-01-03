import javax.swing.JOptionPane;

public class test3 {
    public static void main(String[] args) {
        int number;
        // ประกาศตัวแปร number ชนิด int
        number = Integer.parseInt(JOptionPane.showInputDialog("Enter positive number : "));
        // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น int จากคำสั่ง Integer.parseInt แล้วเก็บไว้ในตัวแปร number
        /*
        if ((number <= 1 || number % 2 == 0 || number % 3 == 0 || number % 5 == 0 ||
        number % 7 == 0)
        && (number != 2 && number != 3 && number != 5 && number != 7)) {
        JOptionPane.showMessageDialog(null, "number "+ number +" is not prime
        number");
        } else {
        JOptionPane.showMessageDialog(null, "number "+ number +" is prime number");
        }
        */
        boolean isPrime = true;
        // ประกาศตัวแปร isPrime ชนิด boolean มีค่าเป็น true

        if (number <= 1) {
        // ถ้า number น้อยกว่าหรือเท่ากับ 1 ให้เข้าทำทำงานตามเงื่อนไข
            isPrime = false;
            // ค่าในตัวแปร isPrime = false
        } else {
        // ถ้าไม่ใช่
            for (int i = 2; i * i < number; i++) {
                // ใช้ loop for โดยประกาศตัวแปร i เท่ากับ 2 ถ้า i * i น้อยกว่า number ให้เพิ่มค่า i ครั้งละ 1
                // i * i เพื่อลดรอบการทำซ้ำ เพราะ ถ้า i * i แล้วมากกว่า number ก็แสดงว่า
                // เกินค่าของรากที่ 2 ของ number แล้วเลยไม่จำเป็นต้องทำงาน loop อีก
                // และค่า number ก็คือจำนวนเฉพาะ
                if (number % i == 0) {
                // ถ้า number mod i เท่ากับ 0 ให้เข้าทำทำงานตามเงื่อนไข
                    isPrime = false;
                    // ค่าในตัวแปร isPrime = false
                    break;
                    // หยุดการทำงานของ loop
                }
            }
        }
        if (isPrime) {
        // ถ้า isPrime เท่ากับ true ให้เข้าทำทำงานตามเงื่อนไข
            JOptionPane.showMessageDialog(null, "number " + number + " is prime number");
            // แสดงผล number : ค่าในตัวแปร number is prime number โดยใช้คำสั่ง JOptionPane.showMessageDialog
        } else {
        // ถ้าไม่ใช่
            JOptionPane.showMessageDialog(null, "number " + number + " is not prime number");
            // แสดงผล number : ค่าในตัวแปร number is not prime number โดยใช้คำสั่ง JOptionPane.showMessageDialog
        }
    }
}
