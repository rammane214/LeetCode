class Solution {
    public int maxArea(int[] height) {
        int water = 0;
        int left = 0;
        int right = height.length - 1;

        while (left < right) {

            int area = Math.min(height[left], height[right]) * (right - left);

            water = Math.max(water, area);

            if (height[left] > height[right]) {
                right--;
            } else {
                left++;
            }
        }

        return water;
    }
}