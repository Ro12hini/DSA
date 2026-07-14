import java.util.Scanner;

public class Gcd {

    public static int findgcd(int a, int b){
        if(b == 0){
            return a;
        }
        return findgcd(b, a%b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n1 = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        int gcd = findgcd(n1, n2);
        System.out.println(gcd);
    }
}
