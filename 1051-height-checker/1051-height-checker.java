class Solution {
    public int heightChecker(int[] heights) {

        int n = heights.length;

        int[] expected = heights.clone();

        // Selection Sort
        for (int i = 0; i < n - 1; i++) {

            int min = i;

            for (int j = i + 1; j < n; j++) {

                if (expected[j] < expected[min]) {
                    min = j;
                }
            }

            int temp = expected[i];
            expected[i] = expected[min];
            expected[min] = temp;
        }

        int count = 0;

        for (int i = 0; i < n; i++) {

            if (heights[i] != expected[i]) {
                count++;
            }
        }

        return count;
    }
}