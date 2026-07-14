import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        sc.close();

        int rev = 0;
        
        // Loop runs until all digits are processed
        while (n != 0) {
            int rem = n % 10;         // 1. Extract the last digit
            rev = (rev * 10) + rem;   // 2. Push existing digits left and add the new digit
            n /= 10;                  // 3. Remove the last digit from n
        }

        System.out.println("Reversed number: " + rev);
    }
}