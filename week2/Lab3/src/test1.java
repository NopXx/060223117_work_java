import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        float c, f;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter Celsius: ");
        c = scan.nextFloat();
        f = (9f / 5f) * c + 32;
        System.out.println("The temperature in Fahrenheit is: " + f);
        scan.close();
    }
    
}
