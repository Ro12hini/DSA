import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        int m = n, l = n;
        int d = 0;
        int sum = 0;
        while(l != 0){
            d++;
            l /= 10;
        }
        while(m != 0){
            int rem = m % 10;
            m /= 10;
            sum += Math.pow(rem, d);
        }

        if(sum == n){
            System.out.println("Armstrong");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
