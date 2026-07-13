import java.util.Scanner;

public class Butterfly{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++){
            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }

            //spaces
            for(int j= 2*(n-i); j>0; j--){
                System.out.print(" ");
            }

            //stars
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

        for(int i=1; i<n; i++){
            //stars
            for(int j=n-1; j>=i; j--){
                System.out.print("*");
            }

            //spaces
            for(int j=1; j<=i; j++){
                System.out.print("  ");
            }

            //stars
            for(int j=n-1; j>=i; j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}