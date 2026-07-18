import java.util.Scanner;

public class QuickSort {

    //Another way
    /*
        public static int partition(int[] arr, int low, int high){
            int pivot = arr[high];
            int i = low - 1;

            for(int j=low; j<=high-1; j++){
                if(arr[j] < pivot){
                    i++;

                    int t = arr[i];
                    arr[i] = arr[j];
                    arr[j] = t;
                }
            }

            int t = arr[i+1];
            arr[i+1] = arr[high];
            arr[high] = t;

            return i+1;
        }

        public static void quickSort(int[] arr, int low, int high){
            if(low < high){
                int p = partition(arr, low, high);

                quickSort(arr, low, p-1);
                quickSort(arr, p+1, high);
            }
        }
    */

    public static int[] quickSort(int[] nums) {
        if(nums == null || nums.length <= 1){
            return nums;
        }
        sort(nums, 0, nums.length-1);
        return nums;
    }

    public static void sort(int[] nums, int l, int h){
        if(l >= h){
            return;
        }

        int pivot = nums[l + (h-l)/2];
        int i = l;
        int j = h;

        while(i <= j){
            while(nums[i] < pivot){
                i++;
            }
            while(nums[j] > pivot){
                j--;
            }

            if(i <= j){
                int t = nums[i];
                nums[i] = nums[j];
                nums[j] = t;
                i++;
                j--;
            }
        }

        if(l < j){
            sort(nums, l, j);
        }
        if(i < h){
            sort(nums, i, h);
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

        quickSort(arr);
        for(int i=0; i<n; i++){
            System.out.print(arr[i] + " ");
        }
    }
}