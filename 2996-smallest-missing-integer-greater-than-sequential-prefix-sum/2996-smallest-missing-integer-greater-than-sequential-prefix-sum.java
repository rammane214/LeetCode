 class Solution {
    public int missingInteger(int[] nums) {

        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            set.add(num);
        }

        int sum = nums[0];

        // Find the longest consecutive prefix sum
        for (int i = 1; i < nums.length; i++) {

            if (nums[i] == nums[i - 1] + 1) {
                sum += nums[i];
            } else {
                break;
            }
        }

        // Find the smallest integer >= sum
        // which is not present in the array
        while (set.contains(sum)) {
            sum++;
        }

        return sum;
    }
}