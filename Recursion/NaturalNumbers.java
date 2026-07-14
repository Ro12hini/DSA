import java.util.Scanner;

public class NaturalNumbers {

    public static void printNatural(int n){
        if(n == 0){
            return ;
        }
        System.out.print(n + " ");
        printNatural(n-1);
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        printNatural(n);
    }
}
