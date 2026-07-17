import java.util.Scanner;

public class MoveZeroes {
    
    public static void moveZeroes(int[] nums) {
        int insPos = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i] != 0){
                int temp = nums[insPos];
                nums[insPos] = nums[i];
                nums[i] = temp;

                insPos++;
            }
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

        moveZeroes(nums);
        for(int i=0; i<n; i++){
            System.out.print(nums[i] + " ");
        }
    }
}
