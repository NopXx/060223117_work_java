import javax.swing.JOptionPane;

public class test2 {
    public static void main(String[] args) {

        int start, end, step, sum;
        // ประกาศตัวแปร start, end, step, sum ชนิด int
        String output;
        // ประกาศตัวแปร outpput ชนิด String

        start = Integer.parseInt(JOptionPane.showInputDialog("Enter start number :" ));
        // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น int จากคำสั่ง Integer.parseInt แล้วเก็บไว้ในตัวแปร start
        end = Integer.parseInt(JOptionPane.showInputDialog("Enter end number :" ));
        // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น int จากคำสั่ง Integer.parseInt แล้วเก็บไว้ในตัวแปร end

        // ใช้ loop do while
        do {
            step = Integer.parseInt(JOptionPane.showInputDialog("Enter step :" ));
            // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น int จากคำสั่ง Integer.parseInt แล้วเก็บไว้ในตัวแปร step
        } while (step < 1);
        // ถ้า step น้อยกว่า 1 ให้เข้าไปทำงานใน do

        if (start < end) {
        // ถ้า start น้อยกว่า end ให้เข้ามาทำงาน
            sum = Sumation(start, end, step);
            // เรียกใช้ method Sumation และส่งพารามิเตอร์ start, end, step ไป ค่าที่ส่งกลับมาให้เก็บไว้ในตัวแปร sum
            output = "Sum of "+ start +" to " + end + " is " + sum + " step " + step;
            // เก็บค่า Sum of + ค่าใน start + to + ค่าใน end + is + ค่าใน sum + step + ค่าใน step
        } else {
        // ถ้าไม่ ให้เข้ามาทำงาน

            sum = Sumation(end, start, step);
            // เรียกใช้ method Sumation และส่งพารามิเตอร์ end, start, step ไป ค่าที่ส่งกลับมาให้เก็บไว้ในตัวแปร sum
            output = "Sum of "+ end +" to " + start + " is " + sum + " step " + step;
            // เก็บค่า Sum of + ค่าใน end + to + ค่าใน start + is + ค่าใน sum + step + ค่าใน step
        }
        System.err.println(1 < 1);
        JOptionPane.showMessageDialog(null, output, "Sumation", 1);
        // แสดงผลค่าในตัวแปร output ผ่าน JOptionPane.showMessageDialog 

    }

    public static int Sumation(int start, int end, int step) {
    // ประกาศ method Sumation มีการส่งค่ากลับเป็น int และมีการรับพารามิเตอร์ 3 ตัวชนิด int
        if (start <= end) {
        // ถ้า start น้อยกว่าหรือเท่ากับ end ให้เข้ามาทำเงื่อนไข
            return start + Sumation(start + step, end, step);
            // เรียกใช้ method Sumation และส่งพารามิเตอร์ start + step, end, step เมื่อได้ค่ากลับมาแล้วให้เอามาบวกกับ start แล้วส่งค่ากลับ
        } else return 0;
        // ถ้าไม่ ให้ส่งค่า 0 กลับ
    }
}
