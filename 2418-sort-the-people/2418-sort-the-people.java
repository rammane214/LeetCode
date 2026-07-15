class Solution {

    public String[] sortPeople(String[] names, int[] heights) {

        int n = heights.length;

        for (int i = 0; i < n - 1; i++) {

            int maxIndex = i;

            // Find maximum height
            for (int j = i + 1; j < n; j++) {

                if (heights[j] > heights[maxIndex]) {
                    maxIndex = j;
                }
            }

            // Swap heights
            int tempHeight = heights[i];
            heights[i] = heights[maxIndex];
            heights[maxIndex] = tempHeight;

            // Swap names
            String tempName = names[i];
            names[i] = names[maxIndex];
            names[maxIndex] = tempName;
        }

        return names;
    }
}