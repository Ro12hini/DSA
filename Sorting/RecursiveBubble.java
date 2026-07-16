import java.util.Scanner;

public class RecursiveBubble {
    
    public static int[] bubbleSort(int[] nums) {
        if(nums == null || nums.length <= 1){
            return nums;
        }

        boolean swapped = false;
        for(int i=0; i<nums.length-1; i++){
            if(nums[i] > nums[i+1]){
                int t = nums[i];
                nums[i] = nums[i+1];
                nums[i+1] = t;
                swapped = true;
            }
        }

        if(!swapped){
            return nums;
        }

        int r = nums[nums.length-1];
        int[] sub = new int[nums.length - 1];
        for(int i=0; i<sub.length; i++){
            sub[i] = nums[i];
        }

        sub = bubbleSort(sub);

        for(int i=0; i<sub.length; i++){
            nums[i] = sub[i];
        }
        nums[nums.length -1] = r;

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
