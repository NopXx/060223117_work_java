import javax.swing.JOptionPane;

public class test2 {
    public static void main(String[] args) {
        float money, rate;
        // ประกาศตัาแปร money, rate ชนิด float
        String message = "";
        // ประกาศตัาแปร message ชนิด String

        money = Float.parseFloat(JOptionPane.showInputDialog("Enter the amount of money: "));
        // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น float จากคำสั่ง Float.parseFloat แล้วเก็บไว้ในตัวแปร money

        rate = Float.parseFloat(JOptionPane.showInputDialog("Enter the interest rate: "));
        // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น float จากคำสั่ง Float.parseFloat แล้วเก็บไว้ในตัวแปร rate 
        
        for (int i = 1; i <= 5; i++) {
        // ใช้ loop for โดยประกาศตัวแปร i เท่ากับ 1 ถ้า i น้อยกว่า 5 ให้เพิ่มค่า i ครั้งละ 1

            money += money * rate / 100;
            // คำนวณผลตามสูตร แล้วเอาค่าที่คำนวณได้มาบอกกับค่าในตัวแปร money

            message += "Year " + i + ", Money : " + String.format("%.2f", money) + "\n";
            // เก็บค่าในตัวแปร message โดยเก็บต่อจากค่าเดิมในตัวแปร

        }
        JOptionPane.showMessageDialog(null, message, "Result", 1);
        // แสดงผลข้อมูลในตัวแปร message โดยใช้คำสั่ง JOptionPane.showMessageDialog

    }
}
