import java.util.Scanner;

public class SecondLargest {
    public static int secondLargestElement(int[] nums) {
        int secMax = -1;
        int max = -1;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }
        for(int i=0; i<nums.length; i++){
            if(nums[i] > secMax && nums[i] < max){
                secMax = nums[i];
            }
        }

        return secMax;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(secondLargestElement(nums));
    }
}
