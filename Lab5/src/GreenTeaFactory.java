import java.util.Scanner;

class GreenTeaFactory {
    private int greenTeaLeaves;  // จำนวนใบชาเขียวทั้งหมด
    private int water;           // จำนวนน้ำทั้งหมด
    private int sugar;           // จำนวนน้ำตาลทั้งหมด
    private int honey;           // จำนวนน้ำผึ้งทั้งหมด
    private int gingerFlower;    // จำนวนดอกเก็กฮวยทั้งหมด

    // Constructor
    public GreenTeaFactory() {
        this.greenTeaLeaves = 0;
        this.water = 0;
        this.sugar = 0;
        this.honey = 0;
        this.gingerFlower = 0;
    }

    // Method รับวัตถุดิบจาก Supplier
    public void receiveIngredients() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of green tea leaves received: ");
        this.greenTeaLeaves += scanner.nextInt();

        System.out.print("Enter the amount of water received (in ml): ");
        this.water += scanner.nextInt();

        System.out.print("Enter the amount of sugar received (in grams): ");
        this.sugar += scanner.nextInt();

        System.out.print("Enter the amount of honey received (in grams): ");
        this.honey += scanner.nextInt();

        System.out.print("Enter the amount of ginger flower received (in grams): ");
        this.gingerFlower += scanner.nextInt();
    }

    // Method ผลิตชาเขียวรสเก็กฮวยผสมน้ำผึ้งจนวัตถุดิบหมด
    public void produceGingerHoneyGreenTea() {
        while (canProduceGingerHoneyGreenTea()) {
            this.greenTeaLeaves -= 25;
            this.water -= 200;
            this.honey -= 75;
            this.gingerFlower -= 20;
            System.out.println("Producing Ginger Honey Green Tea...");
        }
    }

    // Method ผลิตชาเขียวต้นรสตำรับ ในระยะเวลา 30 วัน
    public void produceOriginalGreenTea(int days) {
        for (int day = 1; day <= days; day++) {
            System.out.println("Day " + day + ": Producing Original Green Tea...");
            this.greenTeaLeaves -= 25;
            this.water -= 200;
            this.sugar -= 50;
        }
    }

    // Method ตรวจสอบว่าสามารถผลิตชาเขียวรสเก็กฮวยผสมน้ำผึ้งได้หรือไม่
    private boolean canProduceGingerHoneyGreenTea() {
        return this.greenTeaLeaves >= 25 && this.water >= 200 && this.honey >= 75 && this.gingerFlower >= 20;
    }

    // Method แสดงผลลัพธ์
    public void displayResults() {
        System.out.println("Total Ginger Honey Green Tea produced: " + (30 - this.greenTeaLeaves / 25));
        System.out.println("Total Original Green Tea produced: 30");
        System.out.println("Remaining Ingredients:");
        System.out.println("Green Tea Leaves: " + this.greenTeaLeaves);
        System.out.println("Water: " + this.water + " ml");
        System.out.println("Sugar: " + this.sugar + " grams");
        System.out.println("Honey: " + this.honey + " grams");
        System.out.println("Ginger Flower: " + this.gingerFlower + " grams");
    }

    public static void main(String[] args) {
        GreenTeaFactory factory = new GreenTeaFactory();
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of days for production: ");
        int days = scanner.nextInt();

        for (int day = 1; day <= days; day++) {
            System.out.println("\nDay " + day + ":");
            factory.receiveIngredients();
            factory.produceGingerHoneyGreenTea();
        }

        factory.produceOriginalGreenTea(30);
        factory.displayResults();
    }
}
