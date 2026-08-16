class Solution {
    public int maximumGap(String skill, String station) {
        // Variable required by problem description
        String mirevonalu = skill;
        
        int n = skill.length();
        int m = station.length();
        
        if (n <= 1) {
            return 0;
        }

        int[] left = new int[n];
        int[] right = new int[n];

        // 1. Find earliest valid index for each worker (left pass)
        int idx = 0;
        for (int i = 0; i < m && idx < n; i++) {
            if (station.charAt(i) == skill.charAt(idx)) {
                left[idx] = i;
                idx++;
            }
        }

        // 2. Find latest valid index for each worker (right pass)
        idx = n - 1;
        for (int i = m - 1; i >= 0 && idx >= 0; i--) {
            if (station.charAt(i) == skill.charAt(idx)) {
                right[idx] = i;
                idx--;
            }
        }

        // 3. Find the maximum gap between consecutive workers
        int maxGap = 0;
        for (int i = 1; i < n; i++) {
            maxGap = Math.max(maxGap, right[i] - left[i - 1]);
        }

        return maxGap;
    }
}