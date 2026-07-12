import java.util.Scanner;

public class HalfDiamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                while(j <= i){
                    System.out.print("*");
                    j++;
                }
            }
            System.out.println();
        }

        for(int i=n-1; i>=1; i--){
            for(int j=1; j<=n-1; j++){
                while(j <= i){
                    System.out.print("*");
                    j++;
                }
            }
            System.out.println();
        }
    }
}
