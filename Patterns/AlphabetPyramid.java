import java.util.Scanner;

public class AlphabetPyramid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        for(int i=1; i<=n; i++){
            char c = 'A';
            for(int j=n-1; j>=i; j--){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(c);
                c++;
            }
            c -= 2;
            for(int j=1; j<=(i-1); j++){
                System.out.print(c);
                c--;
            }
            System.out.println();
        }
    }
}
