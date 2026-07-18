import java.util.ArrayList;
import java.util.Scanner;

public class Missing {

    public static int missingNumber(int[] nums) {

        int ans = -1;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0; i<nums.length; i++){
            arr.add(nums[i]);
        }

        for(int i=0; i<nums.length+1; i++){
            if(!(arr.contains(i))){
                ans = i;
            }
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
        
        System.out.println(missingNumber(nums));
    }
}
