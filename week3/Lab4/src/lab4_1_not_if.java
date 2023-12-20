public class lab4_1_not_if {
// สร้าง class ชื่อ lab4_1_not_if
    public String[] cal_grade() {
    // สร้าง method cal_grade
        String[] grade = new String[102];
        // ประกาศตัวแปร array grade ชนิด String ขนาด 102
        for (int i = 0; i <= 101; i++) {
        // ใช้ loop for โดยประกาศตัวแปร i เท่ากับ 0 ถ้า i น้อยกว่าหรือเท่ากับ 101 ให้เพิ่มค่า i ครั้งละ 1

            grade[i] = i < 50 && i >= 0 ? "F" : i < 55 ? "D" : i < 60 ? "D+" 
               : i < 65 ? "C" : i < 70 ? "C+" : i < 75 ? "B" : i < 80 ? "B+" 
               : i >= 80 && i <= 100 ? "A" : "error";
            // เขียนแบบ Conditional (Ternary) Operator ถ้า i น้อยกว่า 50 และ มากกว่า 0, ค่าของ array grade ตำแหน่งที่ i จะมีค่าเป็น F 
            // ถ้าไม่จะตรวจสอบเงื่อนไขต่อไป 
            // ถ้าไม่เข้าเงื่อนไขไหน ค่าของ array grade ตำแหน่งที่ i จะมีค่าเป็น "error"
        }
        return grade;
        // ส่งค่าในตัวแปร array grade กลับเมื่อมีการเรียกใน method cal_grade
    }
}
