import javax.swing.JOptionPane;

public class lab_4_2_not_switch {
    public static void main(String[] args) {
        int num1, num2;
        // ประกาศตัวแปร num1, num2 ชนิด int
        double result = 0;
        // ประกาศตัวแปร result ชนิด double
        char operator;
        // ประกาศตัวแปร operator ชนิด char
        boolean done = true;
        // ประกาศตัวแปร done ชนิด boolean
        String message = "";

        // ประกาศตัวแปร message ชนิด String
        num1 = Integer.parseInt(JOptionPane.showInputDialog("Enter first value :"));
        // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น int จากคำสั่ง Integer.parseInt แล้วเก็บไว้ในตัวแปร num1
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Enter second value :"));
        // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วแปลงค่าเป็น int จากคำสั่ง Integer.parseInt แล้วเก็บไว้ในตัวแปร num2
        operator = JOptionPane.showInputDialog("Enter operator(+, -, *, /, %) : ").charAt(0);
        // รับค่าจากคำสั่ง JOptionPane.showInputDialog แล้วเก็บไว้ในตัวแปร operator โดยเก็บค่า String ตัวแรกจากคำสั่ง charAt(0)

        if (operator == '+') {
        // ถ้าค่าเท่ากับ + ให้ทำตามเงื่อนไขนี้
            result = num1 + num2;
            // นำค่าในตัวแปร num1 กับ num2 มาบอกกัน แล้วเก็บไว้ในตัวแปร result
            message = "Result : "+ num1 + " + " + num2 + " = ";
            // เก็บค่า Result : ค่าในตัวแปร num1 + ค่าในตัวแปร num2  = แล้วเก็บไว้ในตัวแปร message
        } else if (operator == '-') {
        // ถ้าค่าเท่ากับ - ให้ทำตามเงื่อนไขนี้
            result = num1 - num2;
            // นำค่าในตัวแปร num1 กับ num2 มาลบกัน แล้วเก็บไว้ในตัวแปร result
            message = "Result : "+ num1 + " - " + num2 + " = ";
            // เก็บค่า Result : ค่าในตัวแปร num1 - ค่าในตัวแปร num2  = แล้วเก็บไว้ในตัวแปร message
        } else if (operator == '*') {
        // ถ้าค่าเท่ากับ * ให้ทำตามเงื่อนไขนี้
            result = num1 * num2;
            // นำค่าในตัวแปร num1 กับ num2 มาคูณกัน แล้วเก็บไว้ในตัวแปร result
            message = "Result : " + num1 + " * " + num2 + " = ";
            // เก็บค่า Result : ค่าในตัวแปร num1 * ค่าในตัวแปร num2  = แล้วเก็บไว้ในตัวแปร message
        } else if (operator == '/') {
        // ถ้าค่าเท่ากับ / ให้ทำตามเงื่อนไขนี้
            result = (double)num1 / num2;
            // นำค่าในตัวแปร num1 กับ num2 มาหารกัน แล้วเก็บไว้ในตัวแปร result
            message = "Result : " + num1 + " / " + num2 + " = ";
            // เก็บค่า Result : ค่าในตัวแปร num1 / ค่าในตัวแปร num2  = แล้วเก็บไว้ในตัวแปร message
        } else if (operator == '%') {
        // ถ้าค่าเท่ากับ % ให้ทำตามเงื่อนไขนี้
            result = num1 % num2;
            // นำค่าในตัวแปร num1 กับ num2 มาหารเอาเศษกัน แล้วเก็บไว้ในตัวแปร result
            message = "Result : " + num1 + " % " + num2 + " = ";
            // เก็บค่า Result : ค่าในตัวแปร num1 % ค่าในตัวแปร num2  = แล้วเก็บไว้ในตัวแปร message
        } else {
        // ถ้าไม่เข้าเงื่อนไขไหนก็จะมาทำเงื่อนไขนี้
            done = false;
            // เก็บค่า false ในตัวแปร done
        }
        if (done) {
        // ถ้าค่าในตัวแปร done เท่ากับ true ให้ทำตามเงื่อนไขนี้
            JOptionPane.showMessageDialog(null, message + result);
            // แสดงผล ข้อมูลในตัวแปร message result โดยใช้คำสั่ง JOptionPane.showMessageDialog
        } else {
            JOptionPane.showMessageDialog(null, "Invalid operator");
            // แสดงผล Invalid operator โดยใช้คำสั่ง JOptionPane.showMessageDialog
        }

    }
}
