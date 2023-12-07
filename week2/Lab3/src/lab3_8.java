import java.util.Scanner;

public class lab3_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float hours, rate, salary;

        System.out.print("Enter your hours work: ");
        hours = scan.nextFloat();
        System.out.print("Enter your hourly rate: ");
        rate = scan.nextFloat();

        salary = (hours <= 40) ? (hours * rate) : (rate * (1.5f * hours - 20));
        System.out.println("Employee get salary : " + salary);
        scan.close();
    }
}
