import java.util.Scanner;

public class test3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String number;
        int n;
        do {
            System.out.print("Enter number: ");
            number = scanner.nextLine();
            n = number.length();
        } while(n > 4 || n != 4 || n < 4);
        for (int i = 0; i < n; i++) {
            System.out.print(number.charAt(i) + "   ");
        }
        scanner.close();
    }  
}
