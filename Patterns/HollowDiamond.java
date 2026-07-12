import java.util.Scanner;

public class HollowDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++){
            //top left
            for(int j=n; j>=1; j--){
                if(j >= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }

            //top right
            for(int j=n; j>=1; j--){
                if(n+2 <= i+j){
                    System.out.print(" ");
                }else{
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        
        for(int i=1; i<=n; i++){
            //bottom left
            for(int j=1; j<=n; j++){
                if(j <= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            
            //bottom-right
            for(int j=n; j>=1; j--){
                if(j <= i){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        //OR
        int stars = n;      // Each side starts with 'n' stars
        int spaces = 0;     // The gap starts at 0 spaces

        for (int i = 1; i <= 2 * n; i++) {
            // 1. Left side stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            
            // 2. Middle gap (2 * spaces)
            for (int j = 1; j <= 2 * spaces; j++) {
                System.out.print(" ");
            }
            
            // 3. Right side stars
            for (int j = 1; j <= stars; j++) {
                System.out.print("*");
            }
            
            System.out.println();
            
            // Adjust the counts for the next row
            if (i < n) {
                // Top half: stars decrease, spaces increase
                stars--;
                spaces++;
            } else if (i > n) {
                // Bottom half: stars increase, spaces decrease
                stars++;
                spaces--;
            }
            // Note: When i == n (the exact middle), we don't change anything 
            // because the middle two rows are identical.
        }
    }
}
