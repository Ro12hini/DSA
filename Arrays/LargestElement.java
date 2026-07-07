import java.util.Scanner;

class LargestElement {
    public static int largestElement(int[] nums) {
        int max = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] > max){
                max = nums[i];
            }
        }

        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(largestElement(nums));
    }
}