import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        boolean p = true;

        if(n <= 1){
            p = false;
            System.out.println("Not prime");
            return;
        }
        if(n == 2){
            p = true;
            System.out.println("Prime");
            return;
        }

        if(n % 2 == 0){
            p = false;
            System.out.println("Not prime");
            return;
        }

        for(int i=3; i<= n/2; i++){
            if(n % i == 0){
                p = false;
            }
        }

        if(p){
            System.out.println("Prime");
        }else{
            System.out.println("Not prime");
        }
    }
}
