import java.util.Scanner;

//Bubble Sort: comparing adjacent elements and swapping them if they are out of order.
public class BubbleSort {
    
    public static int[] bubbleSort(int[] nums){

        for(int i=0; i<nums.length; i++){
            boolean swapped = false;
            for(int j=0; j<nums.length-1-i; j++){
                if(nums[j] > nums[j+1]){
                    int t = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = t;
                    swapped = true;
                }
            }
            if(!swapped){
                break;
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

        bubbleSort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
