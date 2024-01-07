import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class TestStrandom {
    // ประกาศ method Display return ข้อมูลเป็น String และมีการรับพารามิเตอร์ title, message ชนิด String
    public static String Display(String title, String message) {
        String output = "";
        // ประกาศตัวแปร output ชนิด String

        for (int n = 1; n <= 55; n++)
        // ใช้ loop for โดยประกาศตัวแปร n = 1 ถ้า n น้อยกว่าหรือเท่ากับ 55 ให้เพิ่มค่า n ครั้งละ 1
            output += "=";
            // เพิ่มข้อมูล = ไว้ในตัวแปร output
        output += "\n \t"+ title +"\n";
        // เพิ่มข้อมูล "\n \t"+ title +"\n" ไว้ในตัวแปร output

        for (int n = 1; n <= 55; n++)
        // ใช้ loop for โดยประกาศตัวแปร n = 1 ถ้า n น้อยกว่าหรือเท่ากับ 55 ให้เพิ่มค่า n ครั้งละ 1
            output += "=";
            // เพิ่มข้อมูล = ไว้ในตัวแปร output
        output += "\n" + message;
        // เพิ่มข้อมูล "\n" + message ไว้ในตัวแปร output

        return output;
        // ส่งค่าในตัวแปร output กลับ
    }
    public static void main(String[] args) {
        // ประกาศตัวแปร rand ตามโครงสร้าง class stRandom
        stRandom rand = new stRandom();
        String message1 = "", message2 = "", message3 = "", message4 = "";
        // ประกาศตัวแปร message1, message2, message3, message4 ชนิด String
        int row = 0, start = 0, end = 0;
        // ประกาศตัวแปร row, start, end ชนิด int
        
        start = Integer.parseInt(JOptionPane.showInputDialog("Enter start number "));
        // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น int จากคำสั่ง Integer.parseInt แล้วเก็บไว้ในตัวแปร start
        end = Integer.parseInt(JOptionPane.showInputDialog("Enter end number "));
        // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น int จากคำสั่ง Integer.parseInt แล้วเก็บไว้ในตัวแปร end
        
        for (int i = 1; i <= 20; i++) {
        // ใช้ loop for โดยประกาศตัวแปร i เท่ากับ 1 ถ้า i น้อยกว่าหรือเท่ากับ 20 ให้เพิ่มค่า i ครั้งละ 1

                message1 += rand.random(start, end) + "\t";
                // ใช้ method random ในตัวแปร rand และส่งพารามิเตอร์ 20, 50 ไป เพิ่มค่าที่ส่งกลับมาใว้ในตัวแปร message1

                message2 += rand.randomStartx100(start) + "\t";
                // ใช้ method randomStartx100 ในตัวแปร rand และส่งพารามิเตอร์ 20 ไป เพิ่มค่าที่ส่งกลับมาใว้ในตัวแปร message2

                message3 += rand.random0(end) + "\t";
                // ใช้ method random0 ในตัวแปร rand และส่งพารามิเตอร์ 20 ไป เพิ่มค่าที่ส่งกลับมาใว้ในตัวแปร message3

                message4 += rand.random1(end) + "\t";
                // ใช้ method random1 ในตัวแปร rand และส่งพารามิเตอร์ 50 ไป เพิ่มค่าที่ส่งกลับมาใว้ในตัวแปร message4

                row++;
                // เพิ่มค่า row = row + 1

            if (row % 5 == 0) {
            // ถ้า row mod 5 เท่ากับ 0 ให้เข้ามาทำเงื่อนไข
                message1 += "\n";
                // เพิ่มค่า \n ใว้ในตัวแปร message1
                message2 += "\n";
                // เพิ่มค่า \n ใว้ในตัวแปร message2
                message3 += "\n";
                // เพิ่มค่า \n ใว้ในตัวแปร message3
                message4 += "\n";
                // เพิ่มค่า \n ใว้ในตัวแปร message4
                row = 0;
                // กำหนดค่าในตัวแปร row เท่ากับ 0
            }
        }

        String output = "";
        // ประกาศตัวแปร output ชนิด String

        output += Display("Random Start "+start+" - End " + end, message1);
        // ใช้ method Display ส่งพารามิเตอร์ Random Start + ค่าในตัวแปร start - End + ค่าในตัวแปร end, message1 ไป และเพิ่มค่าที่ส่งกลับมาใว้ในตัวแปร output
        output += Display("RandomStart x 100 Start " + start, message2);
        // ใช้ method Display ส่งพารามิเตอร์ RandomStart x 100 Start + ค่าในตัวแปร start, message2 ไป และเพิ่มค่าที่ส่งกลับมาใว้ในตัวแปร output
        output += Display("Random0 End " + end, message3);
        // ใช้ method Display ส่งพารามิเตอร์ Random0 End + ค่าในตัวแปร end, message3 ไป และเพิ่มค่าที่ส่งกลับมาใว้ในตัวแปร output
        output += Display("Random1 End " + end, message4);
        // ใช้ method Display ส่งพารามิเตอร์ Random1 End + ค่าในตัวแปร end, message4 ไป และเพิ่มค่าที่ส่งกลับมาใว้ในตัวแปร output


         JOptionPane.showMessageDialog(null, new JTextArea(output),
                "StdRandom",1);
        // แสดงผลผ่าน JOptionPane.showMessageDialog แสดงด้วย JTextArea(output)
    }
}
