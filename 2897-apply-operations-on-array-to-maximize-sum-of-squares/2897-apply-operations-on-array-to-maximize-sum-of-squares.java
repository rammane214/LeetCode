import java.util.List;

class Solution {
    public int maxSum(List<Integer> nums, int k) {
        int[] bitCount = new int[32];
        for (int num : nums) {
            for (int i = 0; i < 32; i++) {
                if ((num & (1 << i)) != 0) {
                    bitCount[i]++;
                }
            }
        }

        long[] arr = new long[nums.size()];
        for (int i = 31; i >= 0; i--) {
            for (int j = 0; j < bitCount[i]; j++) {
                arr[j] |= (1L << i);
            }
        }

        long mod = 1000000007;
        long totalSum = 0;
        for (int i = 0; i < k; i++) {
            totalSum = (totalSum + (arr[i] * arr[i]) % mod) % mod;
        }

        return (int) totalSum;
    }
}