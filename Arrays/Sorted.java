import java.util.ArrayList;
import java.util.Scanner;

public class Sorted {
    public static boolean isSorted(ArrayList<Integer> nums) {
        //your code goes here
        
        for(int i=0; i<nums.size()-1; i++){
                if(nums.get(i) > nums.get(i+1)){
                    return false;
                }
        }

        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> nums = new ArrayList<>();
        while(sc.hasNextInt()){
            nums.add(sc.nextInt());
        }
        sc.close();

        System.out.println(isSorted(nums));
    }
}
