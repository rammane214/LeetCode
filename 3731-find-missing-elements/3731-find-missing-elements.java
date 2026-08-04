import java.util.*;

class Solution {
    public List<Integer> findMissingElements(int[] nums) {

        int min = nums[0];
        int max = nums[0];

        // Find minimum and maximum
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] < min) {
                min = nums[i];
            }

            if (nums[i] > max) {
                max = nums[i];
            }
        }

        // Store all elements
        HashSet<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        // Find missing elements
        List<Integer> result = new ArrayList<>();

        for (int i = min; i <= max; i++) {

            if (!set.contains(i)) {
                result.add(i);
            }
        }

        return result;
    }
}