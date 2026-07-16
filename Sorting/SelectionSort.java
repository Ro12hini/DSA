import java.util.Scanner;

//Selection Sort
//You iterate through the unsorted portion of the array to find the index of the minimum element first. 
//Once you've found it, you perform exactly one swap per outer loop iteration.

public class SelectionSort {

    public static int[] selectionSort(int[] nums) {
        for(int i=0; i<nums.length; i++){
            int min = i;
            
            for(int j=i+1; j<nums.length; j++){
                if(nums[j] < nums[min]){
                    min = j;
                }
            }

            if(min != i){
                int t = nums[i];
                nums[i] = nums[min];
                nums[min] = t;
            }
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

        selectionSort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
