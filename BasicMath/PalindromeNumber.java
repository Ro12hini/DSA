import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = n;
        int rev = 0;
        sc.close();
        
        while(m != 0){
            int rem = m % 10;
            rev = (rev * 10) + rem;
            m /= 10;
        }

        if(rev == n){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a palindrome");
        }
    }
}
