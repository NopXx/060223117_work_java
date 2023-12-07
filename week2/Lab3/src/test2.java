import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        float money, rate;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the amount of money: ");
        money = scan.nextFloat();
        System.out.print("Enter the interest rate: ");
        rate = scan.nextFloat();
        for (int i = 1; i <= 5; i++) {
            money += money * rate / 100;
            System.out.print("Year " + i + " Money : ");
            System.out.printf("%.2f",money);
            System.out.println();
        }
        scan.close();
    }
}
