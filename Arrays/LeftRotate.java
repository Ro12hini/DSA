import java.util.Scanner;

public class LeftRotate {
    
    public static void rotateArray(int[] nums, int k) {
        if(k > nums.length){
            k = k % nums.length;
        }
        int i=0;
        while(i != k){
            int f = nums[0];
            for(int j=1; j<nums.length; j++){
                nums[j-1] = nums[j];
            }
            nums[nums.length - 1] = f;
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        sc.close();

        rotateArray(nums, k);
        for(int i=0; i<n; i++){
            System.out.print(nums[i] + " ");
        }
    }
}