import java.util.Scanner;

public class RotateLeft {
    
    //to print
    // public static void rotateArrayByOne(int[] nums) {
    //     System.out.print("[");
    //     for(int i=1; i<nums.length; i++){
    //         System.out.print(nums[i] + ", ");
    //     }
    //     System.out.print(nums[0] + "]");
    // }

    //to change the array itself:
    public static void rotateArrayByOne(int[] nums) {
        int first = nums[0];
        for(int i=1; i<nums.length; i++){
            nums[i-1] = nums[i];
        }
        nums[nums.length - 1] = first;

        for(int i=0; i<nums.length; i++){
            System.out.print(nums[i] + " ");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        sc.close();

        rotateArrayByOne(nums);
    }
}
