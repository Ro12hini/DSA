// import java.util.HashMap;
// import java.util.Map;
// import java.util.ArrayList;
import java.util.Scanner;


public class RemoveDuplicates {

    public static int removeDuplicates(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        int i=0;
        for(int j=1; j<nums.length; j++){
            if(nums[j] != nums[i]){
                i++;
                nums[i] = nums[j];
            }
        }
        System.out.println();
        return i+1;
    }

    //For non-sorted array (Not optimal)

    // public static int removeDuplicates(int[] nums) {
    //     HashMap<Integer, Integer> hmap = new HashMap<>();
    //     for(int i=0; i<nums.length; i++){
    //         hmap.put(nums[i] , hmap.getOrDefault(nums[i],0)+1);
    //     }
    //     ArrayList<Integer> arr = new ArrayList<>();
        
    //     for(Map.Entry<Integer, Integer> e : hmap.entrySet()){
    //         if(!arr.contains(e.getKey())){
    //             arr.add(e.getKey());
    //         }
    //     }
    //     return arr.size();
    // }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(removeDuplicates(arr));
    }
}
