import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class HighestFrequency {

    public static int mostFrequentElement(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i], hm.getOrDefault(nums[i], 0)+1);
        }
        int max = 0;
        int ans = 0;
        for(Map.Entry<Integer, Integer> e : hm.entrySet()){
            if(e.getValue() > max){
                max = e.getValue();
                ans = e.getKey();
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        System.out.println(mostFrequentElement(arr));
    }
}
