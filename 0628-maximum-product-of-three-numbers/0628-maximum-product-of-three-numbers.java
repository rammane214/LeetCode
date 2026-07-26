import java.util.Arrays;

class Solution {
    public int maximumProduct(int[] nums) {

        Arrays.sort(nums);

        int n = nums.length;

        // Option 1: Three largest numbers
        int option1 = nums[n - 1] * nums[n - 2] * nums[n - 3];

        // Option 2: Two smallest numbers and largest number
        int option2 = nums[0] * nums[1] * nums[n - 1];

        return Math.max(option1, option2);
    }
}