import java.util.Scanner;

public class LinearSearch {

    public static int linearSearch(int nums[], int target) {
		//Your code goes here
        int idx = -1;

        for(int i=0; i<nums.length; i++){
            if(nums[i] == target){
                idx = i;
                return idx;
            }
        }
        return idx;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0; i<n; i++){
            nums[i] = sc.nextInt();
        }
        int t = sc.nextInt();
        sc.close();

        System.out.println(linearSearch(nums, t));
    }
}
