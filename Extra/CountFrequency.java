import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class CountFrequency {

    public static List<List<Integer>> countFrequencies(int[] nums) {
        // Your code goes here
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            hm.put(nums[i] , hm.getOrDefault(nums[i], 0)+1);
        }

        List<List<Integer>> result = new ArrayList<>();
        for(Map.Entry<Integer, Integer> e : hm.entrySet()){
            List<Integer> pair = new ArrayList<>();
            pair.add(e.getKey());
            pair.add(e.getValue());
            result.add(pair);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        sc.close();

        List<List<Integer>> result = countFrequencies(arr);
        for(int i=0; i<result.size(); i++){
            System.out.print(result.get(i) + " ");
        }
    }
}
