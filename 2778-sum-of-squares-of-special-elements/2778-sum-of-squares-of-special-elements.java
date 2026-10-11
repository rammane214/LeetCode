class Solution {
    public int sumOfSquares(int[] nums) {
        int n = nums.length;
        int sum = 0;
        
        // Iterate from 1 to n to handle 1-indexed condition
        for (int i = 1; i <= n; i++) {
            if (n % i == 0) {
                // nums[i - 1] corresponds to the 1-indexed element nums[i]
                int val = nums[i - 1];
                sum += val * val;
            }
        }
        
        return sum;
    }
}