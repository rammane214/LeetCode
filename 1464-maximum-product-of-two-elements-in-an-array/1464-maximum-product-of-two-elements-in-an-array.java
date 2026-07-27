class Solution {
    public int maxProduct(int[] nums) {
        Arrays.sort(nums);
        int i = nums[nums.length -1];
        int j = nums[nums.length - 2];
        int result = (i-1)*(j-1);
        return result;
    }
}