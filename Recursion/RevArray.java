import java.util.Scanner;

public class RevArray {

    public static void reverse(int[] arr, int n){
        //in place
        if(n <= 1){
            return;
        }

        int start = (arr.length - n) / 2;
        int end = arr.length - 1 - start;

        int temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        reverse(arr, n-2);

        //to log
        // if(n == 0){
        //     return;
        // }
        // System.out.print(arr[n-1] + " ");
        // reverse(arr, n-1);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }

        sc.close();

        reverse(arr, n);
    }
}
