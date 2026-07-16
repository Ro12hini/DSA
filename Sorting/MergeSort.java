import java.util.Scanner;

//It works by recursively dividing the input array into two halves,
//recursively sorting the two halves and finally merging them back together to obtain the sorted array.

public class MergeSort {

    public static int[] mergeSort(int[] nums) {

        if(nums == null || nums.length <= 1){
            return nums;
        }

        int[] temp = new int[nums.length];
        sort(nums, temp, 0, nums.length-1);
        
        return nums;
    }

    public static void sort(int[] nums, int[] temp, int l, int r){
        if(l >= r){
            return;
        }

        int mid = l + (r - l)/2 ;

        sort(nums, temp, l, mid);
        sort(nums, temp, mid+1, r);

        merge(nums, temp, l, mid, r);
    }

    public static void merge(int[] nums, int[] temp, int l, int mid, int r){
        for(int i=l; i<=r; i++){
            temp[i] = nums[i];
        }

        int i = l;
        int j = mid+1;
        int k = l;

        while(i <= mid && j <= r){
            if(temp[i] <= temp[j]){
                nums[k++] = temp[i++];
            }else{
                nums[k++] = temp[j++];
            }
        }

        while(i <= mid){
            nums[k++] = temp[i++];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        mergeSort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
    
}
