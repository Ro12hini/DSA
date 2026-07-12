import java.util.Scanner;

public class InvertedPatterns {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        
        // for(int i=1; i<=n; i++){
        //     char c = 'A';
        //     c += n-i;
        //     for(int j=1; j<=i; j++){
        //         System.out.print(c);
        //         c++;
        //     }
        //     c--;
        //     System.out.println();
        // }

        //OR
        for(int i=1; i<=n; i++){
            for(int j=n-i; j<n; j++){
                char c = (char)('A' + j);
                System.out.print(c);
            }
            System.out.println();
        }
    }
}
