/**
 * mid
 */
public class mid {

    public boolean isNumber(String number) {
        boolean isNumber = true;
        try {
            Integer.parseInt(number);
        } catch (Exception e) {
            isNumber = false;
        }
        return isNumber;
    }
    public static boolean isRealNumber(String number) {
        boolean isRealNumber = true;
        try {
            Double.parseDouble(number);
        } catch (Exception e) {
            isRealNumber = false;
        }
        return isRealNumber;
    }

    public static boolean isPrime(int number) {
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
        return isPrime;
    }

    public static int cutInteger(String input) {
        int index = 0;
        String arr[] = new String[2];
        arr[0] = "";
        arr[1] = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '.') {
                arr[index] += String.valueOf(input.charAt(i));
            } else {
                index++;
            }
        }
        return Integer.parseInt(arr[0]);
    }

    public static int cutRealNumber(String input) {
        int index = 0;
        String arr[] = new String[2];
        arr[0] = "";
        arr[1] = "";
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '.') {
                arr[index] += String.valueOf(input.charAt(i));
            } else {
                index++;
            }
        }
        return Integer.parseInt(arr[index]);
    }

    public static void main(String[] args) {
        System.out.println("isNumber");
        mid m = new mid();
        System.out.println("123 is " + m.isNumber("123"));
        System.out.println("123.12 is " + m.isNumber("123.12"));

        System.out.println("isRealNumber");
        System.out.println("123 is " + isRealNumber("123"));
        System.out.println("123.12 is " + isRealNumber("123.12"));

        System.out.println("isPrime");
        System.out.println("10 is " + isPrime(10));
        System.out.println("11 is " + isPrime(11));

        System.out.println("cutInteger");
        System.out.println("123 is " + cutInteger("123"));
        System.out.println("123.12 is " + cutInteger("123.12"));

        System.out.println("cutRealNumber");
        System.out.println("123.2 is " + cutRealNumber("123.2"));
        System.out.println("123.12 is " + cutRealNumber("123.12"));
    }
}