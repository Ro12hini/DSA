import java.util.Scanner;

public class MaxOnes {
    
    public static int findMaxConsecutiveOnes(int[] nums) {
        // int max = 0;
        // for(int i=0; i<nums.length; i++){
        //     int count = 0;
        //     if(nums[i] == 1){
        //         while(i<nums.length && nums[i] == 1){
        //             count++;
        //             i++;
        //         }
        //         if(count > max){
        //             max = count;
        //         }
        //     }
        // }

        // return max;

        //easier method
        int max = 0;
        int count = 0;
        for(int i=0; i<nums.length; i++){
            if(nums[i] == 1){
                count++;
                if(count > max){
                    max = count;
                }
            }else{
                count = 0;
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
        
        System.out.println(findMaxConsecutiveOnes(nums));
    }
}
