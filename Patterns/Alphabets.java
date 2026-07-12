import java.util.Scanner;

public class Alphabets {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        char c = 'A';
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                System.out.print(c);
            }
            System.out.println();
            c++;
            if(c > 'Z'){
                c = 'A';
            }
        }
    }
}
