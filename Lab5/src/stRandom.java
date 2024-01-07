// ประกาศ class stRandom
public class stRandom {
    // ประกาศ method random return ข้อมูลเป็น int และมีการรับพารามิเตอร์ start, end ชนิด int
    public int random(int start, int end) {
        // ประกาศตัวแปร result ชนิด int
        int result;
        // ใช้ลูป do-while
        do {
            // ใช้ Math.random() เพื่อสุ่มตัวเลข 0.0 - 1.0
            // พอได้ค่ามาแล้วเอาไปคูณกับค่า end เพื่อไม่ให้ค่าที่ส่งกับไม่เกินค่า end
            // (int) แปลงค่าที่ได้เป็น int และเก็บไว้ในตัวแปร result
            result = (int) (Math.random() * end);
        } while (result < start);
        // ลูปจะหยุดทำงานเมื่อ ค่าจาก result มากกว่า ค่าจาก start
        return result;
        // ส่งค่าในตัวแปร result กลับ
    }

    public int randomStartx100(int start) {
    // ประกาศ method randomStartx100 return ข้อมูลเป็น int และมีการรับพารามิเตอร์ start ชนิด int
        int result;
        // ประกาศตัวแปร result ชนิด int

        // ใช้ลูป do-while
         do {
            // ใช้ Math.random() เพื่อสุ่มตัวเลข 0.0 - 1.0
            // พอได้ค่ามาแล้วเอาไปคูณกับค่า start x 100 เพื่อไม่ให้ค่าที่ส่งกับไม่เกินค่า start * 100
            // (int) แปลงค่าที่ได้เป็น int และเก็บไว้ในตัวแปร result
            result =  (int) (Math.random() * (start * 100));
        } while (result < start);
        // ลูปจะหยุดทำงานเมื่อ ค่าจาก result มากกว่า ค่าจาก start
        return result;
        // ส่งค่าในตัวแปร result กลับ
    }

    public int random0(int end) {
    // ประกาศ method random0 return ข้อมูลเป็น int และมีการรับพารามิเตอร์ start ชนิด int

        // ใช้ Math.random() เพื่อสุ่มตัวเลข 0.0 - 1.0
        // พอได้ค่ามาแล้วเอาไปคูณกับค่า end เพื่อไม่ให้ค่าที่ส่งกับไม่เกินค่า end
        // (int) แปลงค่าที่ได้เป็น int และและส่งค่ากลับ
        return (int) (Math.random() * end);
    }

    public int random1(int end) {
    // ประกาศ method random1 return ข้อมูลเป็น int และมีการรับพารามิเตอร์ start ชนิด int
        
        // ใช้ Math.random() เพื่อสุ่มตัวเลข 0.0 - 1.0
        // พอได้ค่ามาแล้วเอาไปคูณกับค่า end เพื่อไม่ให้ค่าที่ส่งกับไม่เกินค่า end
        // 1 + เป็นการสุ่มให้อยู่ในช่วง [1, end].
        // (int) แปลงค่าที่ได้เป็น int และส่งค่ากลับ
        return 1 + (int) (Math.random() * end);
    }


}
