import java.util.ArrayList;
import java.util.Scanner;

public class Divisors {

    public static int[] divisors(int n) {
        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if( n % i == 0){
                arr.add(i);
            }
        }

        int[] res = new int[arr.size()];
        for(int i=0; i<arr.size(); i++){
            res[i] = arr.get(i);
        }

        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        ArrayList<Integer> arr = new ArrayList<>();

        for(int i=1; i<=n; i++){
            if( n % i == 0){
                arr.add(i);
            }
        }

        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }
    }    
}
