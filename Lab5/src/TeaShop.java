import java.util.Scanner;

public class TeaShop {
    private int water, suga, green, honey, flower, day;
    private int total_tea, total_teaog;


    public void inputSupplies() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------------------------------------");
        System.out.println("-------------- Day " + day + " -----------------");
        System.out.println("------------ Supplier ----------------");

        System.out.print("Enter water (ml) : ");
        this.water += scanner.nextInt();
        System.out.print("Enter Suga (g) : ");
        suga += scanner.nextInt();
        System.out.print("Enter Green tea (g) : ");
        green += scanner.nextInt();
        System.out.print("Enter Honey (g) : ");
        honey += scanner.nextInt();
        System.out.print("Enter Flower (g) : ");
        flower += scanner.nextInt();
    }

    public void calTea() {
        int tod_flower = flower / 20;
        int tod_honey = honey / 75;
        int tod_green = green / 25;
        int tod_water = water / 200;

        int maxt = Math.min(tod_honey, Math.min(tod_flower, Math.min(tod_green, tod_water)));

        total_tea += maxt;
        flower -= (20 * maxt);
        honey -= (75 * maxt);
        green -= (25 * maxt);
        water -= (200 * maxt);
    }

    public void calTeaOG() {
        if (water >= 200 && green >= 25) {
            int ogd_green = green / 25;
            int ogd_water = water / 200;
            int ogd_suga = suga / 50;

            int maxog = Math.min(ogd_green, Math.min(ogd_water, ogd_suga));

            total_teaog += maxog;
            suga -= (50 * maxog);
            green -= (25 * maxog);
            water -= (200 * maxog);
        }
    }

    public void displaySummary() {
        System.out.println("--------------------------------------");
        System.out.println("---------------- Day " + day + " --------------");
        System.out.println("Green Teen OG : " + total_teaog);
        System.out.println("Green Teen Flower : " + total_tea);
        System.out.println("--------------------------------------");
        System.out.println("Water : " + water);
        System.out.println("Suga : " + suga);
        System.out.println("Green Teen : " + green);
        System.out.println("honey : " + honey);
        System.out.println("Flower : " + flower);
    }

    public void runFactory() {
        for (day = 1; day <= 30; day++) {
            inputSupplies();
            calTea();
            calTeaOG();
            displaySummary();
            
        }
    }

    public static void main(String[] args) {
        TeaShop teaShop = new TeaShop();
        teaShop.runFactory();
    }
}
