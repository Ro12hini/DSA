import java.util.Scanner;

//It splits the array into two parts: a sorted portion (on the left) and an unsorted portion (on the right). 
//It picks elements from the unsorted portion one by one and "inserts" them into their correct position within the sorted portion.

public class InsertionSort {

    public static int[] insertionSort(int[] nums){

        for(int i=1; i<nums.length; i++){
            int key = nums[i]; 
            int j = i - 1;
            
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }

        return nums;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        insertionSort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
