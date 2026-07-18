import java.util.Scanner;

public class LongestSubarray {
    
    public static int longestSubarray(int[] nums, int k) {
        int max = 0;
        int sum = 0;
        int left = 0;

        for (int right = 0; right < nums.length; right++) {
            // Expand the window by adding the current element
            sum += nums[right];

            // Shrink the window from the left if the sum exceeds k
            while (left <= right && sum > k) {
                sum -= nums[left];
                left++;
            }

            // If we hit the exact target, calculate the window length
            if (sum == k) {
                int currentLength = right - left + 1;
                if (currentLength > max) {
                    max = currentLength;
                }
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
        int k = sc.nextInt();
        sc.close();
        
        System.out.println(longestSubarray(nums, k));
    }
}
