import java.util.Scanner;

public class lab3_7 {
    public static void main(String[] args) {
        String message;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter your name: ");
        message = scan.nextLine();
        System.out.println("You entered : \"" + message + "\"");
        scan.close();
    }
}
