import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ArrayUnion {
    public static int[] unionArray(int[] nums1, int[] nums2) {
        ArrayList<Integer> res = new ArrayList<>();
        for(int i=0; i<nums1.length; i++){
            if(!res.contains(nums1[i])){
                res.add(nums1[i]);
            }
        }
        for(int i=0; i<nums2.length; i++){
            if(!res.contains(nums2[i])){
                res.add(nums2[i]);
            }
        }

        int[] ans = new int[res.size()];
        for(int i=0; i<res.size(); i++){
            ans[i] = res.get(i);
        }
        Arrays.sort(ans);

        return ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int[] nums1 = new int[n];
        for(int i=0; i<n; i++){
            nums1[i] = sc.nextInt();
        }
        int m =sc.nextInt();
        int[] nums2 = new int[n];
        for(int i=0; i<m; i++){
            nums2[i] = sc.nextInt();
        }
        sc.close();

        int[] result = unionArray(nums1, nums2);
        
        for(int i=0; i<result.length; i++){
            System.out.print(result[i] + " ");
        }
    }
}
