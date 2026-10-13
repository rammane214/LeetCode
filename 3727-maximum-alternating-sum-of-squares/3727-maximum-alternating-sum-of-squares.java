import java.util.Arrays;

class Solution {
    public long maxAlternatingSum(int[] nums) {
        int n = nums.length;
        // Sabhi numbers ko long mein convert karke absolute values nikal lo aur sort karo
        long[] arr = new long[n];
        for (int i = 0; i < n; i++) {
            arr[i] = (long) Math.abs((long) nums[i]);
        }
        Arrays.sort(arr);
        
        long score = 0;
        int left = 0, right = n - 1;
        boolean add = true; // Alternating flag
        
        // Greedy approach: bade elements ko alternate positions par place karna
        while (left <= right) {
            if (add) {
                score += arr[right] * arr[right];
                right--;
            } else {
                score -= arr[left] * arr[left];
                left++;
            }
            add = !add;
        }
        
        return score;
    }
}