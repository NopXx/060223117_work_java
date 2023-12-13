import javax.swing.JOptionPane;

public class test1 {
    public static void main(String[] args) {
        float c, f;
        // ประกาศตัาแปร c, f ชนิด float

        c = Float.parseFloat(JOptionPane.showInputDialog("Enter Celsius: "));
        // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น float จากคำสั่ง Float.parseFloat แล้วเก็บไว้ในตัวแปร c

        f = (9f / 5f) * c + 32;
        // คำนวณผลตามสูตร แล้วเก็บไว้ในตัวแปร f

        JOptionPane.showMessageDialog(null, "The temperature in Fahrenheit is: " + f, "Result", 1);
        // แสดงผล The temperature in Fahrenheit is: ข้อมูลในตัวแปร f โดยใช้คำสั่ง JOptionPane.showMessageDialog
    }
    
}
