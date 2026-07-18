import java.util.Scanner;

public class SingleNumber {

    public static int singleNumber(int[] nums) {
        //XOR of a number with itself gives the same number
        int ans = 0;
        for(int num : nums){
            ans ^= num;
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        sc.close();
        
        System.out.println(singleNumber(nums));
    }
}
