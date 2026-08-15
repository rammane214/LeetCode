import java.util.*;

class Solution {
    public int[] findErrorNums(int[] nums) {

        HashSet<Integer> set = new HashSet<>();

        int repeating = -1;
        int missing = -1;

        // Find repeating number
        for (int num : nums) {

            if (set.contains(num)) {
                repeating = num;
            }

            set.add(num);
        }

        // Find missing number
        for (int i = 1; i <= nums.length; i++) {

            if (!set.contains(i)) {
                missing = i;
                break;
            }
        }

        return new int[]{repeating, missing};
    }
}