import java.util.Scanner;

public class RecursiveInsertion {

    public static int[] insertionSort(int[] nums) {
        if(nums.length <= 1 || nums == null){
            return nums;
        }
        
        int r = nums[nums.length-1];
        int[] sub = new int[nums.length-1];
        for(int i=0; i<sub.length; i++){
            sub[i] = nums[i];
        }
        sub = insertionSort(sub);
        for(int i=0; i<sub.length; i++){
            nums[i] = sub[i];
        }

        int j = nums.length - 2;
        while(j >= 0 && nums[j] > r){
            nums[j+1] = nums[j];
            j--;
        }

        nums[j+1] = r;

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
