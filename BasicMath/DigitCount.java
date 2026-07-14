import java.util.Scanner;

public class DigitCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        // Edge case: If the input is exactly 0, it has 1 digit
        if (n == 0) {
            System.out.println(1);
            return;
        }

        // Handle negative numbers if necessary
        if (n < 0) {
            n = -n;
        }

        int d = 0;
        while (n > 0) {
            n /= 10; // Removes the last digit
            d++;     // Increments the digit count
        }
        
        System.out.println(d);
    }
}