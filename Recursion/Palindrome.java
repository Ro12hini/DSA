import java.util.Scanner;

public class Palindrome {

    public static boolean palindromeCheck(String s){
        if (s.length() <= 1) {
            return true;
        }

        char first = s.charAt(0);
        char last = s.charAt(s.length() - 1);
        if (first != last) {
            return false;
        }

        return palindromeCheck(s.substring(1, s.length() - 1));
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        sc.close();

        System.out.println(palindromeCheck(s));
    }
}