import java.util.*;

public class Q_CountDistElemen {
    public static void main(String[] args) {
        int nums[] = { 4, 3, 2, 5, 6, 7, 3, 4, 2, 1 };

        // using Brute force method
        ArrayList<Integer> ans = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    ans.add(nums[i]);
                }

            }
        }
        int output = nums.length - ans.size();
        System.out.println(output);
        // Brute force method end here (time complexity O(n^2))
        // -------------------------------------------------------------------------------
        // Hashset method starts here

        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }
        System.out.println(set.size());

        // Hashset method end here (time complexity O(n))
    }
}
